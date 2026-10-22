# Week 2 · Lab 02 — Sorted pairs and fixed windows

**Classification:** additional Java/DSA self-study; not official WIX1002 lab work. **Starter:** [PairAndWindow.java](PairAndWindow.java). The starter has placeholders, not working implementations.

## Problem statement

Implement two independent methods for integer arrays. This lab does not repeat Week 1's general Two Sum task: the pair task requires sorted input and focuses on two-pointer reasoning; the window task focuses on maintaining a contiguous range.

### Task W2-L02-01 — Pair in a sorted array

Implement `hasPairWithSum(int[] sortedValues, int target)`.

- Input is already sorted in nondecreasing order; do not sort or mutate it.
- Use two distinct indices.
- Return whether any such pair sums to `target`.
- Examples: `[-2, 1, 4, 8], 6 → true`; `[1, 2, 4], 20 → false`.
- Empty, one-element, duplicate-value-at-distinct-indices, and negative-value cases must be considered.

### Task W2-L02-02 — Maximum fixed-window sum

Implement `maxWindowSum(int[] values, int k)` returning a `long` sum.

- Return the maximum sum of exactly `k` adjacent values.
- `1 <= k <= values.length`; throw `IllegalArgumentException` otherwise.
- Do not mutate the array.
- Example: `[2, -1, 4, 3], 2 → 7`.
- Also test a single window, all-negative values, and a window containing zero.

Use a sliding update after the first window instead of independently resumming every window.

## Test cases and expected behavior

- `hasPairWithSum(new int[]{}, 0)` is `false`.
- `hasPairWithSum(new int[]{3, 3}, 6)` is `true`.
- `maxWindowSum(new int[]{-5, -2, -7}, 2)` is `-7`.
- Invalid `k` values `0` and `values.length + 1` throw `IllegalArgumentException`.
- Confirm both input arrays are unchanged.

## Complexity and completion

Write time and auxiliary-space complexity for each method. Explain why sorting is a precondition and why negative numbers do not invalidate a fixed-size window.

- [ ] Both methods attempted without copying a complete solution.
- [ ] Boundary and expected-output cases checked.
- [ ] Complexity analysis distinguishes the scan from extra storage.
