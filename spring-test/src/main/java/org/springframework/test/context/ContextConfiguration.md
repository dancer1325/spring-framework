* TODO:
* `String[] locations`
  * := resource locations -- for loading an -- `ApplicationContext`
  * Check 
    * `loader()` -- to check the -- `AbstractContextLoader` / be used
    * `AbstractContextLoader.modifyLocations`
    * `AbstractContextLoader.generateDefaultLocations`
  * vs `value()`
    * can NOT be used together
    * one as replacement of the other
* `Class<?>[] classes()`
  * := component classes -- for loading an -- `ApplicationContext`
  * Check
    * `loader()` -- to check the -- `AbstractContextLoader` / be used
    * `AnnotationConfigContextLoader.detectDefaultConfigurationClasses`
* TODO: