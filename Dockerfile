FROM openjdk:17
COPY target/Springboot-RestApp  /user/app/
WORKDIR /user/app/
ENTRYPOINT ["java","-jar","Springboot-RestApp.jar"]