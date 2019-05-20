package com.qngolg.dockermysqldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerMysqlDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerMysqlDemoApplication.class, args);
    }

    @GetMapping("/test/test")
    public String sayHello(){
        return "jenkins + spring boot + docker 运行成功了";
    }

}
