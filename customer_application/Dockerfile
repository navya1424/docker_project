FROM openjdk:17
EXPOSE 8080
ADD target/customer-integration.jar customer-integration
ENTRYPOINT ["java", "-jar", "/customer-integration.jar"]
