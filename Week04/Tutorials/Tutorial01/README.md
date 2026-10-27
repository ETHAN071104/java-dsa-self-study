# Week 04 · Tutorial 01

## Binary search

**Read first:** [requirement.md](requirement.md)

---

### 1. Write the boundary statements

Search a non-null array sorted in ascending order. Use inclusive bounds `[left, right]`.

**a.** Initialize left and right from int[] values.

```java


```

**b.** Write a condition for a nonempty candidate interval.

```java


```

**c.** Calculate mid without adding left and right directly.

```java


```

**d.** Update the appropriate boundary when values[mid] is below target, and when it is above target.

```java


```

---

### 2. Correct the errors

**a.**

```java
// Last valid index.
int right = values.length;
```

**Correction**

```java


```

**b.**

```java
// Include a remaining single candidate.
while (left < right) { /* search */ }
```

**Correction**

```java


```

**c.**

```java
// Equality has already been handled.
if (values[mid] < target) left = mid;
else right = mid;
```

**Correction**

```java


```

---

### 3. Trace the search

Array: `[-4,0,3,8,11,17]`. Trace targets 8, 5, -4, and 17 separately.

| left | right | mid | values[mid] | Next interval / result |
| --- | --- | --- | --- | --- |
| | | | | |

**Answer**

```text


```

---

### 4. Determine boundary results

Return any matching index, or -1 when absent.

| Array | Target | Allowed result(s) |
| --- | --- | --- |
| `[]` | 4 | |
| `[5]` | 5 | |
| `[5]` | 2 | |
| `[1,3,3,7]` | 3 | |
| `[2,4,6]` | 1 | |
| `[2,4,6]` | 9 | |

---

### 5. Write an index-checking method

Write `static boolean pointsToTarget(int[] values, int index, int target)`. Return true only when index is valid and values[index] equals target. Handle index=-1 and index=values.length without throwing. Assume values is non-null.

**Solution**

```java


```

---

### 6. Explain termination and cost

**a.** Give a small input where setting left=mid causes a repeated interval.

**b.** Starting with 16 candidates, show how the candidate count shrinks during binary search.

**c.** State iterative binary search’s time and auxiliary space.

**d.** If an array is unsorted, what extra cost would sorting first add? Why would sorting inside search violate a contract requiring unchanged input and original indices?

**Answer**

```text


```
