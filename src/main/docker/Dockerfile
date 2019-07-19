#镜像出处
FROM openjdk:8-jdk-alpine
#维护者信息
MAINTAINER kaiy

VOLUME /tmp
ADD demo-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
#对外暴漏的端口号
EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
