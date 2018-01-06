If you get an error

Apr 17, 2014 5:46:48 PM org.apache.catalina.startup.ContextConfig parseWebXml
SEVERE: Parse error in application web.xml file at jndi:/localhost/MyApp/WEB-INF/web.xml
java.io.FileNotFoundException: Could not resolve XML resource [null] with public ID [null], system ID [generated/djn-settings.inc] and base URI [jndi:/localhost/MyApp/WEB-INF/web.xml] to a known, local entity.
    at org.apache.tomcat.util.descriptor.LocalResolver.resolveEntity(LocalResolver.java:136)
    
go to $CATALINA_HOME/conf.context.xml
and change \<Context> to \<Context xmlBlockExternal="false">

Run Tomcat LocalServer via IntelliJ
Go to browser and enter 'http://localhost:8080/hello'