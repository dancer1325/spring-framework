* `TestContext`
  * 👀encapsulates the context | test is executed 👀
  * agnostic of the testing framework
  * concrete implementations 
    * recommended
    * use cases
      * implement a copy constructor /
        * `TestContext`'s immutable state & attributes -- are used as template for -- additional contexts / created for parallel test execution 
        * MUST accept 1! argument / 's type == concrete implementation's type
        * implementation / NOT provide it -> environment / executes tests concurrently
      * | Spring Framework 6.1, implementation / override 
        * `setMethodInvoker(MethodInvoker)`
        * `getMethodInvoker()`