package test;

import org.ehcache.Cache;
import org.ehcache.CacheManager;
import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;

import java.util.Calendar;

/**
 * @author huy
 * @date 2018/10/10 9:55
 * @description
 */
public class CaseOne {
    public static void main(String[] args) {
        CacheManager cacheManager = CacheManagerBuilder.newCacheManagerBuilder().withCache("preConfigured", CacheConfigurationBuilder.newCacheConfigurationBuilder(String.class, Object.class, ResourcePoolsBuilder.heap(100)).build()).build(true);
        Cache<String, Object> preConfigured = cacheManager.getCache("preConfigured", String.class, Object.class);
        Cache<String, Long> myCache = cacheManager.createCache("myCache", CacheConfigurationBuilder.newCacheConfigurationBuilder(String.class, Long.class, ResourcePoolsBuilder.heap(100)).build());
        myCache.put("current", Calendar.getInstance().getTimeInMillis());
        preConfigured.put("cfgTest", Calendar.getInstance());
        System.out.println(myCache.get("current").toString());
        System.out.println(preConfigured.get("cfgTest").toString());
        cacheManager.close();
    }
}
