package com.boot.util;

import com.boot.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wyn on 2019/1/24.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RedisUtilTest {
    @Autowired
    RedisUtil redisUtil;
    @Test
    public void expire() throws Exception {
        boolean flag = redisUtil.expire("1", 60L);
        boolean flag1 = redisUtil.expire("11", 60L);
        System.out.println(flag);
        System.out.println(flag1);
    }

    @Test
    public void getExpire() throws Exception {
        Long time2 = redisUtil.getExpire("11");
        System.out.println(time2);
    }

    @Test
    public void hasKey() throws Exception {
    }

    @Test
    public void del() throws Exception {
        redisUtil.del("11");
    }

    @Test
    public void get() throws Exception {
        List value = (List) redisUtil.get("asdfa");
        System.out.println(value);
    }

    @Test
    public void set() throws Exception {
    }

    @Test
    public void set1() throws Exception {
    }

    @Test
    public void incr() throws Exception {
    }

    @Test
    public void decr() throws Exception {
    }

    @Test
    public void hget() throws Exception {
    }

    @Test
    public void hmget() throws Exception {
    }

    @Test
    public void hmset() throws Exception {
    }

    @Test
    public void hmset1() throws Exception {
    }

    @Test
    public void hset() throws Exception {
    }

    @Test
    public void hset1() throws Exception {
    }

    @Test
    public void hdel() throws Exception {
    }

    @Test
    public void hHasKey() throws Exception {
    }

    @Test
    public void hincr() throws Exception {
    }

    @Test
    public void hdecr() throws Exception {
    }

    @Test
    public void sGet() throws Exception {
    }

    @Test
    public void sHasKey() throws Exception {
    }

    @Test
    public void sSet() throws Exception {
    }

    @Test
    public void sSetAndTime() throws Exception {
    }

    @Test
    public void sGetSetSize() throws Exception {
    }

    @Test
    public void setRemove() throws Exception {
    }

    @Test
    public void lGet() throws Exception {
    }

    @Test
    public void lGetListSize() throws Exception {
    }

    @Test
    public void lGetIndex() throws Exception {
    }

    @Test
    public void lSet() throws Exception {
    }

    @Test
    public void lSet1() throws Exception {
    }

    @Test
    public void lSet2() throws Exception {
    }

    @Test
    public void lSet3() throws Exception {
    }

    @Test
    public void lUpdateIndex() throws Exception {
    }

    @Test
    public void lRemove() throws Exception {
    }

    @Test
    public void setListLeft(){
        List<String> list = new ArrayList<>();
        list.add("a1");
        list.add("a2");
        list.add("a3");
        redisUtil.setListLeft("list",list);
    }

    @Test
    public void getListLeft(){
        List<String> resultList=(List<String>) redisUtil.getListLeft("list");
        System.out.println(resultList);
    }

}
