#基于Java8
FROM openjdk:8

#指定当前操作目录
WORKDIR /work/project

#容器启动后执行的操作
CMD java -jar docker-mysql-demo.jar