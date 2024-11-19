FROM openjdk:8
EXPOSE 8080
COPY target/spring-crud-k8s-0.0.1-SNAPSHOT.jar spring-crud-k8s.jar
ENTRYPOINT ["java", "-jar", "/spring-crud-k8s.jar"]