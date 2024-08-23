# Goals
* `ResourceBundleMessageSource`
  * refer the resource bundles -- through -- `basenames`

## How to run locally?
* via
  * IDE
    * v
    
    ```
    java -classpath $HOME/Projects/spring-framework/framework-docs/examples/third/target/classes:$HOME/.m2/repository/org/springframework/spring-context/6.1.11/spring-context-6.1.11.jar:$HOME/.m2/repository/org/springframework/spring-aop/6.1.11/spring-aop-6.1.11.jar:$HOME/.m2/repository/org/springframework/spring-beans/6.1.11/spring-beans-6.1.11.jar:$HOME/.m2/repository/org/springframework/spring-core/6.1.11/spring-core-6.1.11.jar:$HOME/.m2/repository/org/springframework/spring-jcl/6.1.11/spring-jcl-6.1.11.jar:$HOME/.m2/repository/org/springframework/spring-expression/6.1.11/spring-expression-6.1.11.jar:$HOME/.m2/repository/io/micrometer/micrometer-observation/1.12.8/micrometer-observation-1.12.8.jar:$HOME/.m2/repository/io/micrometer/micrometer-commons/1.12.8/micrometer-commons-1.12.8.jar com.springframework.docs.App
    ```

  * commands
    * `mvn clean package`
      * check that 
        * "target/third-1.0-SNAPSHOT.jar" is generated
        * "target/classes/beans.xml" & "target/classes/exceptions.properties" & ... == root of the classpath
    * `cd target` & `java -jar third-1.0-SNAPSHOT.jar`
      * Problems:
        * Problem1: "no main manifest attribute, in third-1.0-SNAPSHOT.jar"
          * Solution: TODO

## How has it been created?
* 
 `mvn archetype:generate \
      -DgroupId=com.springframework.docs \
      -DartifactId=third \        
      -Dversion=1.0-SNAPSHOT \
      -DinteractiveMode=false \
      -DarchetypeArtifactId=maven-archetype-quickstart`
