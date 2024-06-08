FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY pom.xml .

COPY src ./src

COPY mvnw .

RUN ./mvnw dependency:go-offline

COPY .mvn .mvn

RUN chmod 777 mvnw

RUN ./mvnw package

CMD ["java", "-jar", "target/igor-0.0.1-SNAPSHOT.jar"]