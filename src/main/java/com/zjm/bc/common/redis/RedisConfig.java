package com.zjm.bc.common.redis;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Getter
@Setter
@ToString
@Component
@ConfigurationProperties(prefix = "spring.redis")
public class RedisConfig {

    private String host;

    private int port;

    private String password;

    private int maxActive;

    private int maxIdle;

    private int maxWait;

    private int timeout;

    public static void main(String[] args) {
        System.out.println(new RedisConfig().toString());
    }

}
