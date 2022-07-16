FROM amazoncorretto:11-alpine-jdk
MAINTAINER Ahmed.Montaser
COPY target/product-0.0.1-SNAPSHOT.jar product-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/product-0.0.1-SNAPSHOT.jar"]
