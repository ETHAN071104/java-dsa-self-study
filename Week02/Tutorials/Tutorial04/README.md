# Week 2 · Tutorial 04 — Combine Collections and Debug the Contract

**Source:** redesigned supplementary practice from the Week 2 roadmap; the individual Week 2 Notion page is blank.

## Practical challenge

A registration import contains student IDs, including duplicates and blank values. Build a clean result that reports accepted IDs in first-seen order, their frequencies, and all duplicate IDs.

**Rules:** trim IDs; ignore `null` and blank strings; treat case as significant; do not mutate the input. Write the expected result for `A12, B07, A12, " ", null, B07` before coding.

## Implementation milestones

1. Write the contract for accepted input and output order.
2. Use a set for seen IDs, a map for frequencies, and a list for accepted IDs in first-seen order.
3. Add tests for empty input, blank values, repeats, and IDs that differ only in case.
4. Debug a deliberately incorrect version that inserts into `seen` before checking whether the ID was already present.
5. Review iterator removal from Tutorial 01 and describe how you would safely remove invalid registrations from an `ArrayList`.
6. State time and extra-space costs. Distinguish expected hash-operation cost from deterministic list traversal.

## Concept discovery

**Concept note (Chinese):** 一个需求可以同时需要不同结构：列表保存首次出现顺序，集合检测成员关系，映射累计次数。先写清楚“接受什么、忽略什么、输出顺序如何”，再选择结构。正确性测试检查可观察结果；复杂度分析解释输入扩大时工作的增长。不要因为 `HashMap` 的查找通常很快，就假设它的遍历顺序固定。

## Apply and verify

Your tests should make these outcomes explicit:

- Accepted first-seen IDs: `A12, B07`.
- Frequencies: `A12: 2`, `B07: 2`.
- Duplicate IDs: `A12, B07` in the order each first became a duplicate.
- Blank and `null` values are absent from every output.

Add an input-copy assertion or compare the list before and after. Explain what changes if output order is unspecified.

## Explain after coding

1. Which collection owns each part of the contract?
2. What bug did the insert-before-check order cause?
3. Which inputs are needed to distinguish trimming from case folding?
4. What assumptions underlie your complexity estimate?

## Independent transfer

Build a word summary that returns first-seen unique words, a count map, and the earliest word with frequency one. Keep whitespace normalization and case handling explicit.

**Acceptance criteria:** all outputs follow a written contract; empty and ignored values are handled; no input mutation; tests cover duplicate and normalization boundaries; complexity is stated.

## Completion checklist

- [ ] I combined list, set, and map behavior to meet distinct requirements.
- [ ] I found and fixed an ordering bug using a test.
- [ ] I documented input normalization and output ordering.
- [ ] I justified time and auxiliary space.
