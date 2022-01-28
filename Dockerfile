FROM java:8

EXPOSE 8080

ADD target/sber_test_tolls.jar docker-demo.jar

ENTRYPOINT ["java","-jar","docker-demo.jar"]