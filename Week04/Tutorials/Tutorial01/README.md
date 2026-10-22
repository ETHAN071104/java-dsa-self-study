# Week 4 · Tutorial 01 — Build a Sorted Score Report

**Source:** supplementary practice based on the 19-week roadmap. The individual Week 4 Notion page is empty, so this material is newly authored and is not official WIX1002 work.

## Practical challenge

Given student names and scores, display a sorted copy ordered by ascending score and then case-insensitive name. Also produce a list of names whose scores meet a pass threshold using a basic stream pipeline.

**Constraints:** keep the original list unchanged; do not compare integer scores by subtraction; retain the sorted order in the filtered result.

**Check:** ties use the name rule, filtering keeps the original order of the sorted list, and the source data remains unchanged.

## Implementation milestones

1. Run [TaskFirstExample.java](TaskFirstExample.java) and predict the sorted order before running it.
2. Create a `Comparator<ScoreEntry>` that compares score first and name second. Sort a copy, not the caller's list.
3. Replace the explicit comparison code with a lambda-based comparator expression.
4. Filter the sorted list to passing students and map each entry to its name. Collect the result into a new list.
5. Explain the sorting cost separately from the one-pass filter/map work. Do not claim the library sort is insertion sort or merge sort unless you have selected and implemented that algorithm yourself.

## Concept discovery

**Worked example:** [TaskFirstExample.java](TaskFirstExample.java) sorts a score list with a comparator based only on score. It demonstrates that ordering step, not the challenge's name tie-break or stream filter.

Expected output:


```text
Sorted by score:
Bo: 49
Cy: 62
Ada: 78
```

**Concept note (Chinese):** `Comparator` 用来描述外部排序规则；lambda 可以简洁地提供比较逻辑。先比较分数，再比较姓名，能明确处理并列值。Stream 的 `filter` 和 `map` 描述逐项转换，`collect` 才会执行并收集结果。排序和后续扫描是不同阶段，应分别分析成本。

## Apply and verify

- Test equal scores, names differing only by case, an empty list, and scores below/at/above the threshold.
- Confirm the original list order is unchanged after sorting the copy.
- Trace which entries pass `filter` and what `map` returns.
- Compare one lookup in an unsorted small array with repeated lookups in a fixed sorted array; save binary search implementation for Tutorial 02.

## Explain after coding

1. Why is the comparator a two-part ordering?
2. What does the lambda provide to `sort`?
3. Which stream operations are intermediate, and which operation produces the list?
4. Why must the cost of sorting be counted if the report is rebuilt for each query?

## Independent transfer

Build a product report sorted by ascending price and case-insensitive product name, then filter products below a budget. Use a copied list and state the sorting and filtering costs.

**Acceptance criteria:** tie-breaking is deterministic; input order is preserved in the original; filter output is correct; empty input works; no subtraction comparator is used.

## Completion checklist

- [ ] I wrote and applied a comparator with a tie-breaker.
- [ ] I used a lambda and a basic stream pipeline.
- [ ] I verified filtering and mapping behavior with tests.
- [ ] I separated sort cost from scan cost.
