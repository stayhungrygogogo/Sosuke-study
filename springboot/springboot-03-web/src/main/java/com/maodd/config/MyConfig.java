/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: MyConfig
 * Author:   chenjinfeng
 * Date:     2021/4/24 2:17 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.maodd.config;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author chenjinfeng
 * @create 2021/4/24
 * @since 1.0.0
 */
@Configuration
public class MyConfig  implements WebMvcConfigurer{


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        
    }
}
