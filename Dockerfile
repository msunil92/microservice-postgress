FROM openjdk:8-jdk-alpine

LABEL maintainer="Sunil M <msunil1792@gmail.com>"

# The application's jar file
ENV PROFILE=default
ENV ms 1024m
ENV mx 2048m
ENV mn 1024m
ENV gc UseParallelOldGC

# Add the application's jar to the container
ADD target/student.jar /app/

EXPOSE 8080
EXPOSE 8081
EXPOSE 5432

ENTRYPOINT java  -Xms${ms} -Xmx${mx} -Xmn${mn} -XX:+${gc} -jar /app/student.jar
