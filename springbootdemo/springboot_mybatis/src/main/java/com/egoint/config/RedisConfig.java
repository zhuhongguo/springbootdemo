package com.egoint.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class RedisConfig {
	 @Bean  
	    @ConfigurationProperties(prefix = "spring.redis.pool")  
	    public JedisPoolConfig getRedisConfig() {  
	        JedisPoolConfig config = new JedisPoolConfig();  
	        /*config.setMaxIdle(8);
	        config.setMinIdle(0);
	        config.setMaxWaitMillis(-1);
	        config.setTestOnBorrow(true);*/
	        return config;  
	    }  
	  
	    @Bean  
	    @ConfigurationProperties(prefix = "spring.redis")  
	    public JedisConnectionFactory getConnectionFactory() {  
	        JedisConnectionFactory factory = new JedisConnectionFactory();  
	        factory.setUsePool(true);  
	        JedisPoolConfig config = getRedisConfig();  
	        factory.setPoolConfig(config); 
	        /*factory.setHostName("192.168.91.128");
	        factory.setPassword("123456");
	        factory.setPort(6379);
	        factory.setTimeout(0);*/
	        return factory;  
	    }  
	  
	  
	    @Bean  
	    public RedisTemplate<?, ?> getRedisTemplate() {  
	        RedisTemplate<?, ?> template = new StringRedisTemplate(getConnectionFactory());  
	        return template;  
	    }  
	    
}
