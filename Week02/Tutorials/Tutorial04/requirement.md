# Before Week 02 · Tutorial 04

**You will learn:** move two array indices and update a fixed-size window sum.

**Already know:** array indices, loops, and Big-O from [Week 1 Tutorial 04](../../../Week01/Tutorials/Tutorial04/requirement.md).

## Terms and syntax

| Term / syntax | Meaning |
| --- | --- |
| Sorted ascending | Each next value is at least the preceding value |
| Two pointers | Two integer indices tracking different positions in an array |
| Distinct indices | Different positions; their stored values may still be equal |
| Contiguous window | Adjacent elements with no gaps |
| Fixed width k | Exactly k elements in every window |
| `left++` / `right--` | Move an index one position right / left |
| `long sum` | A 64-bit integer total, wider than int |
| `(long) a + b` | Convert a before addition so the addition uses long arithmetic |
| `sum -= x` / `sum += y` | Subtract x / add y to the stored total |

An int can overflow before assignment to long. `(long) (a + b)` does not repair an overflow that already happened inside the parentheses.

## One window move

```text
Values: [6, 2, 4]
Width:  2
First window: [6, 2], sum 8
Next window:  [2, 4], sum 8 - 6 + 4 = 6
```

Sorted order lets a pair scan decide which end to move from a sum comparison. Windows use adjacency, so their input need not be sorted.

## Boundaries to recognise

A width must lie in 1..array.length. Throw IllegalArgumentException for an invalid width. If every window sum is negative, zero is not an actual candidate maximum. Empty or one-item arrays cannot provide two distinct indices.

`Math.max(a, b)` chooses the larger total. Keep input arrays unchanged; changing index variables does not change their elements.

## Ready to start?

- [ ] I can identify a window’s entering and leaving values.
- [ ] I can explain distinct indices and why widening must happen before addition.

[Start the tutorial →](README.md)
