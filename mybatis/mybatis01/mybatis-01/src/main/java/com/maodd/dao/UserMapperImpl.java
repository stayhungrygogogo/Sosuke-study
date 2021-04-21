/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: UserMapperImpl
 * Author:   chenjinfeng
 * Date:     2021/4/17 10:08 上午
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
 * @create 2021/4/17
 * @since 1.0.0
 */
public class UserMapperImpl implements UserMapper{
    public List<User> getUserList() {
        return null;
    }

    public User getUserById(int id) {
        return null;
    }

    public User getUserByIdAndName(Map<String, Object> map) {
        return null;
    }

    public List<User> getUserByNameLike(String value) {
        return null;
    }

    public int addUser(User user) {
        return 0;
    }

    public int addUsers(Map<String, Object> map) {
        return 0;
    }

    public int updateUser(User user) {
        return 0;
    }

    public int deleteUser(int id) {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
