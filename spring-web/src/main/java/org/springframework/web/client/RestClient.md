* == client / 
  * uses
    * perform HTTP requests
  * expose an API
    * fluent
    * synchronous 
    * -- over -- HTTP client libraries
      * _Example:_ "java.net.http"
  * ways to create an instance
    * `.create()`
    * `.create(String)`
    * `.builder()`
    * `.create(RestTemplate)` & `.builder(RestTemplate)`
* infrastructure shared with `RestTemplate`
  * `ClientHttpRequestFactory`
  * `ClientHttpRequestInterceptor`
  * `ClientHttpRequestInitializer`
  * `HttpMessageConverter`
