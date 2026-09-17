

# CreateMagicScanSynthesizeResponsePayloadSectionApplicability

Deterministic (NO-AI) applicability hint for the heavyweight optional  form sections (vehicle compatibility, EU EPR / energy label, hazmat).  Computed from the resolved category + seller region via  `applicableOptionalSections`; the form pre-checks each section's  \"this item needs …\" toggle from it. Additive + best-effort.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vehicleCompat** | **Boolean** | eBay Motors / Parts vehicle-fitment (compatibilityList). | 
**epr** | **Boolean** | EU/UK Extended Producer Responsibility (packaging/e-waste schemes). | 
**energyLabel** | **Boolean** | EU energy-efficiency label (fridges, TVs, lighting, appliances). | 
**hazmat** | **Boolean** | Hazmat classification (battery/aerosol/flammable/liquid/chemical). | 



