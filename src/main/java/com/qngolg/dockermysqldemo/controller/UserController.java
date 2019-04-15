package com.qngolg.dockermysqldemo.controller;

import com.qngolg.dockermysqldemo.entity.UserEntity;
import com.qngolg.dockermysqldemo.resources.UserResources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.stream.IntStream;

@RestController
public class UserController {

    private final UserResources resources;

    public UserController(UserResources resources) {
        this.resources = resources;
    }

    @GetMapping(value = "/save")
    public String save(String name) {
        UserEntity userEntity = UserEntity.builder().name(name).code(name + "_code").build();
        resources.saveUser(userEntity);
        return "save";
    }

    @GetMapping(value = "/batchSave")
    public String batchSave(@PathParam("size") Integer size) {
        IntStream.range(0, size)
                .forEach(i -> save("name" + i));
        return "batchSave";
    }


}
