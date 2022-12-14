FROM amazoncorretto:11-alpine-jdk

MAINTAINER dahiebl@gmail.com

COPY target/backend-0.0.1.jar backend-0.0.1.jar

ENTRYPOINT ["java","-jar","/backend-0.0.1.jar"]