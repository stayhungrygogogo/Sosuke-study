/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: HelloController
 * Author:   chenjinfeng
 * Date:     2021/4/23 11:25 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.maodd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author chenjinfeng
 * @create 2021/4/23
 * @since 1.0.0
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(){
        return "hello word";
    }
}
