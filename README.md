# Cache class implementation

This is a Java implementation of a cache with a fixed maximum size. The implementation uses a LinkedHashMap to store key-value pairs and to maintain the insertion order of elements in the cache.

## Usage
To use the Cache class, you need to create an instance of the class with a maximum size parameter. The maximum size specifies the maximum number of elements that can be stored in the cache.
```
Cache<Integer, String> cache = new Cache<>(100);
```

You can then use the put method to add key-value pairs to the cache.
```
cache.put(1, "One");
cache.put(2, "Two");
cache.put(3, "Three");
```

You can use the get method to retrieve the value associated with a key.
```
String value = cache.get(1);
```

If the key is not present in the cache, the get method will return null.
```
String value = cache.get(4);
```

You can use the clear method to remove all elements from the cache.
```
cache.clear();
```
