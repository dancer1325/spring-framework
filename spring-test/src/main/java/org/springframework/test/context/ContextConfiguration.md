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
* TODO: