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
import org.apache.ibatis.session.SqlSession;

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
        for (User user : mapper.getUserList()) {
            System.out.println(user);
        }
    }
}
