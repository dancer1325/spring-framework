* == annotation /
  * | method 
    * --> marks it -- as candidate for -- async execution
    * ⚠️NOT supported | methods / declared | `@Configuration` class ⚠️
  * | type level
    * -> affects ALL type's methods
  * about target method signatures
    * parameter types
      * ANY 
    * return type
      * `void`
      * `java.util.concurrent.Future`
        * allowed subtypes
          * `org.springframework.util.concurrent.ListenableFuture`
          * `java.util.concurrent.CompletableFuture`
        * `Future` handle returned | proxy == async `Future` / 
          * uses
            * track the result -- of the -- async method execution
          * returns a temporary `Future` 
            * Reason: 🧠== target method's signature 🧠
            * / passes a value -- through --
              * `org.springframework.scheduling.annotation.AsyncResult`
              * `jakarta.ejb.AsyncResult`
              * `java.util.concurrent.CompletableFuture.completedFuture(Object)`
* `String value()`
  * == qualifer value -- for the -- specified async operation
  * TODO: