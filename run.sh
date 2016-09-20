java -jar app.war

#-Xdebug \	
#-Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005 \
#-javaagent:jacocoagent.jar=includes=com.adswizz.*,output=tcpserver,address=*,destfile=data/coverage/de.exec \
#-Xms2G -Xmx5G \