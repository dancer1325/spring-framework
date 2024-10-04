* == bean factory /
  * -- based on -- bean definition metadata
  * extensible
    * -- via -- post-processors
  * default implementation of
    * `ConfigurableListableBeanFactory` &
    * `BeanDefinitionRegistry`
  * uses
    * register ALL bean definitions / before accessing beans
      * -> 👁️bean lookup by name is an inexpensive operation | local bean definition table 👁️
* readers of specific bean definition formats -- are implemented -- separately
  * != bean factory subclasses
  * _Example:_ `XmlBeanDefinitionReader`
* `StaticListableBeanFactory`
  * alternative / -- based on -- bean definitions
    * manage bean instances (!= create new ones)
* TODO: