* := functional interface
* `void match(MvcResult result) throws Exception;`
  * functional method /
    * assert the result | given `MvcResult` -- against -- some expectation
      * `MvcResult` == result of executed request
* check `MockMvcResultMatchers`