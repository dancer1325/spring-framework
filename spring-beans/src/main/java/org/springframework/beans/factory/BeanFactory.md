* == root interface -- for -- accessing to Spring bean container
  * == central registry of application components & their configurations
    * Check "Expert One-On-One J2EE Design and Development" -- Chapter 4 --
  * some implementations
    * goal
      * hold bean definitions / -- uniquely identified by a -- `String` name
        * factory -- will return
          * based on the bean definition --   
            * independent instance of a contained object (== Prototype design pattern) OR
            * single shared instance (== Singleton design pattern)
          * based on the concrete application context & Spring v2+ --
            * further scopes (_Example:_ "request" & "session" scopes | web environment)
        * ways to store them
          * LDAP
          * RDBMS
          * XML
          * .properties
    * _Example:_
      * `ListableBeanFactory`
      * `ConfigurableBeanFactory`
  * ALL implementations -- should support -- standard bean lifecycle interfaces
    * initialization method order
      * `BeanNameAware`'s `.setBeanName()`
      * `BeanClassLoaderAware`'s `.setBeanClassLoader()`
      * `BeanFactoryAware`'s `.setBeanFactory()`
      * `EnvironmentAware`'s `.setEnvironment()`
      * `EmbeddedValueResolverAware`'s `.setEmbeddedValueResolver()`
      * if running | `ApplicationContext` -> `ResourceLoaderAware`'s `.setResourceLoader()`
      * if running | `ApplicationContext` -> `ApplicationEventPublisherAware`'s `.setApplicationEventPublisher()`
      * if running | `ApplicationContext` -> `MessageSourceAware`'s .`setMessageSource()`
      * if running | `ApplicationContext` -> `ApplicationContextAware`'s `.setApplicationContext()`
      * if running | `ApplicationContext` -> `ServletContextAware`'s `.setServletContext()`
      * `BeanPostProcessors.postProcessBeforeInitialization()`
      * `InitializingBean`'s `.afterPropertiesSet()`
      * custom `init{}`
      * `BeanPostProcessors.postProcessAfterInitialization()`
    * shutdown method order
      * `DestructionAwareBeanPostProcessors`'s `.postProcessBeforeDestruction()`
      * `DisposableBean`'s  `.destroy()`
      * custom `destroy{}`
* Dependency Injection vs `BeanFactory`
  * about configuration of applications
    * Dependency Injection  -- "push" model
      * -- via -- setters or constructors
      * 👁️recommended 👁️
      * -- implemented via -- `BeanFactory` + 's subinterfaces
    * `BeanFactory` -- "pull" model
      * == lookup
* TODO: