* := interface /
  * == callback methods
    * `configureViewResolvers(ViewResolverRegistry registry)`
      * uses
        * String viewName / returned from controllers -- are translated to -- concrete View implementations
    * TODO:
  * allows
    * customizing Java-based configuration for Spring MVC
  * way to use it
    
    ```
    @EnableWebMvc
    pulic class WebConfig implements WebMvcConfigurer {
    ```
