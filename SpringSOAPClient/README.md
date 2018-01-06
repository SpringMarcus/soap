Make sure to run the SpringSOAPServer first before dealing with this

To source the SpringSOAPServer code
execute this command in /the src/main/java

wsimport http://localhost:8080/hello?wsdl -p server.stuff -d . -keep

this would create lots of junk files in the 'server.stuff' package
those files also need 2 dependencies which are defined in the pom.xml
