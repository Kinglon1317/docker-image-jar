FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD ./target/docker-image-jar-0.0.1-SNAPSHOT.jar ptk-ecr-private.jar
EXPOSE 8090
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/ptk-ecr-private.jar"]
