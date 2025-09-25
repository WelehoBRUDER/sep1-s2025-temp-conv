FROM maven:latest
LABEL authors="Juhana"

WORKDIR /app
COPY pom.xml /app
COPY . /app
RUN mvn package
CMD ["java", "-jar", "target/temperature-converter.jar"]