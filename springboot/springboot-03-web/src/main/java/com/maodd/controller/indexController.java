/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: indexController
 * Author:   chenjinfeng
 * Date:     2021/4/24 12:00 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.maodd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author chenjinfeng
 * @create 2021/4/24
 * @since 1.0.0
 */
@Controller
public class indexController {
    @RequestMapping("/index")
    public  String index(){

        return "index.html";
    }


    @RequestMapping("/test")
    public  String test(Model model){
        model.addAttribute("msg","aa");
        return "mySpringbootHtml";
    }
}
