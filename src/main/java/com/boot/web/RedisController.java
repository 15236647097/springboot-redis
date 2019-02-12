package com.boot.web;

import com.boot.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wyn on 2019/1/24.
 */
@Controller
public class RedisController {

    @Autowired
    RedisUtil redisUtil;

    @RequestMapping(value = "/redis/set/{key}/{value}",method = RequestMethod.POST)
    @ResponseBody
    public boolean set(@PathVariable("key")String key,@PathVariable("value")String value){
        System.out.println("set");
        return redisUtil.set(key,value);
    }
}
