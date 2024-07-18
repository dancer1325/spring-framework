* == 👁️ main class / configures MVC Java config 👁️
  * ways to use it
    * ⭐ `@EnableWebMvc` | `@Configuration` class ⭐

        ```
        @EnableWebMvc
        @Configuration
        public class className ...
        ```
    * override methods one by one / extends `WebMvcConfigurationSupport`
  
        ```
        @Configuration
        public class className extends WebMvcConfigurationSupport { ...
        
        @override
        @Bean
        public ReturnType methodToOverride() { ... }
        ```
  * register
    * the `HandlerMapping`S
      * `RouterFunctionMapping`
        * order -1
        * -- map -- `RouterFunction`
      * `RequestMappingHandlerMapping`
        * order 0
        * incoming requests -- are mapped to -- controller's methods
      * `HandlerMapping`
        * order -1
        * URL paths -- are mapped directly to -- view names
      * `BeanNameUrlHandlerMapping`
        * order 2
        * URL paths -- are mapped to -- controller bean names
      * `HandlerMapping`
        * order Integer.MAX_VALUE-1
        * -- serve -- static resource requests
      * `HandlerMapping`
        * order Integer.MAX_VALUE
        * -- forward requests to the -- default servlet 
    * the `HandlerAdapter`S
      * `RequestMappingHandlerAdapter`
      * `HttpRequestHandlerAdapter`
      * `SimpleControllerHandlerAdapter`
      * `HandlerFunctionAdapter`
    * `HandlerExceptionResolverComposite` / delegates to
      * `ExceptionHandlerExceptionResolver`
      * `ResponseStatusExceptionResolver`
      * `DefaultHandlerExceptionResolver`
    * `AntPathMatcher` & `UrlPathHelper` / used by
      * `RequestMappingHandlerMapping`
      * `HandlerMapping` | ViewController
      * `HandlerMapping` -- for -- serving resources
  * `RequestMappingHandlerAdapter` & `ExceptionHandlerExceptionResolver` -- are configured by default with -- default instances of
    * `ContentNegotiationManager`
    * `DefaultFormattingConversionService`
    * `OptionalValidatorFactoryBean`
    * if JSR-303 implementation available | classpath -> range of `HttpMessageConverter` -- depending on -- TP libraries | classpath