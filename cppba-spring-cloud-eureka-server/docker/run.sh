#!/bin/bash

app_name="cppba-spring-cloud-eureka-server"

# (确保已经登陆docker)
# 停止并移除服务
docker rm -f ${app_name}
# 移除镜像
docker rmi winfed/${app_name}
# 构建镜像
docker build -t winfed/${app_name} .
# 启动一个容器
docker run -d --name ${app_name} -p 8761:8080 winfed/${app_name}