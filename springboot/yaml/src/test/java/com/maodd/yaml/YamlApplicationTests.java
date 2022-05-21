package com.maodd.yaml;

import com.maodd.yaml.pojo.Dog;
import com.maodd.yaml.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YamlApplicationTests {

    @Autowired
    private Dog dog;

    @Autowired
    private Person person;

    @Test
    void contextLoads() {
        System.out.println(dog);
    }

    @Test
    void TestPerson() {
        System.out.println(person);
    }
}
