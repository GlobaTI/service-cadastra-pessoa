FROM openjdk:8-jre-alpine
ADD service-cadastra-pessoa-0.0.1-SNAPSHOT.jar service-cadastra-pessoa.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/service-cadastra-pessoa.jar"]
