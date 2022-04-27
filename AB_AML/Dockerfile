FROM maven:3.8.5-openjdk-8-slim AS builder
WORKDIR /app
COPY pom.xml ./
COPY src/ ./src
RUN mvn package
FROM openjdk:8-jre-slim
WORKDIR /app
COPY --from=builder /app/target/AB_AML-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "/app/AB_AML-0.0.1-SNAPSHOT.jar"]