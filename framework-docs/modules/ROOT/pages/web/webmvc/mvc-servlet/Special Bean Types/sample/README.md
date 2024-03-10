# Prerequisites
* Install a web application server
  * Tomcat
  * Glassfish

---
* `DispatcherServlet` delegates to them for  -- TODO: Create sample --
  * processing requests
  * rendering responses

---

# How has it been created?
* `mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-webapp -DarchetypeVersion=1.4`
* Add dependencies

# How to run locally?
* `mvn package`
  * create a .war for this sample application
* set up a tomcat configuration
  * [Sample video](https://www.youtube.com/watch?v=ThBw3WBTw9Q)
  * Add the 'sample.war' created before
* run the Tomcat server
  * once it's up -> open a browser displaying the 'index.jsp'