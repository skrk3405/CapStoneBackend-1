FROM openjdk:20
Label maintainer="team3"
ADD target/demo-0.0.1-SNAPSHOT.jar springboot.jar
ENTRYPOINT ["java","-jar","springboot.jar"]