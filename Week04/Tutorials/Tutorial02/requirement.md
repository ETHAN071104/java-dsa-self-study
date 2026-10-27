# Before Week 04 · Tutorial 02

**You will learn:** trace insertion-sort shifts and verify ordering without losing values.

**Already know:** array assignment, index bounds, loops, and Big-O; review [Week 1 Tutorial 04](../../../Week01/Tutorials/Tutorial04/requirement.md).

## Terms and operations

| Term / syntax | Meaning |
| --- | --- |
| Sorted prefix | Beginning of the array already in order |
| Pass | One outer-loop iteration inserting the next value |
| Key | The value saved for insertion before elements move |
| Shift right | Copy a value to the following array position |
| `a[j + 1] = a[j]` | Copy one element; it is not a swap |
| `j--` | Move the index one position left |
| In-place | Reuse the input array instead of allocating a replacement output array |
| Nondecreasing | Each value is no larger than the following value; equal values are allowed |
| Stable ordering | Equal values keep their relative input order |

## One shift

```java
int[] values = {3, 9, 5};
int saved = values[2];  // preserve 5
values[2] = values[1]; // [3, 9, 9]
```

This is only a shift, not a completed sort. The saved value still exists in saved, so the temporary duplicate 9 does not mean 5 has been forgotten.

## Things to recognise before tracing

Guard an index before reading the array. In a condition joined with &&, the right side is evaluated only if the left side is true.

Sortedness and preserving values are separate properties. A wrong result can be ordered but contain missing or invented values. Label equal values A/B on paper when tracing stability.

For the comparison question: selection sort repeatedly selects from the remaining suffix; merge sort splits into smaller parts and merges sorted results using a temporary buffer. Best/worst case describe different input orders; auxiliary space counts additional working memory.

## Ready to start?

- [ ] I can explain a shift versus a swap and why a value is saved first.
- [ ] I know that checking ascending order alone cannot prove a correct sort.

[Start the tutorial →](README.md)
