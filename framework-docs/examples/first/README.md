# Goals
* Register and initialize the `DispatcherServlet` -- via -- Java configuration

## How to run locally?
* `mvn clean package`
  * check that "target/first.war" is generated
* [configure a Tomcat server](https://www.youtube.com/watch?v=ThBw3WBTw9Q&t=400s) / host your .war
* Open in your desired browser
  * http://localhost:8080/first_war/hello
  * "first_war"
    * ⚠️-- depends on -- where you configure your web server / hosted on your local computer ⚠️

## How has it been created?
* via Spring Initialzr
  * it can be built-in in your IDE
