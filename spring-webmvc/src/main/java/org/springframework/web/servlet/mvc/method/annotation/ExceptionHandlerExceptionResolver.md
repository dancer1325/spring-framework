* == `AbstractHandlerMethodExceptionResolver` /
  * exceptions -- are resolved through -- `@ExceptionHandler` methods
  * can customize
      * arguments -- via -- 
        * `.setCustomArgumentResolvers()` or
        * `.setArgumentResolvers()`
      * returned value types -- via -- 
        * `.setCustomReturnValueHandlers()` or
        * `.setReturnValueHandlers()`