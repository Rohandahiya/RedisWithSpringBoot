package com.example.redisRevise;

import com.fasterxml.jackson.databind.JsonSerializable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import javax.sound.midi.SysexMessage;

@Configuration
public class RedisConfig {

    @Bean
    LettuceConnectionFactory lettuceConnectionFactory(){

        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration("redis-10732.c264.ap-south-1-1.ec2.cloud.redislabs.com",10732);
        redisStandaloneConfiguration.setPassword("WbzS0KbVrxVHv40vkPAwnLUZoamhufhg");

        return new LettuceConnectionFactory(redisStandaloneConfiguration);
    }

    @Bean
    RedisTemplate<String,Object> getRedisTemplate(){
        System.out.println("ehehehehehehehehehehehehehehehehhe");
        RedisTemplate<String,Object> redisTemplate = new RedisTemplate();

        RedisSerializer<String> stringRedisSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(stringRedisSerializer);

        JdkSerializationRedisSerializer jdkSerializationRedisSerializer = new JdkSerializationRedisSerializer();
        redisTemplate.setValueSerializer(jdkSerializationRedisSerializer);
        redisTemplate.setHashKeySerializer(jdkSerializationRedisSerializer);
        redisTemplate.setConnectionFactory(lettuceConnectionFactory());
        return redisTemplate;

    }
}
