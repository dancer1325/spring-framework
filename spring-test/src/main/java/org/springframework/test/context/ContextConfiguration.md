* `@ContextConfiguration`
  * := annotation /
    * uses
      * | test class
        * for integration tests : define metadata -- to determine how to -- load & configure `org.springframework.context.ApplicationContext`
      * meta-annotation -- to create -- custom <em>composed annotations</em> 
  * supported Resource Types
    * Context loaders
      * MAY choose to support 
        * path-based resource locations 
          * supported files
            * .xml -- MOST common one --
            * Groovy scripts -> place | classpath 
            * those / supported by TP frameworks
          * ways to declare it
            * `locations`
            * `value`
        * class-based resources
          * ways to declare it
            * `classes`
      * `SmartContextLoader`
        * MOST implementations of it, ONLY support 1! resource type
  * Component Classes
    * ==
      * class / 
        * annotated with
          * `org.springframework.context.annotation.Configuration` 
          * `org.springframework.stereotype.Component`
          * `org.springframework.stereotype.Service`
          * `org.springframework.stereotype.Repository`
        * contains `org.springframework.context.annotation.Bean`-methods
        * -- intended to be registered as a -- Spring component (== Spring bean | ApplicationContext) 
      * JSR-330 compliant class / annotated with `jakarta.inject` annotations 
    * bean / EACH component class | `ApplicationContext` -- will be -- registered
      * uses
        * be injected |
          * OTHER beans or
          * instance of the test class
    * see
      * `org.springframework.context.annotation.Configuration`
      * `org.springframework.context.annotation.Bean`
  * | Spring Framework v5.3+,
    * this annotation -- will be inherited, by default, from an -- enclosing test class
      * see `@NestedTestConfiguration`
* TODO:
* `String[] locations`
  * := resource locations -- for loading an -- `ApplicationContext`
  * Check 
    * `loader()` -- to check the -- `AbstractContextLoader` / be used
      * if default == `AbstractContextLoader` 
        * `AbstractContextLoader.modifyLocations`
        * `AbstractContextLoader.generateDefaultLocations`
      * if you use an `AbstractContextLoader` subclass
        * _Example1:_ `GenericXmlContextLoader`
        * _Example2:_ `GenericGroovyXmlContextLoader`
  * vs `value()`
    * can NOT be used together
    * one as replacement of the other
* `Class<?>[] classes()`
  * := component classes -- for loading an -- `ApplicationContext`
  * Check
    * `loader()` -- to check the -- `AbstractContextLoader` / be used
    * `AnnotationConfigContextLoader.detectDefaultConfigurationClasses`
* `ApplicationContextInitializer<?>>[] initializers`
  * TODO:
* `ContextLoader> loader()`
  * TODO:
* TODO: