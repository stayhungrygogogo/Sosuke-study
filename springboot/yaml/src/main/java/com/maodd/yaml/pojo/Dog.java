/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: Dog
 * Author:   chenjinfeng
 * Date:     2021/4/11 4:45 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.maodd.yaml.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author chenjinfeng
 * @create 2021/4/11
 * @since 1.0.0
 */
@Component

public class Dog {

    @Value("旺财")

    private String name;
    private Integer age;

    public Dog() {
    }

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
