package com.example.demo222.dao;
 

import com.example.demo222.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
 
@Configuration
@EnableConfigurationProperties(JedisConfig.JedisProperties.class)
public class JedisConfig {
 
    @Autowired
    private JedisProperties prop;
 
    @Bean
    public JedisPool jedisPool() {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(prop.getMaxTotal());
        config.setMaxIdle(prop.getMaxIdle());
        config.setMaxWaitMillis(prop.getMaxWaitMillis());
        JedisPool jedisPool;
        if("".equals(prop.getPassword())){
            jedisPool = new JedisPool(config, prop.getHost(), prop.getPort(), prop.getTimeOut());
        }else{
            jedisPool = new JedisPool(config, prop.getHost(), prop.getPort(), prop.getTimeOut(), prop.getPassword());
        }
        // 此处为RedisUtil设置了jedisPool
        RedisUtil.setJedisPool(jedisPool);
        return jedisPool;
    }
 
    @ConfigurationProperties(prefix = JedisProperties.JEDIS_PREFIX)
    class JedisProperties {
 
        public static final String JEDIS_PREFIX = "redis.server";
 
        private String host;
 
        private int port;
 
        private String password;
 
        private int maxTotal;
 
        private int maxIdle;
 
        private int maxWaitMillis;
 
        private int timeOut;
 
        public String getHost() {
            return host;
        }
 
        public void setHost(String host) {
            this.host = host;
        }
 
        public int getPort() {
            return port;
        }
 
        public void setPort(int port) {
            this.port = port;
        }
 
        public String getPassword() {
            return password;
        }
 
        public void setPassword(String password) {
            this.password = password;
        }
 
        public int getMaxTotal() {
            return maxTotal;
        }
 
        public void setMaxTotal(int maxTotal) {
            this.maxTotal = maxTotal;
        }
 
        public int getMaxIdle() {
            return maxIdle;
        }
 
        public void setMaxIdle(int maxIdle) {
            this.maxIdle = maxIdle;
        }
 
        public int getMaxWaitMillis() {
            return maxWaitMillis;
        }
 
        public void setMaxWaitMillis(int maxWaitMillis) {
            this.maxWaitMillis = maxWaitMillis;
        }
 
        public int getTimeOut() {
            return timeOut;
        }
 
        public void setTimeOut(int timeOut) {
            this.timeOut = timeOut;
        }
    }
 
}