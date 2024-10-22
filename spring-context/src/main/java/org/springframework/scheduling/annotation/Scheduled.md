* == annotation /
  * 👀| method 👀
    * --> marks it -- to be scheduled
    * /
      * NOT accept arguments
      * returned types
        * typically is `void`
        * 👀if != `void` -> returned value is ignored 👀
        * support
          * reactive `Publisher` OR type / -- can be adapted to -- `Publisher` -- by the -- `ReactiveAdapterRegistry`
            * requirements
              * `Publisher` -- MUST support -- >1 subsequent subscriptions
            * 👀returned `Publisher` is ONLY produced 1! 👀
              * / scheduling infrastructure -- according to configuration -> subscribes to it
                * if you configure a `fixedDelay` -> subscription is blocked
                  * == `fixedDelay` has priority
          * Kotlin suspending functions
            * requirements
              * `kotlinx.coroutine.reactor` | runtime
                * == brigde / suspending function -- is adapted to a -- `Publisher` / treatment == reactive `Publisher`
      * if >1 `@Scheduled` | 1 method -> each of them is processed independently / separate trigger firing
        * -> may 
          * overlap / execute multiple times | parallel
          * execute immediately
  * if you want periodic tasks -> specify 
    * the attributes
      * `String cron()`
      * `long fixedDelay()`
      * `long fixedRate()`
    * \+ (optionally)  `long initialDelay()`
  * if you want 1!-time task -> specify `long initialDelay()`
  * how is it processed?
    * registering a `ScheduledAnnotationBeanPostProcessor`
      * ways to do it
        * manually
        * -- through --
          * `<task:annotation-driven/>` XML element
          * `@EnableScheduling`
  * uses
    * as a `@Repeatable`
    * as meta-annotation -- to create -- custom composed annotations
  * if errors happen -> `WARN` level
    * / 👀does NOT prevent further iterations 👀