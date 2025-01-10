* == delegate for `AbstractApplicationContext`'s post-processor handling

* `BeanPostProcessorChecker implements BeanPostProcessor`
  * == `BeanPostProcessor` / 
    * 👀if a bean is created | BeanPostProcessor instantiation -> logs an info message 👀
      * == bean -- NOT eligible for getting processed by -- ALL `BeanPostProcessors`

* TODO: