# Before Week 02 · Tutorial 02

**You will learn:** count occurrences and choose the first value that appears exactly once.

**Already know:** null checks, trimming, and list order from [Tutorial 01](../Tutorial01/requirement.md); [set/map basics](../../../Week01/Tutorials/Tutorial03/requirement.md).

## Vocabulary and methods

| Term / call | Meaning |
| --- | --- |
| Frequency | How many times a value occurs |
| Unique in the full input | Appears exactly once overall |
| `Map<Character, Integer>` | Character keys associated with integer counts |
| `map.put(k, v)` | Store v for k; overwrite any old value |
| `map.get(k)` | Read a value; an absent HashMap key returns null |
| `map.getOrDefault(k, 0)` | Read the stored value, or zero if absent; does not insert |
| `map.containsKey(k)` | Test key membership |
| `map.values()` | Collection of stored values, useful for scanning counts |
| `map.keySet()` | Set of stored keys; HashMap does not promise input order |
| `set.add(x)` | Return whether x was newly inserted |

`Integer` and `Character` are object forms of int and char for generics. Java can unbox Integer to int, but unboxing null throws NullPointerException.

## Small example

```java
import java.util.HashMap;
import java.util.Map;
// Inside main:
Map<String, Integer> visits = new HashMap<>();
visits.put("desk", 3);
int before = visits.getOrDefault("desk", 0);
visits.put("desk", before + 1);
System.out.println(visits.get("desk")); // 4
```

Reading a missing key and adding one needs an initial count. HashMap iteration order cannot tell you which word was first in the original input. A word that is new now might occur again later.

## Before comparing results

Use identical trimming/null/blank rules in both passes. Case-sensitive counting treats `"Room"` and `"room"` differently. Keep hash-key identity fields unchanged while stored, and use consistent equals/hashCode rules.

For complexity, n is the number of input words and u the number of distinct accepted words. Say whether word-length costs are included.

## Ready to start?

- [ ] I can explain an overwrite versus a count increment.
- [ ] I understand “first seen” and “occurs exactly once” are different conditions.

[Start the tutorial →](README.md)
