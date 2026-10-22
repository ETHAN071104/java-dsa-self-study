# Week 4 · Lab 01 — Binary search and JUnit

**Classification:** additional Java/DSA self-study, not official WIX1002 lab work. **Starters:** [BinarySearch.java](BinarySearch.java) and [BinarySearchTest.java](BinarySearchTest.java). The implementation is unfinished. JUnit file assumes JUnit 5 is already configured; do not install it for this exercise.

## Problem statement

Implement binary search over a sorted ascending integer array.

### Task W4-L01-01 — Search with a contract

Implement `search(int[] values, int target)`.

- Return any valid matching index; return -1 when absent.
- Empty arrays return -1. Duplicates may return any one matching index.
- Do not sort or mutate the array.
- Target below/above bounds and a one-element array must be handled.

Example: `[-4, 0, 3, 8, 11, 17], target 8 → 3`; target 5 returns -1.

### Task W4-L01-02 — Write behavior tests

Complete or adapt the JUnit starter after the implementation contract is clear.

- Include empty input, one-element hit/miss, lower/upper boundary hits, absent target, and duplicates.
- For duplicates, assert the result is one of the valid indices, not a specific index.
- If JUnit is unavailable, preserve the same cases as manual test specifications.

## Acceptance and debugging

Use a breakpoint or a trace table for a target below the midpoint and one above it. Confirm each iteration strictly shrinks the interval and the input remains unchanged.

## Complexity and completion

State time and auxiliary-space complexity. Explain why the sorted precondition permits discarding half the interval.

- [ ] Search contract documented and implemented by me.
- [ ] Empty, duplicate, and boundary cases tested.
- [ ] Input immutability checked.
- [ ] Complexity explained without copying a solution.
