# Week 2 · Tutorial 03 — Sort a Report and Find a Pair

**Source:** redesigned supplementary practice from the Week 2 roadmap; the individual Week 2 Notion page is blank.

## Practical challenge

A score report must display students by ascending score, then case-insensitive name. Separately, given a sorted array of scores and a target, report whether two different positions sum to that target. For a second array, report the largest sum of exactly `k` adjacent values.

**Constraints:** do not mutate either input array/list; the pair array is already sorted; require `1 <= k <= values.length` for a fixed window.

## Implementation milestones

1. Sort a copied student list with a `Comparator<Student>` using score then name. Do not subtract integers in a comparator.
2. Add a `Comparable` implementation to a simple value class in a scratch file. Compare its natural order with the report's external comparator.
3. Trace left/right indices on `[-3, 0, 2, 5, 9]` for target `7`, then implement the pair check.
4. For `[2, -1, 4, 3]`, calculate the first window of width `2`; slide once by subtracting the leaving value and adding the entering value. Implement the maximum window sum.
5. State which objects are mutable and whether changing a student's score after sorting changes the list's stored order automatically.

## Concept discovery

**Concept note (Chinese):** `Comparator` 描述某次排序所需的外部顺序；`Comparable` 定义类型的自然顺序。比较器应依次比较字段并返回比较结果，避免用减法造成整数溢出。排序后的数组允许双指针根据和的大小排除一段候选范围；固定窗口则保留相邻的 `k` 个元素，每次只更新离开和进入的值。可变对象字段改变后，已经排好的列表不会自动重新排序。

## Apply and verify

- For the report, test equal scores, case-different names, and a copy of an unchanged input list.
- For the pair check, test empty input, a pair using two equal values at different indices, no solution, negative values, and a target at the range boundary.
- For the fixed window, test a single window, all-negative values, zero, and invalid `k`.
- Explain why a two-pointer pair scan needs sorted input and why a fixed-width window still works with negative numbers.

## Explain after coding

1. When is a `Comparator` more suitable than `Comparable`?
2. Why is `a.score - b.score` unsafe for general integer scores?
3. Which pointer moves after a sum that is too small, and why?
4. What leaves and enters when a fixed window advances once?

## Independent transfer

Given a sorted list of daily temperatures, find whether two readings sum to a supplied target. Then return the smallest average across any `k` consecutive days. Keep both inputs unchanged and explain each method's complexity.

**Acceptance criteria:** correct results for duplicates, negative readings, boundary windows, and invalid `k`; comparator tie-break is deterministic; the sorted precondition is documented.

## Completion checklist

- [ ] I sorted a copy with a comparator and handled ties safely.
- [ ] I can distinguish natural order from an external ordering.
- [ ] I implemented and tested a two-pointer scan on sorted input.
- [ ] I updated a fixed window without recomputing every range.
