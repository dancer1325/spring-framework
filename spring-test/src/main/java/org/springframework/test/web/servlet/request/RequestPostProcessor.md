* uses
  * by applications or TP libraries / want further initialize  `MockHttpServletRequest`
* implementations on it -- can be provided to -- `MockHttpServletRequestBuilder.with()` | request is to be constructed
* `MockHttpServletRequest postProcessRequest(){}`
  * post-process `MockHttpServletRequest` | after creation & initialization -- through -- `MockHttpServletRequestBuilder`
* TODO: