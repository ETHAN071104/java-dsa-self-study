# Week 02 · Tutorial 02

## Frequency maps & unique values

**Read first:** [requirement.md](requirement.md)

---

### 1. Write the statements

**a.** Declare a Map<Character, Integer> and store `'a' → 2`.

```java


```

**b.** Read the count of z with a default of zero. Print whether z is now a key.

```java


```

**c.** Increment the count of a.

```java


```

**d.** Add `"Oak"`, `"oak"`, and `"Oak"` to a HashSet. Print the boolean returned by each add call.

```java


```

---

### 2. Correct the errors

**a.**

```java
// Inside a loop: count every occurrence of word.
counts.put(word, 1);
```

**Correction**

```java


```

**b.**

```java
// Skip null and blank words inside a loop.
if (word == null && word.trim().isEmpty()) continue;
```

**Correction**

```java


```

**c.**

```java
// Print "duplicate" only for a previously seen word.
seen.add(word);
if (seen.contains(word)) System.out.println("duplicate");
```

**Correction**

```java


```

---

### 3. Trace normalization and counting

Ignore null and blank entries, trim outer whitespace, and preserve case.

| Raw input | Normalized / ignored | Counts so far |
| --- | --- | --- |
| `" red "` | | |
| `"Blue"` | | |
| `"red"` | | |
| null | | |
| `" "` | | |
| `"blue"` | | |
| `"Blue"` | | |

---

### 4. Find the first unique word

For `["zebra", "apple", "zebra", "pear"]`, write the final counts and the first word that occurs once.

A complete frequency map is available as counts. Write a condition checking that a word occurs exactly once. Why is HashMap key order unsuitable for choosing the first input word?

**Solution**

```java


```

---

### 5. Write a map-processing method

Write `static int numberOfRepeatedKeys(Map<String, Integer> counts)`. Return the number of keys with count greater than 1. Assume all counts are positive and non-null.

For `{oak=3, pine=1, elm=2}`, return 2.

**Solution**

```java


```

---

### 6. Answer the questions

**a.** Give an input where returning the first word whose count becomes 1 produces the wrong final unique word.

**b.** Two objects are equal by ID but hash their different names. Which rule is broken? What can happen if a stored key’s ID changes?

**c.** For n words and u distinct words, state the expected time for counting plus a second scan, and the count map’s space. Treat word lengths as bounded.

**Answer**

```text


```
