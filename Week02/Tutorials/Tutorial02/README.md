# Week 2 · Tutorial 02 — Prevent Duplicate IDs and Count Visits

**Source:** redesigned supplementary practice from the Week 2 roadmap. The Week 2 Notion page is blank; no source exercises were available to migrate.

## Practical challenge

A student event check-in receives IDs in this order: `A12, B07, A12, C03, B07`. Report whether each ID is new or a duplicate, then print how many times each ID appeared.

**Check:** duplicate status is correct at each step; counts are `A12: 2`, `B07: 2`, and `C03: 1`; empty input produces an empty report.

## Implementation milestones

1. Trace the first three IDs on paper with a `HashSet<String>` representing IDs already seen.
2. Implement duplicate detection with a set. Decide whether the current ID is checked before or after insertion.
3. Implement frequency counting with a `HashMap<String, Integer>`. Keep output formatting in a separate loop.
4. Replace a string key with a small immutable `StudentId` value class only after the string version works. Define equality and hash code from the same stable ID value.
5. Change a key field in a scratch experiment after insertion. Observe why mutable hash keys are unsafe; then make the key immutable.

## Concept discovery

**Concept note (Chinese):** `HashSet` 回答“之前是否出现过”，`HashMap` 保存“某个键对应的值”，因此适合累计次数。哈希结构通常提供期望 O(1) 的查找，但不是每次都保证固定耗时。自定义键必须遵守 `equals()` 与 `hashCode()` 的一致规则；放入集合后若修改参与哈希的字段，查找位置可能不再匹配。优先使用不可变的身份字段作为键。

## Apply and verify

- Trace the given sequence, including set contents and map counts after every item.
- Test an empty sequence, one ID, all unique IDs, all repeated IDs, and case-different IDs.
- Keep the raw input unchanged. State whether the output map has a guaranteed display order.
- Compare the set/map approach with scanning all earlier values for each ID. Describe expected time and extra storage.

## Explain after coding

1. Why does `HashSet.add(id)` help detect whether an ID is new?
2. Why can two different `String` objects act as the same map key?
3. What consistency must a custom key's `equals()` and `hashCode()` satisfy?
4. Why can mutating a key after insertion break lookup?

## Independent transfer

Read a list of words and report the frequency of each trimmed, non-empty word. Keep case sensitivity, ignore `null`, and preserve the input list unchanged.

**Acceptance criteria:** expected counts; empty and ignored values behave as stated; map display order is not assumed; time and auxiliary space are described.

## Completion checklist

- [ ] I used a set for membership and a map for counts.
- [ ] I traced the structure state after each input.
- [ ] I used stable key equality and avoided mutable hash keys.
- [ ] I compared expected time and storage with a scan-based approach.
