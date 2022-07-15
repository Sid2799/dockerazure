FROM openjdk:11
ADD target/Employee-1.jar Employee-1.jar
EXPOSE 8091
ENTRYPOINT ["java","-jar","Employee-1.jar"]