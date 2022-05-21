 /**
  * Copyright (C), 2015-2021, XXX有限公司
  * FileName: hui
  * Author:   chenjinfeng
  * Date:     2021/9/7 11:19 下午
  * Description: 
  * History:
  * <author>          <time>          <version>          <desc>
  * 作者姓名           修改时间           版本号              描述
  */
package com.maodd.yaml.pojo;

 import java.util.stream.IntStream;

 /**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author chenjinfeng
 * @create 2021/9/7
 * @since 1.0.0
 */
public class hui {
  public static void main(String[] args) {
   System.out.println(langstring("aabbcc"));
  }
  public static String langstring(String s){
   String str= "";
   char[] chars1 = s.toCharArray();
   if(chars1.length <1)return "";
   if(chars1.length ==1)return s;
//   int j=0;
   //第一个循环，循环数组中的所有文本
   for(int i =1;i<chars1.length;i++){
    char temp1 = chars1[i];
    str=temp1+"";
     //第二个循环，找出当前字符的前n个和后n个是否相等
    for(int j=0;j<chars1.length/2;j++){
     //做下标越界判断
     //i-j，也就是最小下标要大于0
     //i+j,也就是最大下标要小于char数组的长度
     if(i-j>0&&i+j<chars1.length){

     }else{

     }
    }

   }

   return "";
  }
}
