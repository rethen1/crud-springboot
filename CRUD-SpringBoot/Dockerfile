FROM maven:3-eclipse-temurin-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-alpine
COPY --from=build /target/com.app.crud-1.0.jar

ARG JAR_FILE=target/CRUD-SpringBoot-1.0.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "com.app.crud-1.0.jar"]
