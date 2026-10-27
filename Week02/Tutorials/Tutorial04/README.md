# Week 02 · Tutorial 04

## Two pointers & sliding windows

**Read first:** [requirement.md](requirement.md)

---

### 1. Write the statements

**a.** Set left and right to the ends of a sorted integer array.

```java


```

**b.** Calculate the sum of the endpoint values as long without overflowing an intermediate int.

```java


```

**c.** Write a condition requiring two distinct indices. Which pointer moves when the sum is below target?

```java


```

**d.** A window has width k and a new rightmost index i. Write the index leaving the window and update its long sum.

```java


```

---

### 2. Correct the errors

**a.**

```java
// Require distinct indices.
while (left <= right) { /* pair scan */ }
```

**Correction**

```java


```

**b.**

```java
// Avoid intermediate integer overflow.
long sum = (long) (sorted[left] + sorted[right]);
```

**Correction**

```java


```

**c.**

```java
// The first window's sum is firstSum. All windows may be negative.
long best = 0;
```

**Correction**

```java


```

**d.**

```java
// Reject k outside 1..values.length.
if (k < 1 && k > values.length) {
    throw new IllegalArgumentException("Invalid k");
}
```

**Correction**

```java


```

---

### 3. Trace a pair search

Array: `[-3, 0, 2, 5, 9]`. Target: 7. Start at opposite ends.

| left | right | Sum | Next action |
| --- | --- | --- | --- |
| 0 | 4 | | |

Continue until a match is found or the pointers meet. Compare `[3]` and `[3,3]` for target 6.

**Answer**

```text


```

---

### 4. Trace the windows

Array: `[2, -1, 4, 3]`. Window width: 2.

| Window | Leaving value | Entering value | Sum | Best so far |
| --- | --- | --- | --- | --- |
| 0..1 | — | — | | |
| 1..2 | | | | |
| 2..3 | | | | |

Repeat for `[-5,-2,-7]` with width 2.

**Answer**

```text


```

---

### 5. Write a first-window method

Write `static long firstWindowSum(int[] values, int k)` for a non-null array. Reject k outside 1..values.length with IllegalArgumentException; otherwise sum the first k values.

Test k=1, k=values.length, k=0, and an empty array with k=1.

**Solution**

```java


```

---

### 6. Explain and test the boundaries

**a.** Give an unsorted array where the sorted two-pointer rule misses a pair.

**b.** Why does the fixed-window update still work with negative values?

**c.** State time and auxiliary space for a two-pointer pair scan and a fixed-window maximum scan.

**d.** Give a two-element window whose sum exceeds Integer.MAX_VALUE and state its correct sum.

**Answer**

```text


```
