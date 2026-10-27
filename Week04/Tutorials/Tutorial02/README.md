# Week 04 · Tutorial 02

## Insertion sort

**Read first:** [requirement.md](requirement.md)

---

### 1. Write one-pass statements

The prefix before index i is already sorted. Insert values[i] into that prefix.

**a.** Save values[i] as key.

```java


```

**b.** Set j to the index immediately before i.

```java


```

**c.** Shift values[j] one position right, then move j left.

```java


```

**d.** Place key in the gap at j+1.

```java


```

---

### 2. Correct the errors

**a.**

```java
// Check bounds before reading values[j].
while (values[j] > key && j >= 0) { /* shift */ }
```

**Correction**

```java


```

**b.**

```java
// Sort ascending by shifting larger prefix values.
while (j >= 0 && values[j] < key) { /* shift */ }
```

**Correction**

```java


```

**c.**

```java
// Insert the saved key after shifting.
values[j + 1] = values[i];
```

**Correction**

```java


```

---

### 3. Trace each pass

Start with `[5,1,4,1]`. Label the two equal values 1A and 1B when tracking their order.

| Pass i | key | Shifted values | Array after insertion |
| --- | --- | --- | --- |
| 1 | | | |
| 2 | | | |
| 3 | | | |

Repeat for `[1,2,3]`. How many shifts occur?

**Answer**

```text


```

---

### 4. Complete one insertion pass

```java
int key = values[i];
int j = i - 1;
while (/* condition */) {
    // Shift one value right and move j left.
}
// Insert key.
```

Trace the completed fragment for `[2,6,8,3]` with i=3.

**Solution**

```java


```

---

### 5. Write a sortedness checker

Write `static boolean isNondecreasing(int[] values)`. Compare adjacent values without sorting. Return true for empty and single-element arrays.

Does a true result prove all original values were preserved? Give a counterexample.

**Solution**

```java


```

---

### 6. Compare sorting costs

Use standard insertion sort, selection sort that scans the remaining suffix, and array merge sort with a temporary buffer.

| Algorithm | Best time | Worst time | Auxiliary space |
| --- | --- | --- | --- |
| Insertion sort | | | |
| Selection sort | | | |
| Merge sort | | | |

For reverse-sorted n elements, count insertion sort’s shifts. Which algorithm would you consider for a small nearly sorted array, and for a large arbitrary array?

**Answer**

```text


```
