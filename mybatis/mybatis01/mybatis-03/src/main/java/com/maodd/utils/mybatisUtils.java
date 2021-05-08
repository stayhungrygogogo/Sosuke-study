/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: mybatisUtils
 * Author:   chenjinfeng
 * Date:     2021/4/15 1:27 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.maodd.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author chenjinfeng
 * @create 2021/4/15
 * @since 1.0.0
 */
public class mybatisUtils {
   private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
             sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        }catch (Exception e){
           e.getStackTrace();
        }
    }

    public  static SqlSession getSqlsession(){
        return  sqlSessionFactory.openSession();
    }

}
