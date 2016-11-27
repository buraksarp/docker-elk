FROM java:8 

# Install maven
RUN apt-get update  
RUN apt-get install -y maven

# Adding springboot-elk app to container
ADD . /usr/config-client  
WORKDIR /usr/config-client
RUN ["mvn", "package"]

EXPOSE 8080 
CMD ["/usr/lib/jvm/java-8-openjdk-amd64/bin/java", "-jar", "target/springboot-elk-0.0.1-SNAPSHOT.jar"]
