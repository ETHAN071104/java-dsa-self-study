# Before Week 04 · Tutorial 01

**You will learn:** track binary-search bounds and handle empty, missing, and duplicate cases.

**Already know:** array indices, integer division, and Big-O from [Week 1 Tutorial 04](../../../Week01/Tutorials/Tutorial04/requirement.md).

## Vocabulary and syntax

| Term / syntax | Meaning |
| --- | --- |
| Sorted ascending | Values never decrease as indices increase |
| Inclusive `[left, right]` | Both boundary indices are candidates |
| `left <= right` | At least one candidate remains |
| `values.length - 1` | Last index; -1 for an empty array |
| `left + (right - left) / 2` | Midpoint avoiding left+right overflow for valid nonnegative bounds |
| Integer division | Discard the fractional part: `5 / 2` gives 2 |
| `return index` / `return -1` | Report a match / report absence under this contract |
| Short-circuit check | Use && so an invalid index stops evaluation before array access |

## One comparison

```text
Array: [1, 4, 8, 12, 15]
Target: 12
Bounds: left=0, right=4
Midpoint: index 2, value 8
```

Since 8 is below 12 and the array is sorted, indices up to 2 cannot contain the target. The next candidate interval begins after that midpoint.

## Contract and progress

A **contract** states the required input and result. Here input is already sorted and must stay unchanged. With duplicates, any matching index is valid; it need not be the first.

An **invariant** stays true during the loop: if the target exists, a candidate remains in the current interval. Each missed comparison must shrink that interval. Computing a midpoint does not itself prove the interval is nonempty.

O(log n) describes repeatedly reducing candidates by roughly half. Extra variables for bounds and midpoint take constant space.

## Ready to start?

- [ ] I can distinguish an array index from the value stored there.
- [ ] I can explain inclusive bounds and why a miss must remove the midpoint.

[Start the tutorial →](README.md)
