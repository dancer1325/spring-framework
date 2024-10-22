* == implementation of `TaskExecutor` /
  * fires up a NEW thread / task / -- is executed -- asynchronously
    * 👀threads are NOT reused 👀
    * 👀if you are going to execute a BIG # of short-lived tasks -> use better a thread-pooling `TaskExecutor` implementation 👀
  * -- provides -- virtual thread option | JDK 21
    * `.setVirtualThreads(true)`
  * supports
    * graceful shutdown -- through -- `.setTaskTerminationTimeout()`
      * requirements
        * task tracking / execution thread | runtime
    * limiting concurrent threads -- through -- `.setConcurrencyLimit()`
      * 👀by default, # of concurrent tasks executions is unlimited 👀
* TODO: