* == default implementation of `HandlerExceptionResolver`/
  * standard Spring MVC exceptions -- are resolved & translated to -- HTTP status codes
    * `HttpRequestMethodNotSupportedException` -- 405
    * `HttpMediaTypeNotSupportedException` -- 415
    * `HttpMediaTypeNotAcceptableException` -- 406
    * `MissingPathVariableException`, `ConversionNotSupportedException`, `HttpMessageNotWritableException`, `MethodValidationException` -- 500
    * `MissingServletRequestParameterException`, `MissingServletRequestPartException`, `ServletRequestBindingException`, `TypeMismatchException`, `HttpMessageNotReadableException`, `MethodArgumentNotValidException`, `HandlerMethodValidationException` -- 400
    * `NoHandlerFoundException`, `NoResourceFoundException` -- 404
    * `AsyncRequestTimeoutException` -- 503
    * `AsyncRequestNotUsableException` -- NOTHING (?)
  * by default, enabled in `DispatcherServlet`
