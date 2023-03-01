package genericOne;

/*Exercise : Write a generic class called Cache that implements a cache with a fixed maximum size.
 The class should have the following methods:
 Cache(int maxSize): constructor that initializes the cache with the specified maximum size.
 void put(K key, V value): adds the specified key-value pair to the cache. If the cache is already
 at its maximum size, it should remove the least recently used item before adding the new item.
 V get(K key): returns the value associated with the specified key in the cache. If the key is not present in
 the cache, it should return null.
 void clear(): clears all items from the cache.
 You should use a LinkedHashMap to implement the cache, and override its removeEldestEntry method to
 enforce the maximum size of the cache.*/

public class Main {
    public static void main(String[] args) {
        Cache<String,Integer> cache = new Cache<>(3);
        cache.put("Aluno1",88);
        cache.put("Aluno2",50);
        cache.put("Aluno3",22);
        cache.put("Aluno3",100);
        System.out.println(cache);
        System.out.println(cache.get("Aluno2"));

    }
}