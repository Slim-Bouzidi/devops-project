# --------- BUILD STAGE ---------
FROM maven:3.9.6-eclipse-temurin-17 AS build

WORKDIR /app

# Copy pom.xml first for caching
COPY pom.xml .
# Copy source code
COPY src ./src

# Build the jar without running tests
RUN mvn clean package -DskipTests

# --------- RUNTIME STAGE ---------
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

# Copy the built jar from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose Spring Boot default port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java","-jar","/app/app.jar"]