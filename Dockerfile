FROM adoptopenjdk/openjdk13:alpine
WORKDIR /opt
COPY target/retoapp-1.0.jar /opt
ARG JAR=target/retoapp-1.0.jar
ADD ${JAR} retoapp-1.0.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","retoapp-1.0.jar"]