package com.example.demo222.util;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
 
public class RedisUtil {
    private static Logger logger = LoggerFactory.getLogger(RedisUtil.class);
 
    private static JedisPool jedisPool;
 
    public static void setJedisPool(JedisPool jedisPool) {
        RedisUtil.jedisPool = jedisPool;
    }
 
    public static String redisGet(String key) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            return jedis.get(key);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        } finally {
            close(jedis);
        }
        return null;
    }
 
    public static void redisPut(String key, String val) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.set(key, val);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        } finally {
            close(jedis);
        }
    }
 
    private static void close(Jedis jedis) {
        if (jedis != null) {
            jedis.close();
        }
    }
}