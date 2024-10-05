FROM maven:3.9.9-sapmachine-21 AS build
WORKDIR /app
COPY src /app/src
COPY pom.xml /app/pom.xml
RUN mvn clean package
CMD ["java", "-jar", "/app/target/testing-project-ci-cd-0.0.1-SNAPSHOT.jar"]