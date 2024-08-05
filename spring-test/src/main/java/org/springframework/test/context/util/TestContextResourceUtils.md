* TODO:
* `convertToClasspathResourcePaths(, preservePlaceholders, inputPaths)`
  * 👁️`inputPaths` -- are converted to -> classpath resource paths 👁️
    * if `inputPath` is a plain path (_Example:_ "context.html") -- relative path / prefixed with `classpath:`
    * if `inputPath` starts with `/` (_Example:_ "/org/context.html") -- absolute path / prefixed with `classpath:`
    * if `inputPath` prefixed with a URL protocol (_Example:_ `classpath:`, `file:`, `http:`) -- protocol NOT modified
    * if `preservePlaceholders!=true` OR `inputPaths` / NOT have "placeholder.name" -> apply `StringUtils.cleanPath()`
* TODO: