https://www.jianshu.com/p/75adf667f61a#Docker-mysql-demo

获取docker镜像
`docker pull mysql`

查看docker镜像
`docker images`

安装运行docker mysql镜像 第一个3306 映射的本地port 第二个3306 docker容器的port
``sudo docker run --name first-mysql -p 3306:3306 -e MYSQL\_ROOT\_PASSWORD=123456 -d mysql 08dc7169369f``
查看运行状态

``docker ps``

使用InteilliJ IDEA 的database连接mysql

设置用户名密码
root  123456

##启动已经停止的docker容器
``docker start first-mysql``