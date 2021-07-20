FROM azul/zulu-openjdk:11
VOLUME /tmp
VOLUME /target

ARG JAR_FILE
ARG FIREBASE_KEY
COPY ${JAR_FILE} app.jar

EXPOSE 8224
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
