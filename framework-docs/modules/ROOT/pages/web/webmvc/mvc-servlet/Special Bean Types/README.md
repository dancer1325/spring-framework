# == spring-managed POJO / implement framework contracts which
* built-in contracts
* customizable properties

# uses
* `DispatcherServlet` delegates to them for
  * processing requests
  * rendering responses

# detected by `DispatchServlet`
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