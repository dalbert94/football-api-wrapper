#
# Build stage
#
FROM maven:3.6.0-jdk-8-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
ENV OUTPUT_PATH "output.txt"
RUN mvn -f /home/app/pom.xml clean package

#
# Package stage
#
FROM openjdk:8-jre-slim
COPY --from=build /home/app/target/football-api-wrapper-jar-with-dependencies.jar /usr/local/lib/football-demo.jar
# COPY /home/app/app.properties /usr/local/lib/football-demo.jar
ENTRYPOINT ["java","-jar","/usr/local/lib/football-demo.jar"]