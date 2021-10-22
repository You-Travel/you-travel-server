gradlew build && docker build --build-arg JAR_FILE=build/libs/server-1.0.jar -t springio/gs-spring-boot-docker . && docker run -p 8080:8080 springio/gs-spring-boot-docker
pause