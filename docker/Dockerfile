# Use a slim JDK 21 image
FROM eclipse-temurin:21-jdk-jammy

# Metadata
LABEL authors="tom"

# Set working directory inside the container
WORKDIR /app

# Copy the fat jar (update the filename if needed)
COPY ../server/build/libs/app.jar app.jar

# Run the Kotlin app
ENTRYPOINT ["java", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005", "-jar", "app.jar"]