package com.absat.redis_demo.entity;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

@Data
@RedisHash("User")
public class User {
    private Integer id;
    private String name;
}
