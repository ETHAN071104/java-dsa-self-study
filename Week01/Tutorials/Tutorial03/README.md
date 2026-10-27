# Week 01 · Tutorial 03

## Equality, sets & maps

**Read first:** [requirement.md](requirement.md)

---

### 1. Write the statements

**a.** Declare a set of integers and add 7 twice. Print its size and whether it contains 7.

```java


```

**b.** Declare a map from student IDs to integer indices. Store `"S8" → 2`, then retrieve that index.

```java


```

**c.** Increase the count for `"java"` by one in a `Map<String, Integer> counts`. Handle an absent key.

```java


```

---

### 2. Correct the errors

**a.**

```java
Set<int> scores = new HashSet<>();
```

**Correction**

```java


```

**b.**

```java
// Compare string contents.
String left = new String("S8");
String right = new String("S8");
System.out.println(left == right);
```

**Correction**

```java


```

**c.**

```java
// "blue" may be absent from the count map.
counts.put("blue", counts.get("blue") + 1);
```

**Correction**

```java


```

---

### 3. Determine the output

```java
String a = new String("cat");
String b = new String("cat");
Set<String> words = new HashSet<>();
System.out.println(a == b);
System.out.println(a.equals(b));
System.out.println(words.add(a));
System.out.println(words.add(b));
System.out.println(words.size());
```

**Answer**

```text


```

---

### 4. Complete the identity methods

Two Cards are equal when their IDs match, including two null IDs. Complete equals and hashCode.

```java
final class Card {
    private final String id;
    Card(String id) { this.id = id; }

    @Override
    public boolean equals(Object other) {
        // Complete this method.
    }

    @Override
    public int hashCode() {
        // Complete this method.
    }
}
```

**Solution**

```java


```

---

### 5. Count repeated occurrences

For `int[] values = {4, 1, 4, 4, 2};`, use a set to count occurrences that repeat an earlier value. Print the count. Count repeated occurrences, not distinct duplicated values.

**Solution**

```java


```

---

### 6. Trace a map of earlier indices

For `{5, 2, 5}`, store value → latest index. Use target 7.

| Index | Value | Needed partner (`target - value`) | Map before insertion | Map after insertion |
| --- | --- | --- | --- | --- |
| 0 | 5 | | | |
| 1 | 2 | | | |
| 2 | 5 | | | |

At index 1, write the map lookup for an earlier partner. Why should lookup happen before insertion when the two indices must be different?

**Solution**

```java


```
