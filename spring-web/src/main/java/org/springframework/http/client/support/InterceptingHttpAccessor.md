* == base class for HTTP accessing gateway helpers (_Example:_ `RestTemplate`) /
  * adds interceptor properties -- to `HttpAccessor`'s properties
* recommendations
  * 👁️NOT use directly 👁️
    * == -- use through -- some gateway helper (_Example:_ `RestTemplate`)
* `void setInterceptors(List<ClientHttpRequestInterceptor> interceptors)`
  * set the interceptors / accessor should use
  * interceptors -- are immediately sorted, based on -- `AnnotationAwareOrderComparator.sort()`
  * NOT support concurrent changes & NOT be called | after initialization startup
* TODO: