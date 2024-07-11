* := Spring-managed `Object` instances / implement framework contracts
  * built-in contract
  * contracts -- can be customized via -- properties
* uses
  * `DispatcherServlet` -- delegates to these special beans to --
    * process requests and
    * render the appropriate responses
* cases detected by `DispatchServlet`
  * `HandlerMapping`
    * request + interceptors — are mapped to → handler -- Check `HandlerMapping.getHandler()` --
    * main `HandlerMapping` implementations
      * `RequestMappingHandlerMapping`
        * supports `@RequestMapping` on methods  -- TODO: How to check? --
      * `SimpleUrlHandlerMapping`
        * keeps URI path patterns — to — handlers  -- Check `SimpleUrlHandlerMappingTests` --
  * `HandlerAdapter`
    * helps `DispatcherServlet` for invoking a handler — mapped to a — request -- TODO: How to check? --
  * `HandlerExceptionResolver`
    * Check '/Exceptions'
  * `ViewResolver`
    * Check '/View resolution'
  * `LocalResolver` | `LocaleContextResolver`
    * Check '/Locale'
  * `ThemeResolver`
    * Check '/Themes'
  * `MultipartResolver`
    * Check '/Multipart Resolver'
  * `FlashMapManager`
    * Check '/../Annotated controllers/Flash attributes'