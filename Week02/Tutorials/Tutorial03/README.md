# Week 02 · Tutorial 03

## Comparators & sorting

**Read first:** [requirement.md](requirement.md)

---

### 1. Write the comparisons and statements

**a.** Compare Integer.MAX_VALUE and -1 safely without subtraction.

```java


```

**b.** Compare `"Pear"` and `"plum"` case-insensitively.

```java


```

**c.** Copy List<String> words into a separate list and sort the copy by increasing length.

```java


```

**d.** Write a Comparator<Integer> for descending order without subtraction.

```java


```

---

### 2. Correct the errors

**a.**

```java
// Preserve words. Assume byLength is a valid comparator.
List<String> copy = words;
copy.sort(byLength);
```

**Correction**

```java


```

**b.**

```java
// Compare safely for all int values.
Comparator<Integer> order = (a, b) -> a - b;
```

**Correction**

```java


```

**c.**

```java
// Compare by length, then by name only when lengths tie.
int result = Integer.compare(first.length(), second.length());
return String.CASE_INSENSITIVE_ORDER.compare(first, second);
```

**Correction**

```java


```

---

### 3. Determine the sorted order

Sort `["fig", "PEAR", "pear", "kiwi", "plum", "a"]` by increasing length, then case-insensitive name, using List.sort.

Which values tie on both keys? What happens to their relative order?

**Answer**

```text


```

---

### 4. Complete the comparator

Assume both strings are non-null. Compare by increasing length, then case-insensitive name.

```java
public int compare(String first, String second) {
    // Complete this method.
}
```

Check the comparison signs for `("a", "bee")`, `("Pear", "plum")`, and `("PEAR", "pear")`.

**Solution**

```java


```

---

### 5. Implement natural order

```java
final class Rank implements Comparable<Rank> {
    private final int value;
    Rank(int value) { this.value = value; }

    @Override
    public int compareTo(Rank other) {
        // Compare by increasing value without subtraction.
    }
}
```

How could a separate comparator request the reverse order?

**Solution**

```java


```

---

### 6. Plan and check a sorted copy

Input: `[" Pear ", null, "fig", " ", "pear"]`. Ignore null/blank entries, trim, then sort by length and case-insensitive name.

**a.** Write the expected output and a check that the original list remains unchanged.

**b.** If a copied list contains mutable Student objects, are those objects independent copies? Does changing a sort field automatically reorder the list?

**c.** State time and output space for comparison-sorting m accepted words, assuming bounded word lengths.

**Answer**

```text


```
