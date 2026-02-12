package com.example.user_registration.controller;

import com.example.user_registration.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InfoController {
    @Autowired
    private InfoService service;

    @RequestMapping("/info")
    public List<Info> getinfo(){
    return service.getinfo();
    }
    @PostMapping("/info")
    public void say(@RequestBody Info info) {
        service.say(info);
    }

    @GetMapping("/info/{id}")
    public Info getTopicbyID(@PathVariable String id) {
        return service.getinfobyId(id);
    }
    @PutMapping("/info/{id}")
    public Info editId(@PathVariable String id, @RequestBody Info info) {
        return service.editId(id, info);
    }

}
