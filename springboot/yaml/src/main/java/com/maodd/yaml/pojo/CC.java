/**
 * Copyright (C), 2015-2022, XXX有限公司
 * FileName: CC
 * Author:   chenjinfeng
 * Date:     2022/4/5 4:16 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.maodd.yaml.pojo;

import com.sun.tools.javac.util.Assert;

import java.util.HashMap;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author chenjinfeng
 * @create 2022/4/5
 * @since 1.0.0
 */
public class CC implements c{
    @Override
    public void outMaxMaery() {
        System.out.println("Max="+Runtime.getRuntime().maxMemory()+"字节\t"+Runtime.getRuntime().maxMemory()/(1024*1024)+"MB");

    }

    @Override
    public void outTotalMaery() {
        //
        System.out.println("Total="+Runtime.getRuntime().totalMemory()+"字节\t"+Runtime.getRuntime().totalMemory()/(1024*1024)+"MB");
    }

    public static void main(String[] args) {
        CC cc = new CC();
        cc.outMaxMaery();
        Assert.check(false,"123");
        try {
            Assert.check(false);
            Assert.check(true,"123");
        }catch (Exception e){
            //e.printStackTrace();
        }catch (Error e){
            //e.printStackTrace();
        }
        cc.outTotalMaery();
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("123","");

    }
}
