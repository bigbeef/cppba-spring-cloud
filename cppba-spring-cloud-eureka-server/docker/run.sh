#!/bin/bash

app_name="cppba-spring-cloud-eureka-server"
port1="8761"
port2="8762"

# (确保已经登陆docker)
# 停止并移除服务
docker rm -f $(docker ps -a -f "name=${app_name}" -q)
# 移除镜像
docker rmi winfed/${app_name}
# 构建镜像
docker build -t winfed/${app_name} .
# 启动一个容器
docker run -d --name ${app_name}-${port1} -p ${port1}:8080 winfed/${app_name}
docker run -d --name ${app_name}-${port2} -p ${port2}:8080 winfed/${app_name}