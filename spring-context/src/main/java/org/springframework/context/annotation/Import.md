* allows
  * importing \>=1 <em>component classes</em>
    * _Example:_ `@Configuration` classes, `ImportSelector`, `ImportBeanDefinitionRegistrar`
    * == | Spring v4.2+, `AnnotationConfigApplicationContext.register` 
* == `<import/>` element | Spring XML
* `@Bean` definitions / declared | imported `@Configuration` classes -- should be accessed, via -- `@Autowired` injection
* uses
  * | class level
  * -- as a -- meta-annotation
* if XML or OTHER non-`@Configuration` bean definition resources need to be imported -> use the `@ImportResource` annotation 