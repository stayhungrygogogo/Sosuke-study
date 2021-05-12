/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: UserDao
 * Author:   chenjinfeng
 * Date:     2021/4/15 1:35 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.maodd.dao;

import com.maodd.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author chenjinfeng
 * @create 2021/4/15
 * @since 1.0.0
 */
public interface UserMapper {
    public List<User> getUserList();

    public List<User> getUserListByPage(Map<String,Integer> map);

    public List<User> getUserListByRowBounds(Map<String,Integer> map);

}
