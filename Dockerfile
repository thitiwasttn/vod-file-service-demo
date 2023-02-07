FROM eclipse-temurin:11.0.16_8-jre

RUN apt-get update && apt-get install nano

ENV TZ=Asia/Bangkok
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

ADD target/*.jar /usr/src/app/entrypoint.jar


ENTRYPOINT ["java","-jar", "/usr/src/app/entrypoint.jar"]