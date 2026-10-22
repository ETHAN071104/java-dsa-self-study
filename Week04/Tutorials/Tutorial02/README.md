# Week 4 · Tutorial 02 — Implement Binary Search

**Source:** supplementary practice based on the 19-week roadmap; the individual Week 4 Notion page is empty.

## Practical challenge

Implement `search(int[] values, int target)` for an ascending sorted array. Return any valid matching index, or `-1` when the target is absent. The method must not sort or mutate the input.

**Check:** empty arrays, one-item hit/miss, boundaries, absent values, and duplicates follow the contract.

## Implementation milestones

1. Before coding, write a linear search and note how many values it might inspect.
2. For `[-4, 0, 3, 8, 11, 17]`, draw the inclusive candidate interval for target `3`, then target `5`.
3. Implement an interval with `left`, `right`, and a midpoint. After comparing, discard the midpoint and the half that cannot contain the target.
4. Trace the interval after every loop iteration. Verify it gets smaller even when the target is absent.
5. Use a midpoint expression that avoids overflow for large nonnegative indices.

## Concept discovery

**Concept note (Chinese):** 二分查找依赖升序这一前提。每次比较中间值后，排序性质保证目标只可能留在一侧，所以可以丢弃另一半。循环不变量是：若目标存在，它仍在当前候选区间内。每轮必须排除 `mid`，否则边界不变时可能无限循环。时间为 O(log n)，额外空间为 O(1)。

## Apply and verify

- Test `{}`; `{7}` with targets `7` and `2`; and `{-4, 0, 3, 8, 11, 17}` with targets `-4`, `17`, `5`, and `8`.
- For `{2, 2, 2}`, accept any returned index from `0` to `2` under this contract.
- Make a trace table with `left`, `right`, `mid`, `values[mid]`, and the next interval.
- Confirm the input array is element-for-element unchanged.

## Explain after coding

1. What information does sorted order give after a midpoint comparison?
2. Why must the new left or right boundary move past `mid`?
3. How many candidates remain after each iteration in the worst case?
4. What changes if the contract asks for the first matching index?

## Independent transfer

Implement a method that returns the insertion position for a target in a sorted array, including when the target is absent. State the boundary invariant and test targets before the first item, between items, and after the last item.

**Acceptance criteria:** all insertion positions are correct; empty input returns position `0`; no input mutation; loop termination is justified.

## Completion checklist

- [ ] I implemented binary search from the contract.
- [ ] I traced successful and unsuccessful searches.
- [ ] I tested empty, duplicate, and boundary cases.
- [ ] I explained the invariant, O(log n) time, and O(1) extra space.
