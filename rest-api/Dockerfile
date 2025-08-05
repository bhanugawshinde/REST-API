# Use OpenJDK base image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy JAR file
COPY target/rest-api.jar app.jar

# Run the JAR
CMD ["java", "-jar", "app.jar"]
