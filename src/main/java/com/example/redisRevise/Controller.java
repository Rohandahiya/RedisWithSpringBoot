package com.example.redisRevise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    RedisTemplate<String,Object> redisTemplate;

    @GetMapping("/get")
    public Object getEmp(@RequestParam("y") String key){
        return redisTemplate.opsForValue().get(key);

    }

    @PostMapping("/post")
    public void postEmp(@RequestParam("KKey") String key, @RequestBody Employee emp){
        redisTemplate.opsForValue().set(key,emp);
    }





}
