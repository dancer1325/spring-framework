* 👀== Abstract implementation of `org.springframework.context.ApplicationContext` 👀 /
  * ❌NOT mandate the type of storage / -- used for -- configuration ❌
  * implements 
    * COMMON context functionality
    * resource loading -- by extending -- `DefaultResourceLoader`
      * -> NON-URL resource paths / `.getResourceByPath()` NOT override | subclass -- are treated as -- class path resources
  * uses the Template Method design pattern
    * == require concrete subclasses -- to -- implement abstract methods

* AUTOMATICALLY registers 
  * the NEXT beans / defined | context
    * `BeanFactoryPostProcessors`
    * `BeanPostProcessors`
    * `ApplicationListeners`
  * Reason: 🧠ApplicationContext detect special beans / defined | its internal bean factory 🧠
    * plain `BeanFactory` is NOT able to do it 
 
* if you do NOT supply a
  * `MessageSource` bean (/ name "messageSource") | context -> message resolution -- is delegated to the -- parent context
  * multicaster for application events -- via -- "applicationEventMulticaster" bean of type `ApplicationEventMulticaster` | context -> it's used a default multicaster of type `SimpleApplicationEventMulticaster`

* TODO:
