/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: User
 * Author:   chenjinfeng
 * Date:     2021/3/23 9:58 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo222.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author chenjinfeng
 * @create 2021/3/23
 * @since 1.0.0
 */
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private String name;
    private int age;

}
