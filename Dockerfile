FROM eclipse-temurin:17-jdk-focal

WORKDIR /app

# Copy the application JAR file into the container at /app
COPY target/learnCustomerApi-0.0.1-SNAPSHOT.jar /app/learnCustomerApi-0.0.1-SNAPSHOT.jar

# Expose the port that the application will run on
EXPOSE 8083

# Specify the command to run on container start
CMD ["java", "-jar", "learnCustomerApi-0.0.1-SNAPSHOT.jar"]