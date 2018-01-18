FROM fabric8/java-alpine-openjdk8-jdk
VOLUME /tmp
ADD target/cxfbasic-0.0.1-SNAPSHOT.jar /deployments/app.jar
ENV JAVA_OPTS=""
ENV CONTAINER=true
EXPOSE 9000
ENTRYPOINT [ "sh", "-c", "/deployments/run-java.sh" ]
