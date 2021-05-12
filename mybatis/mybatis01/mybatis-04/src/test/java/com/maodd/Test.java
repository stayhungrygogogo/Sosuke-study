/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: Test
 * Author:   chenjinfeng
 * Date:     2021/4/18 3:20 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.maodd;

import com.maodd.dao.UserMapper;
import com.maodd.pojo.User;
import com.maodd.utils.mybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author chenjinfeng
 * @create 2021/4/18
 * @since 1.0.0
 */
public class Test {
    @org.junit.Test
    public  void test01 (){
        SqlSession sqlsession = mybatisUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        Map<String,Integer>  map = new HashMap<String, Integer>();
        map.put("pageIndex",0 );
        map.put("pageSize",2);

        List<User> userList = mapper.getUserListByPage(map);
        for (User user : userList) {
            System.out.println(user);
        }
        sqlsession.close();
    }



    @org.junit.Test
    public  void testRowbounds (){
        SqlSession sqlsession = mybatisUtils.getSqlsession();
//        sqlsession.selectList("com.maodd.dao.getUserListByRowBounds",null,new RowBounds());
        List<User> userList = sqlsession.selectList("com.maodd.dao.UserMapper.getUserListByRowBounds",null,new RowBounds(0,3));

        for (User user : userList) {
            System.out.println(user);
        }
        sqlsession.close();
    }
}
