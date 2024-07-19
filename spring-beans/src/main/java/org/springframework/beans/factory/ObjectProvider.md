* == variant of `ObjectFactory` / 👁️designed for injection points 👁️
  * allows
    * programmatic optionality
    * lenient NOT-unique handling
* ALL `ObjectProvider` / got from `BeanFactory`, -- is bound to -- `BeanFactory`
  * | specific bean type
  * / ALL provider calls -- match against -- factory-registered bean definitions
* extends `Iterable` -> uses
  * `for` loops
  * `forEach` iteration
* `Stream` support -> collection-style stream access
* exist default implementations | ALL methods
