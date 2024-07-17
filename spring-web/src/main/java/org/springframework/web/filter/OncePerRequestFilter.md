* == filter base class / 
  * 👁️ guarantee 1! execution | ANY servlet container / request 👁️
* filter
  * -- can be invoked as part of --
    * `jakarta.servlet.DispatcherType.REQUEST`
    * `jakarta.servlet.DispatcherType.ASYNC`
      * -> configure it in "web.xml"
      * if servlet containers / different default configuration & you want to declare if are statically invoked 1! -> subclasses can override `.shouldNotFilterAsyncDispatch()` (?)
        * 👁️complementary of "web.xml" configuration 👁️
    * `jakarta.servlet.DispatcherType.ERROR`
      * occurs | own thread
      * if subclasses want to declare if are statically invoked 1! | error dispatches -> subclasses can override `.shouldNotFilterErrorDispatch()` 
  * subclasses can use
    * `.isAsyncDispatch(HttpServletRequest)`
      * determine if filter is invoked as -- part of async dispatch
    * `.isAsyncStarted(HttpServletRequest)`
      * determine WHEN filter is placed as -- async mode -> current dispatch is NOT last one / given request
  * `.getAlreadyFilteredAttributeName()`
    * identify if a request is ALREADY filtered
    * default implementation -- is based on -- concreteFilterInstance's configuredName