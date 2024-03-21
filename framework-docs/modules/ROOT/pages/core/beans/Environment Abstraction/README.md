# `Environment`
* := interface which
  * is integrated in the container
  * models
    * profiles
      * == determine which profiles
        * are currently active
        * should be active, by default
    * properties
      * == configure them

# Bean Definition Profiles
* := logical group of bean definitions
  * if the profile is active → it’s registered with the container
  * if bean defined in XML | annotations → bean — assigned to a — profile
  * allows
    * registering beans / different environments
  * use cases
    * once an application is deployed in a performance environment → just then registering monitoring infrastructure
    * registering customized implementations of beans / customers
    * in-memory DDBB locally versus other datasources in deployed environments
      * Note: typically using JNDI in deployed environments