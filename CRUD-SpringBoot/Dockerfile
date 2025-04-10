FROM maven:3-eclipse-temurin-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-alpine
COPY --from=build /target/*.jar demo.jar

ARG JAR_FILE=target/CRUD-SpringBoot-1.0.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "demo.jar"]