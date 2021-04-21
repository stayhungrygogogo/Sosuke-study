/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: Myannotation
 * Author:   chenjinfeng
 * Date:     2021/4/18 3:41 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.maodd.annotation;

import com.mysql.cj.protocol.a.MysqlBinaryValueDecoder;
import org.junit.Test;

import java.lang.annotation.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author chenjinfeng
 * @create 2021/4/18
 * @since 1.0.0
 */
@oneAnnotation
@Deprecated
public class MyAnnotation {
    public static void main(String[] args) {

        Class<MyAnnotation> parent = MyAnnotation.class;
        Annotation[] parentAnnotations = parent.getAnnotations();
        for (Annotation annotation : parentAnnotations) {
            System.out.println("父类的注解："+annotation);
        }

        Class<twoAnnotation> myannotationClass = twoAnnotation.class;
        Annotation[] annotations = myannotationClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("子类的注解："+annotation);
        }

    }
}
class twoAnnotation extends MyAnnotation{
}
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface oneAnnotation{

}