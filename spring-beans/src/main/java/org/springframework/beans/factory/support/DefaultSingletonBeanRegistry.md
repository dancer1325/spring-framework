* == generic registry -- for -- shared bean instances
  * -- via -- implementing `SingletonBeanRegistry`
  * allows
    * registering singleton instances /
      * -- should be shared for -- ALL callers
      * -- obtained via -- bean name
    * registering `DisposableBean` instances /
      * -- might or NOT correspond to -- registered singletons
      * are destroyed | shutdown of the registry
      * if you want to shut down beans in certain order -> register dependencies between beans
  * uses
    * base class for `BeanFactory` implementations / factor out the management of singleton bean instances
  * vs `AbstractBeanFactory` & `DefaultListableBeanFactory`
    * NOT assume
      * bean definition concept
      * specific creation process for bean instances
* `Map<String beanName, Object beanInstance> singletonObjects`
  * == 👁️cache of singleton objects 👁️
* TODO: