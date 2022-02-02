package com.mariworld.redis.fruit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FruitTest {

    @Autowired
    private FruitRepository fruitRepository;

    @Test
    public void saveFruitTest(){
        Fruit fruit = new Fruit("apple",100);
        fruitRepository.save(fruit);
    }
}
