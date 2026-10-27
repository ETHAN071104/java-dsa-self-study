# Before Week 01 · Tutorial 03

**You will learn:** compare object identity, store distinct values, and look up counts or indices.

**Already know:** references, `new`, `if`, and loops; review [Tutorial 01](../Tutorial01/requirement.md).

## Equality and collection vocabulary

| Syntax | Meaning |
| --- | --- |
| `a == b` for objects | Are these references pointing to the same object? |
| `a.equals(b)` | Are they equal under the class's equality rule? |
| `Set<T>` | A collection of distinct values; HashSet is a hash-based implementation |
| `Map<K, V>` | Associate keys with values; HashMap is a hash-based implementation |
| `<String, Integer>` | String keys and Integer values; generics use `Integer`, not primitive `int` |
| `set.add(x)` | Insert x; return false if an equal value was already present |
| `set.contains(x)` / `set.size()` | Check membership / count stored elements |
| `map.put(key, value)` | Insert or replace that key's value |
| `map.get(key)` | Read its value; returns null for an absent key in HashMap |
| `map.containsKey(key)` | Check whether a key exists |
| `map.getOrDefault(key, 0)` | Read the value, or use 0 if the key is absent; no insertion |

## Small example

```java
import java.util.HashMap;
import java.util.Map;
// Inside main:
Map<String, Integer> rooms = new HashMap<>();
rooms.put("Lab", 12);
System.out.println(rooms.get("Lab"));             // 12
System.out.println(rooms.getOrDefault("Hall", 0)); // 0
```

For sets, import `java.util.Set` and `java.util.HashSet`.

## Custom identity

- Equal objects must have equal hash codes. Matching hashes alone do not prove equality.
- `equals(Object other)` can receive another type or null. `other instanceof Card` checks the type; `(Card) other` casts after that check.
- `java.util.Objects.equals(a, b)` and `Objects.hashCode(a)` handle null values. Import `java.util.Objects` when using the short name.
- Keep identity fields stable while objects are used as hash keys. `final` prevents reassigning a field after initialization.

A frequency is an occurrence count. A complement is the missing partner: target 11 with current value 4 needs 7. A map can store the index where a value was seen earlier.

## Ready to start?

- [ ] I can explain `==`, equals, and why a missing map entry needs handling.
- [ ] I can choose a set for membership or a map for associated values.

[Start the tutorial →](README.md)
