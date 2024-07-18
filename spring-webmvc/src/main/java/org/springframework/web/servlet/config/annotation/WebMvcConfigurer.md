* := interface /
  * == callback methods
    * `configureViewResolvers(ViewResolverRegistry registry)`
      * uses
        * String viewName / returned from controllers -- are translated to -- concrete View implementations
    * `configureMessageConverters(List<HttpMessageConverter<?>> converters)`
      * configure `HttpMessageConverter`S for
        * -- reading from -- request body
        * -- writing to -- response body
      * 👁️ if ALL TP libraries (_Example:_ Jackson JSON, JAXB2) are | classpath -> ALL built-in converters are configured 👁️
      * ⚠️ if you use it
        * | ONLY Spring-> default converter registration is override ⚠️
        * | Spring Boot -- via `WebMvcAutoConfiguration` -- default converters + (NOT override) converters added ⚠️
      * alternative
        * `extendMessageConverters(List)`
    * `extendMessageConverters(List<HttpMessageConverter<?>> converters)`
      * allows
        * extending a list of converters | 👁️ initialized or default one 👁️
          * ⚠️ order of converters is important -- crucial for clients / accept `MediaType.ALL` -- ⚠️
    * TODO:
  * allows
    * customizing Java-based configuration for Spring MVC
  * way to use it
    
    ```
    @EnableWebMvc
    pulic class WebConfig implements WebMvcConfigurer {
    ```
