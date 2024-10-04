* == factory hook /
  * allows
    * customization of new bean instances
  * types
    * populate beans -- via -- marker interfaces
      * -> implement `.postProcessBeforeInitialization()`
    * populate beans -- via -- proxies
      * -> implement `.postProcessAfterInitialization()`
* factory hook
  * := technique of software design /
    * methods can be customized | creation of objects
  * uses
    * | factory pattern
* registration
  * `ApplicationContext`
    * can 
      * autodetect `BeanPostProcessor` | its bean definitions
      * apply the post-processors | ANY bean / subsequently created
  * `BeanFactory`
    * can
      * register programmatic post-processors | ALL beans / created -- via -- `BeanFactory`
* ordering
  * `BeanPostProcessor` beans /
    * autodetected | `ApplicationContext` -- are ordered, based on --
      * `PriorityOrdered`
      * `Ordered`
    * registered via `BeanPostProcessor` -- are ordered ONLY, based on -- order of registration
* TODO: