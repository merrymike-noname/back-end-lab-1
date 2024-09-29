FROM eclipse-temurin:21-jdk-alpine AS build
WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw mvnw
COPY pom.xml pom.xml

RUN ./mvnw dependency:go-offline -B
COPY src src
RUN ./mvnw clean package -DskipTests

FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/back-end-lab-1-0.0.1-SNAPSHOT.jar /app/back-end-lab-1-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "back-end-lab-1-0.0.1-SNAPSHOT.jar"]