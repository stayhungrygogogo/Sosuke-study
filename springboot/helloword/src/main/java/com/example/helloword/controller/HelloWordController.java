/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: HelloWordController
 * Author:   chenjinfeng
 * Date:     2021/3/26 11:55 下午
 * Description: c
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.helloword.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈c〉
 *
 * @author chenjinfeng
 * @create 2021/3/26
 * @since 1.0.0
 */
@Controller
@RestController
public class HelloWordController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello,word!";
    }
}
