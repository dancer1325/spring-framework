* extends `AbstractHandlerMethodAdapter` / 
  * supports `HandlerMethod`S / -- annotated with -- `@RequestMapping`
  * can customize
    * arguments -- via -- 
      * `.setCustomArgumentResolvers()` or
      * `.setArgumentResolvers()`
    * returned value types -- via -- 
      * `.setCustomReturnValueHandlers()` or
      * `.setReturnValueHandlers()`