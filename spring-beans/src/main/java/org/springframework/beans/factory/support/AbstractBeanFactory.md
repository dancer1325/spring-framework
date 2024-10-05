* == abstract base class -- for -- `BeanFactory` implementations /
  * provide
    * ALL capabilities of `ConfigurableBeanFactory`
    * singleton cache
      * -- via -- `DefaultSingletonBeanRegistry`
    * singleton/prototype determination
      * -- via -- `FactoryBean`
    * handling, aliases, bean merging for child bean definitions & bean destruction
      * -- via -- `DisposableBean`
    * bean factory hiearchy
      * -- via -- `HierarchicalBeanFactory`
  * uses
    * base class -- for -- `BeanFactory` implementations / bean definitions -- got from -- backend resource
      * Reason: 🧠️NOT assume a listable bean factory 🧠
  * main methods
    * `.getBeanDefinition()`
      * _Example:_ of implementations, `DefaultListableBeanFactory` & `AbstractAutowireCapableBeanFactory`
    * `.createBean()`
      * _Example:_ of implementations, `DefaultListableBeanFactory` & `AbstractAutowireCapableBeanFactory`
* `<T> T doGetBean(String, @Nullable Class<T>, @Nullable Object[], boolean){}`
  * return an instance of the bean / can be 
    * shared or
    * independent
* TODO:
