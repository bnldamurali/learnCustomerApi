# Fetching latest version of Java
FROM openjdk:17-jdk

MAINTAINER learningCustomerMicroservices

# Setting up work directory
WORKDIR /app

# Copy the jar file into our app
COPY target/larning-customer-api-1.0.0.jar /app/larning-customer-api.jar

EXPOSE 8080

CMD ["java", "-jar", "larning-customer-api.jar"]