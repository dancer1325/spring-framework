# Goals
* Configure the Servlet container
* Log sensitive data

## How to run locally?
* `mvn clean package`
  * check that "target/second.war" is generated
* [configure a Tomcat server](https://www.youtube.com/watch?v=ThBw3WBTw9Q&t=400s) / host your .war
* Open in your desired browser
  * "http://localhost:8080/second_war/hello"
    * "second_war"
      * ⚠️ -- depends on -- where you configure your web server / hosted on your local computer ⚠️
    * TODO: Check the details of the requests, even sensitive data logged

## How has it been created?
* via Spring Initialzr
  * it can be built-in in your IDE

## Notes
* NOT required a `main (String[] args..)`
  * Reason: Configure `WebApplicationInitializer`
