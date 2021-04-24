/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: hellocontroller
 * Author:   chenjinfeng
 * Date:     2021/3/22 7:06 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.maodd1.controller.dao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author chenjinfeng
 * @create 2021/3/22
 * @since 1.0.0
 */
@Controller
public class hellocontroller {
    @RequestMapping("/index")
    @ResponseBody
  public String hello(){
    return "index";
  }
}
