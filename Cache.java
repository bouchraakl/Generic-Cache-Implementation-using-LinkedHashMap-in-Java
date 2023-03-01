package genericOne;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cache<K, V> {

    @Override
    public String toString() {
        return "Cache{" +
                "maxSize=" + maxSize +
                ", cache=" + cache +
                '}';
    }

    private final int maxSize;
    private final Map<K, V> cache;

    public Cache(int maxSize) {
        this.maxSize = maxSize;
        this.cache = new LinkedHashMap<K, V>(maxSize, 0.75f, true);
    }

    public void put(K key, V value) {
        if (isFull()) {
            subFinal();
        }
        cache.put(key, value);
    }

    private void subFinal() {
        Map.Entry<K, V> lastEntry = null;
        for (Map.Entry<K, V> entry : cache.entrySet()) {
            lastEntry = entry;
        }
        if (lastEntry != null) {
            K lastKey = lastEntry.getKey();
            V lastValue = lastEntry.getValue();
            cache.remove(lastKey, lastValue);
        }
    }

    private boolean isFull() {
        return cache.size() > maxSize;
    }

    public Object get(K key) {
        if (cache.get(key) == null) {
            return null;
        }
        return cache.get(key);
    }

    public void clear() {
        cache.clear();
    }
}
