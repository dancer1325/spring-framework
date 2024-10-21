* := `@FunctionalInterface` / 
  * -- applied to -- ANY `Runnable`
    * 👀NOT necessarily | user-supplied `Runnable` / `Callable` 👀
    * ⭐️actual execution callback ⭐️
      * / -- may be wrapped around the -- user-supplied task
  * use cases
    * set execution context | task's invocation
    * provide monitoring / statistics | task execution
  * 👀exception handling -- may be -- limited 👀
    * _Example:_ if `Future`-based operations -> exposed `Runnable` == wrapper / `run(){}` does NOT propagate exceptions