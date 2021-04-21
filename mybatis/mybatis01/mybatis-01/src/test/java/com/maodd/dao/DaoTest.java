/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: DaoTest
 * Author:   chenjinfeng
 * Date:     2021/4/15 1:40 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.maodd.dao;

import com.maodd.pojo.User;
import com.maodd.utils.mybatisUtils;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author chenjinfeng
 * @create 2021/4/15
 * @since 1.0.0
 */
public class DaoTest {
    volatile  TreeSet b =new TreeSet();
    @Test
    public void testdao(){
        SqlSession sqlsession = mybatisUtils.getSqlsession();
        try {
            UserMapper mapper = sqlsession.getMapper(UserMapper.class);
            List<User> userList = mapper.getUserList();
            for (User user : userList) {
                System.out.println(user);
            }
        }finally {
            sqlsession.close();
        }

    }

    @Test
    public void testdao1(){
        StringBuffer a;

        HashMap c;
        Vector d;
        SqlSession sqlsession = mybatisUtils.getSqlsession();
        try {
            List<User> userList = sqlsession.selectList("COM.maodd.dao.UserMapper.getUserList");

            for (User user : userList) {
                System.out.println(user);
            }
        }finally {
            sqlsession.close();
        }

    }
    @Test
    public void getUserById(){
        SqlSession sqlsession = mybatisUtils.getSqlsession();
        try {
            UserMapper mapper = sqlsession.getMapper(UserMapper.class);
            User user = mapper.getUserById(1);
            System.out.println(user);
        }finally {
            sqlsession.close();
        }
    }

    @Test
    public void getUserByIdAndName(){
        SqlSession sqlsession = mybatisUtils.getSqlsession();
        try {
            UserMapper mapper = sqlsession.getMapper(UserMapper.class);
            Map map =new HashMap();
            map.put("id","8");
            map.put("name","88");
            User user = mapper.getUserByIdAndName(map);
            System.out.println(user);
        }finally {
            sqlsession.close();
        }
    }

    @Test
    public void getUserNameLike(){
        SqlSession sqlsession = mybatisUtils.getSqlsession();
        try {
            UserMapper mapper = sqlsession.getMapper(UserMapper.class);
            List<User> list = mapper.getUserByNameLike("%王%");
            for (User user : list) {
                System.out.println(user);
            }
        }finally {
            sqlsession.close();
        }
    }

    @Test
    public void TestAddUser(){
        SqlSession sqlsession = mybatisUtils.getSqlsession();
        try {
            UserMapper mapper = sqlsession.getMapper(UserMapper.class);
            int num = mapper.addUser(new User(7, "狂", "123312"));
            if (num>0){
                System.out.println("插入成功");
            }
            sqlsession.commit();
        }finally {

            sqlsession.close();
        }
    }

    @Test
    public void TestAddUsers(){
        SqlSession sqlsession = mybatisUtils.getSqlsession();
        try {
            UserMapper mapper = sqlsession.getMapper(UserMapper.class);
            Map map =new HashMap();
            map.put("tid","8");
            map.put("tname","88");
            map.put("tpwd","88888");
            int i = mapper.addUsers(map);

            if (i>0){
                System.out.println("插入成功");
            }
            sqlsession.commit();
        }finally {

            sqlsession.close();
        }
    }

    @Test
    public void TestUpdateUser(){
        SqlSession sqlsession = mybatisUtils.getSqlsession();
        try {
            UserMapper mapper = sqlsession.getMapper(UserMapper.class);
            int num = mapper.updateUser(new User(6, "狂1", "1"));
            if (num>0){
                System.out.println("更新成功");
            }
            sqlsession.commit();
        }finally {

            sqlsession.close();
        }
    }

    @Test
    public void TestDeleteUser(){
        SqlSession sqlsession = mybatisUtils.getSqlsession();
        try {
            UserMapper mapper = sqlsession.getMapper(UserMapper.class);
            int num = mapper.deleteUser(2);
            if (num>0){
                System.out.println("删除成功");
            }
            sqlsession.commit();
        }finally {

            sqlsession.close();
        }
    }
}
