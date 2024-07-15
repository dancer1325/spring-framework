* := interface / 
  * uses
    * objects / have a mapping between requests -- handler objects
  * implementations
    * available ones
      * built-in implementations
        * `BeanNameUrlHandlerMapping`
        * `SimpleUrlHandlerMapping`
        * `RequestMappingHandlerMapping`
          * 👁️ default one 👁️ == if NO HandlerMapping bean is registered -> it's used
      * created by your own
    * characteristics
      * support (but NOT needed) mapped interceptors
      * ⭐ ALWAYS wrapped in a `HandlerExecutionChain` ⭐ / optionally can have `HandlerInterceptor`
        * if `DispatcherServlet` -- calls --  `HandlerExecutionChain` executed order is
          * `HandlerInterceptor` 's `preHandle()`S
          * if ALL were true -> handler itself
    * -- can implement -- `Ordered`
      * == -- order to be applied by -- `DispatcherServlet`