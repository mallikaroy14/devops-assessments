FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY target/assessment-devops.jar .
EXPOSE 8081
CMD ["java","-jar","assessment-devops.jar"]
