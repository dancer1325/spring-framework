* := MVC SPI /
  * allows
    * parameterization of the core MVC
  * if you want to handle a request -> implement it / handler type
  * uses
    * extends indefinitely the `DispatcherServlet`
    * ⭐ by `DispatcherServlet` -- to access to -- ALL installed handlers ⭐
      * 👁️ -> `DispatcherServlet` does NOT contain specific-code / handler type == main purpose of `HandlerAdapter` 👁️
    * normally
      * NOT for application developers
      * web workflow developers
    * if you are going to implement -> + `Ordered`
  * _Example of implementations_
    * `SimpleControllerHandlerAdapter`
    * `SimpleServletHandlerAdapter`
* Handler (TODO: Which does concrete entity refer here?) 's type can be `java.lang.Object` ->
  * handlers from other frameworks -- can be integrated WITHOUT custom coding with -- Spring
  * annotation-driven handler objects / NOT obey ANY specific Java interface (?)