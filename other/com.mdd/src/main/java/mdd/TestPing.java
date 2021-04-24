/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: TestPing
 * Author:   chenjinfeng
 * Date:     2021/3/23 5:14 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package mdd;

import com.alibaba.fastjson.JSONObject;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author chenjinfeng
 * @create 2021/3/23
 * @since 1.0.0
 */
public class TestPing {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        System.out.println(  jedis.ping());
        jedis.set("a","b");
        System.out.println(jedis.get("a"));
        testTx(jedis);

        JSONObject json = new JSONObject();
        String user = json.toJSONString();

        json.put("name","mdd");
        json.put("age","18");
        jedis.set("user1",json.toJSONString());
        System.out.println(jedis.get("user1"));


        jedis.close();
    }
    public static void testTx(Jedis jedis){

        Transaction multi = jedis.multi();
        multi.set("b","c");
        System.out.println(multi.get("a"));
        multi.lpush("l","1");
        multi.lpush("l","2");
        multi.exec();
        System.out.println(jedis.lpop("l"));

    }
}
