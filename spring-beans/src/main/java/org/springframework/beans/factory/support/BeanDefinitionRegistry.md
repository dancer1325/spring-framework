* == interface for registries / hold bean definitions (`RootBeanDefinition`, `ChildBeanDefinition`)
  * implemented by 
    * `BeanFactory`s / -- internally work with -- `AbstractBeanDefinition`
    * `DefaultListableBeanFactory`
    * `GenericApplicationContext`
  * 👁️ONLY interface | "org.springframework.beans.factory" / encapsulate registration of bean definitions 👁️	
* TODO: