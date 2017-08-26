FROM openjdk:jre
ADD target/spring-boot-jdbc.jar spring-boot-jdbc.jar
ENTRYPOINT ["java","-jar","spring-boot-jdbc.jar"]