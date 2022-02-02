package com.mariworld.redis.fruit;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.time.LocalDateTime;
@Getter
@RedisHash(value = "fruit", timeToLive = 100)
public class Fruit {

    @Id
    private String id;
    private String name;
    private Integer gram;
    private LocalDateTime createdAt = LocalDateTime.now();

    public Fruit(String name, Integer gram) {
        this.name = name;
        this.gram = gram;
    }
}
