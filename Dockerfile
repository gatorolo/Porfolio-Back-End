
FROM amazoncorretto:8-alpine-jdk

MAINTAINER gatorolo

COPY target/ap-0.0.1-SNAPSHOT.jar ap-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/ap-0.0.1-SNAPSHOT.jar"]
