* TODO:
* `modifyLocations()`
  * logic
    * `TestContextResourceUtils.convertToClasspathResourcePaths()` by default
    * -- can be override by -- subclasses
* `generateDefaultLocations(inputClass)`
  * based on `inputClass` -- generate -- default classPath resource locations
    * _Example:_ if `inputClass=com.example.MyTest` -> default classPath resource locations = "classpath:com/example/MyTest<Sufix>" / <Sufix> =  `getResourceSuffixes()[0]`
  * -- can be override by -- subclasses
* TODO: