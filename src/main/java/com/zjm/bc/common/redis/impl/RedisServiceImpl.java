package com.zjm.bc.common.redis.impl;

import com.zjm.bc.common.redis.IRedisService;
import com.zjm.bc.common.redis.RedisConfig;
import lombok.Cleanup;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.PostConstruct;

@Service("redisService")
public class RedisServiceImpl implements IRedisService {

    @Autowired
    private RedisConfig redisConfig;

    private JedisPool jedisPool;

    @PostConstruct
    private void init(){
        GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
        poolConfig.setMaxIdle(redisConfig.getMaxIdle());
        poolConfig.setMaxTotal(redisConfig.getMaxActive());
        poolConfig.setMaxWaitMillis(redisConfig.getMaxWait());

        jedisPool = new JedisPool(poolConfig,redisConfig.getHost(), redisConfig.getPort(),redisConfig.getTimeout(),redisConfig.getPassword());
   }

    @Override
    public int set(String key, String value) {
        Jedis jedis = null;
         try {
             jedis = jedisPool.getResource();
             jedis.set(key, value);
         }catch (Exception e){

         }finally {
             if (null != jedis){
                 jedis.close();
             }
         }
        return 1;
    }

    @Override
    public String get(String key) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            String result = jedis.get(key);
            return result;
        }catch (Exception e){

        }finally {
            if (null != jedis){
                jedis.close();
            }
        }
        return null;
    }
}
