package net.crossly.client;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Auto-pagination over Crossly list endpoints, which all answer {@code { data, pagination }} and page with
 * {@code page} (1-based) and {@code limit}.
 *
 * Pages are fetched lazily, one request per page, as the iteration reaches them. It stops at
 * {@code pagination.totalPages}; when the response carries no pagination the endpoint returned everything in one
 * page; when it carries pagination without a total, a short page is the last one.
 *
 * Shared, byte for byte, by the seller and buyer packages. Use it through {@code Crossly.paginate} /
 * {@code Crossly.stream} (seller) or {@code CrosslyBuyer.paginate} / {@code CrosslyBuyer.stream} (buyer), which turn
 * API failures into {@link CrosslyException}.
 */
public final class Pages {
  /** The default page size: the API's own default, and inside every list endpoint's maximum. */
  public static final int DEFAULT_LIMIT = 25;

  private Pages() {}

  /** Fetch one page. */
  @FunctionalInterface
  public interface Fetcher<R> {
    R fetch(int page, int limit) throws Exception;
  }

  public static <R, T> Iterable<T> iterate(
      final int limit,
      final Fetcher<R> fetch,
      final Function<R, List<T>> items,
      final Function<Exception, RuntimeException> onError) {
    if (limit < 1) throw new IllegalArgumentException("limit must be >= 1");
    return new Iterable<T>() {
      @Override
      public Iterator<T> iterator() {
        return new Iterator<T>() {
          private int page = 1;
          private boolean done;
          private Iterator<T> current = Collections.<T>emptyIterator();

          @Override
          public boolean hasNext() {
            while (!current.hasNext() && !done) {
              R response;
              try {
                response = fetch.fetch(page, limit);
              } catch (Exception e) {
                done = true;
                throw onError.apply(e);
              }
              List<T> data = response == null ? null : items.apply(response);
              Object pagination = response == null ? null : call(response, "getPagination");
              Number totalPages = asNumber(call(pagination, "getTotalPages"));
              Number pageLimit = asNumber(call(pagination, "getLimit"));
              if (data == null || data.isEmpty() || pagination == null) {
                done = true;
              } else if (totalPages != null) {
                done = page >= totalPages.intValue();
              } else {
                done = data.size() < (pageLimit != null ? pageLimit.intValue() : limit);
              }
              page++;
              current = data == null ? Collections.<T>emptyIterator() : data.iterator();
            }
            return current.hasNext();
          }

          @Override
          public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            return current.next();
          }
        };
      }
    };
  }

  public static <R, T> Stream<T> stream(
      int limit, Fetcher<R> fetch, Function<R, List<T>> items, Function<Exception, RuntimeException> onError) {
    return StreamSupport.stream(iterate(limit, fetch, items, onError).spliterator(), false);
  }

  private static Object call(Object target, String getter) {
    if (target == null) return null;
    try {
      Method m = target.getClass().getMethod(getter);
      return m.invoke(target);
    } catch (ReflectiveOperationException e) {
      return null;
    }
  }

  private static Number asNumber(Object o) {
    return o instanceof Number ? (Number) o : null;
  }
}
