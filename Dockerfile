
# Use a base image with JDK 17
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy the jar file
COPY target/dinerestaurant-0.0.1-SNAPSHOT.jar app.jar

# Expose the default port
EXPOSE 8080

# Command to run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
