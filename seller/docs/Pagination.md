

# Pagination

Present only when the endpoint pages. Absent — not null — when it returns everything.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**page** | **Integer** | 1-indexed page number. | 
**limit** | **Integer** | Rows per page. | 
**total** | **Integer** | Total matching rows, when the endpoint counts them. |  [optional]
**totalPages** | **Integer** | Derived from total and limit. |  [optional]



