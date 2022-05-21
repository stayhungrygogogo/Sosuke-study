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

 import jdk.nashorn.internal.parser.JSONParser;
 import org.springframework.boot.configurationprocessor.json.JSONArray;

 import javax.sound.midi.Soundbank;
 import java.util.*;
 import java.util.stream.Collectors;

 /**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author chenjinfeng
 * @create 2021/9/7
 * @since 1.0.0
 */
public class hui1 {
  public static void main(String[] args) {

//      System.out.println(langstring("aabbcc") );
      testMap();
  }
  public static String langstring(String s){
    List<String> s1 = new ArrayList<String>();
      s1.add("aa");
      s1.add("b");
      s1.add("ca");
      s1.add("aa");
    s1.stream().map(str -> str.toUpperCase()).forEach(System.out :: println);
    s1.stream().map(str -> str.toUpperCase()).skip(2).distinct().forEach(System.out :: println);
    s1.stream().filter(str -> str == "b").forEach(System.out :: println);
      List<Map<String,String>> ListMap = new ArrayList<Map<String,String>>();
      HashMap<String, String> stringStringHashMap = new HashMap<>();
      HashMap<String, String> stringStringHashMap1 = new HashMap<>();
      List<Map<String,String>> ListMap1 = new ArrayList<Map<String,String>>();
      stringStringHashMap.put("a","a");
      stringStringHashMap.put("s","a");
      stringStringHashMap.put("b","a");

      stringStringHashMap1.put("a","a");
      stringStringHashMap1.put("s","a");
      stringStringHashMap1.put("b","a");
      ListMap.add(stringStringHashMap);
      ListMap.add(stringStringHashMap1);

      ListMap.stream().forEach(e ->{
          Map<String, String> newMap = e.entrySet().stream()
                  .collect(Collectors.toMap(entry -> entry.getKey().toUpperCase(), entry -> entry.getValue()));
          ListMap1.add(newMap);
      });
      ListMap.stream().forEach(System.out :: println);
      System.out.println(ListMap1);


      List<Integer> i1 = new ArrayList<Integer>();
      i1.add(2);
      i1.add(3);
      i1.add(4);
      i1.add(7);

      System.out.println( i1.stream().max((e1,e2) -> Integer.compare(e1,e2)));



      Map<String, List<String>> targetTableColumnListMap = ListMap.stream().flatMap(m -> m.entrySet().stream())
              .collect(Collectors.groupingBy(e -> e.getKey().toUpperCase(), Collectors.mapping(Map.Entry::getValue, Collectors.toList())));



      return "";
  }

    public  static void  testMap(){

        HashSet set =new HashSet();
        set.add(1);
        List<UserTest> UserTestListMap = new ArrayList<UserTest>();

        UserTestListMap.add(new UserTest("张三",1,"1"));
        UserTestListMap.add(new UserTest("李四",2,"2"));
        UserTestListMap.add(new UserTest("王五",3,"3"));
        UserTestListMap.stream().map(n -> n).forEach(System.out :: println);
        /**
         * UserTest{name='张三', age=1, id='1'}
         * UserTest{name='李四', age=2, id='2'}
         * UserTest{name='王五', age=3, id='3'}
         */
        UserTestListMap.stream().map(n -> n.getAge()).forEach(System.out :: println);
        /**
         * 1 2 3
         */
        UserTestListMap.stream().map(n -> n.getAge()).map(n -> n).forEach(System.out :: println);
        /**
         * 1 2 3
         */
        UserTestListMap.stream().map(n -> n.getName()).forEach(System.out :: println);
        /**
         * 1 2 3
         */
        UserTestListMap.stream().map(n -> n.getName()).map(n -> n).forEach(System.out :: println);
        /**
         * 张三 李四 王五
         */
    }


}
class UserTest{
    String name;
    int age;
    String id;

    public UserTest(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "UserTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }



}
