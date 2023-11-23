FROM openjdk:17-ea-11-jdk-slim
COPY build/libs/team3-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]