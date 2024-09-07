* == variant of `ApplicationContext` | web applications
* allows
  * configuring a web application
* ⚠️if application is running -> read-only ⚠️
* if the application supports reloading -> it can be reloaded
* `ServletContext getServletContext();`
  * added to the `ApplicationContext`
* are hierarchical
  * == `ApplicationContext`
  * 1! root context / application + child context / servlet
* `WebApplicationContext` implementations need to
  * detect `ServletContextAware` beans
  * invoke `.setServletContext` accordingly