

# DashboardGadget

Details of a gadget.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The ID of the gadget instance. |  [readonly] |
|**moduleKey** | **String** | The module key of the gadget type. |  [optional] [readonly] |
|**uri** | **String** | The URI of the gadget type. |  [optional] [readonly] |
|**color** | [**ColorEnum**](#ColorEnum) | The color of the gadget. Should be one of &#x60;blue&#x60;, &#x60;red&#x60;, &#x60;yellow&#x60;, &#x60;green&#x60;, &#x60;cyan&#x60;, &#x60;purple&#x60;, &#x60;gray&#x60;, or &#x60;white&#x60;. |  [readonly] |
|**position** | [**DashboardGadgetPosition**](DashboardGadgetPosition.md) |  |  |
|**title** | **String** | The title of the gadget. |  [readonly] |



## Enum: ColorEnum

| Name | Value |
|---- | -----|
| BLUE | &quot;blue&quot; |
| RED | &quot;red&quot; |
| YELLOW | &quot;yellow&quot; |
| GREEN | &quot;green&quot; |
| CYAN | &quot;cyan&quot; |
| PURPLE | &quot;purple&quot; |
| GRAY | &quot;gray&quot; |
| WHITE | &quot;white&quot; |



