FROM java:8
EXPOSE 8080
EXPOSE 8081

ADD target/dropwizard-helloworld-0.1-SNAPSHOT.jar dropwizard-helloworld.jar
ENTRYPOINT java -jar dropwizard-helloworld.jar server
