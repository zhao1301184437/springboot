package org.qf.springboot.action;


import org.qf.springboot.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisAction {

    @Autowired
    private RedisService redisService;

    @RequestMapping("/set")
    public String set(String key,String value){
        redisService.set(key,value);
        return "ok";
    }

    @RequestMapping("/get")
    public Object getValue(String key){
        return  redisService.get(key);
    }
}
