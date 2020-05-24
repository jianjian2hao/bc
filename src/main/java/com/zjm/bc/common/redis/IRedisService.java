package com.zjm.bc.common.redis;

public interface IRedisService {

    /**
     * redis setString
     * @param key
     * @param value
     * @return
     */
    int set(String key, String value);

    /**
     * redis getStrings
     * @param key
     * @return
     */
    String get(String key);
}
