FROM openjdk:8-jdk-alpine
MAINTAINER 245655812@qq.com
ADD cppba-spring-cloud-eureka-server.jar /app.jar
EXPOSE 8080
COPY docker-entrypoint.sh /
RUN chmod +x /docker-entrypoint.sh
ENTRYPOINT ["/docker-entrypoint.sh"]
