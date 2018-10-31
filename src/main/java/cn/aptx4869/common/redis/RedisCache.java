package cn.aptx4869.common.redis;

import org.apache.ibatis.cache.Cache;

import java.util.concurrent.locks.ReadWriteLock;

/**
 * @author huy
 * @date 2018/10/31 16:34
 * @description
 */
public class RedisCache implements Cache {
    public String getId() {
        return null;
    }

    public void putObject(Object key, Object value) {

    }

    public Object getObject(Object key) {
        return null;
    }

    public Object removeObject(Object key) {
        return null;
    }

    public void clear() {

    }

    public int getSize() {
        return 0;
    }

    public ReadWriteLock getReadWriteLock() {
        return null;
    }
}
