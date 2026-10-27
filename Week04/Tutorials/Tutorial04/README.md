# Week 04 · Tutorial 04

## Testing, debugging & Java review

**Read first:** [requirement.md](requirement.md)

---

### 1. Write expected search behavior

Search returns any matching index or -1, and must preserve the array.

| Input | Target | Expected result / condition | Purpose |
| --- | --- | --- | --- |
| `[]` | 4 | | |
| `[5]` | 5 | | |
| `[5]` | 2 | | |
| `[2,4,6]` | 2 | | |
| `[2,4,6]` | 6 | | |
| `[2,4,6]` | 3 | | |
| `[1,3,3,7]` | 3 | | |

---

### 2. Correct the tests

Use JUnit 5 assertions or equivalent manual checks.

**a.**

```java
// Any matching duplicate index is valid.
assertEquals(1, BinarySearch.search(new int[]{1,3,3,7}, 3));
```

**Correction**

```java


```

**b.**

```java
// Check that search preserves input contents.
int[] before = values;
BinarySearch.search(values, 5);
assertArrayEquals(before, values);
```

**Correction**

```java


```

**c.**

```java
// Validate index before reading values[index].
assertTrue(values[index] == target && index >= 0 && index < values.length);
```

**Correction**

```java


```

---

### 3. Trace a search bug

Use `[1,2]`, target 2, and initial inclusive bounds left=0, right=1. Equality has already been handled.

```java
if (values[mid] < target) {
    left = mid;
} else {
    right = mid - 1;
}
```

Trace two iterations. Identify the repeated state, correct the update, and specify a regression test.

**Answer**

```text


```

---

### 4. Write behavior checks

**a.** Write a JUnit 5 test or manual check for search on `[2,4,6]`, target 6. Check the returned index and unchanged input. Include imports if using JUnit.

```java


```

**b.** Write a check that insertionSort changes `[3,-1,3]` into the correct ascending array, preserving duplicate values.

```java


```

---

### 5. Practise lambdas and streams

**a.** Write a descending integer comparator lambda. Use it to sort a copy of `[4,1,3]` without changing the original list.

```java


```

**b.** Write a stream pipeline that selects positive integers from a List<Integer> and squares them. Assume squares fit in int. Collect into a new list.

```java


```

**c.** Determine result and the final contents of words. Identify the intermediate and terminal operations.

```java
List<String> words = new ArrayList<>(Arrays.asList("bee", "a", "oak"));
List<String> result = words.stream()
    .filter(word -> word.length() >= 3)
    .map(word -> word.toUpperCase())
    .collect(Collectors.toList());
```

**Answer**

```text


```

---

### 6. Prepare a test plan

**a.** Give inputs and expected outputs for insertion sort: empty, single, sorted, reverse sorted, negative, and duplicate values.

**b.** Give depth and preorder expectations for null, a leaf, a balanced tree, and a one-sided tree.

**c.** Classify: missing semicolon; reading values[-1]; returning -1 for an existing target; recursion that never reaches a base case.

**d.** State time and auxiliary space for binary search, insertion sort, and recursive preorder.

**Answer**

```text


```
