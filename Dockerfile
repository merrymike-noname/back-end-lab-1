FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY target/back-end-lab-1-0.0.1-SNAPSHOT.jar /app/back-end-lab-1-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "back-end-lab-1-0.0.1-SNAPSHOT.jar"]