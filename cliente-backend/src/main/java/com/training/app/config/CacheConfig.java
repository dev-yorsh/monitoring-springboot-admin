/*
 * Copyright (c) 2023.
 * @Author: Yorsh
 * @Social: www.linkedin.com/in/jorge-pr
 */

package com.training.app.config;

import com.hazelcast.config.*;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class CacheConfig {

    //CACHE - HAZELCAST
    @Bean
    public Config hazelCastConfig() {
        Config config = new Config(); //1
        config.setInstanceName("hazelcast-cache"); //1
        config.setProperty("hazelcast.rest.enabled", "true"); //1
        MapConfig allUsersCache = new MapConfig(); //2
        allUsersCache.setTimeToLiveSeconds(10); //2
        allUsersCache.setEvictionConfig(new EvictionConfig().setEvictionPolicy(EvictionPolicy.LFU)); //2
        config.getMapConfigs().put("map",allUsersCache); //2
        return config;
    }

/*    @Bean
    public Config hazelCastConfig() {
        return new Config().setInstanceName("hazel-instance")
                .setProperty("hazelcast.rest.enabled", "true")
                .addMapConfig(new MapConfig().setName("product-cache").setTimeToLiveSeconds(10)
                        .setEvictionConfig(new EvictionConfig().setEvictionPolicy(EvictionPolicy.LRU))
                );

    }*/

 /*   @Bean
    public CacheManager cacheManager() {
        return new ConcurrentMapCacheManager("cache-cliente");
    }
 */

}
