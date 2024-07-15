* := class / 
  * 👁️encapsulate information of Java method & Bean 👁️
    * Java method
      * -- through -- `AnnotatedMethod`
      * / contains the information
        * method parameters
        * method return value
        * method annotations
        * ..
  * ways to create
    * bean instance
      * `new HandlerMethod(Object bean, Method method)`
      * ...
    * bean name
      * `new HandlerMethod(String beanName, BeanFactory beanFactory, Method method)`
      * ...
    * `createWithResolvedBean()`