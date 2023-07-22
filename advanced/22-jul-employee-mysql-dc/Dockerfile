FROM openjdk:8
VOLUME /main-app
ADD target/22-jul-employee-mysql-dc-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 5000
ENTRYPOINT ["java", "-jar","/app.jar"]