#!/bin/bash

mvn clean compile install package

java -jar target/student.jar
#docker build -t student .
#
#docker stop student_image
#docker rm student_image
#
#docker run -d -p 9999:8080 --name student_image student