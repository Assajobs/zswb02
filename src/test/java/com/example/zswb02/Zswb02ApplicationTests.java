package com.example.zswb02;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class Zswb02ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testRedis(){
        redisTemplate.opsForValue().set("name", "Jack");
        System.out.println(redisTemplate.opsForValue().get("name"));
    }
}
