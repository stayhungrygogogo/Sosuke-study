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

    public User getUserById(int id);

    //根据id和name获取数据
    public User getUserByIdAndName(Map<String, Object> map);

    //模糊查询
    public List<User> getUserByNameLike(String value);

    //插入一个用户
    public int addUser(User user);

    //插入一批用户
    public int addUsers(Map<String, Object> map);

    //修改用户
    public  int updateUser(User user);

    //删除用户
    public  int deleteUser(int id);
}
