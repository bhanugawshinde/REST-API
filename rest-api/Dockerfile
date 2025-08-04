# Use OpenJDK base image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy JAR file
COPY target/*.jar app.jar

# Run the JAR
CMD ["java", "-jar", "app.jar"]
