# Week 2 · Tutorial 01 — Keep a Student Roster

**Source:** redesigned supplementary practice from the Week 2 roadmap. The Week 2 Notion page is blank; no lesson or attempt was available to migrate. This is not official WIX1002 coursework.

## Practical challenge

Extend a student-record program to keep an ordered roster. Add a student, print every student in arrival order, display the record at a requested position, and remove all students matching a stated condition by using an iterator.

**Constraints:** use `List<Student>` and `ArrayList<Student>`; keep duplicate IDs for this first version so that storage behavior is visible. Do not implement ID lookup yet.

**Check:** insertion order is retained, indexed access returns the expected record, matching records are removed without skipping adjacent matches, and an empty roster prints no records without an index error.

## Implementation milestones

1. Run [TaskFirstExample.java](TaskFirstExample.java), then change the names and print the value at index `1`.
2. In a scratch file, adapt the example's `Student` class to include the fields from your Week 1 record and store the objects in `ArrayList<Student>`.
3. Add a method that prints every record using an enhanced for loop.
4. Use an `Iterator<Student>` to remove a student that meets a simple condition. Do not structurally modify an `ArrayList` from inside a for-each loop.
5. Run the same roster operations with `LinkedList<Student>` as the implementation of `List<Student>`. Compare indexed read, sequential traversal, and insertion/removal at a known end.

## Concept discovery

**Expected output for the worked example:**

```text
Ari (A12)
Mina (B07)
Ari (A12)
At index 1: Mina (B07)
```

**Concept note (Chinese):** `ArrayList` 保留插入顺序，适合按索引读取；插入中间元素可能需要移动后续元素。`LinkedList` 的索引读取需要沿节点逐个前进，但已知节点附近的链接调整很直接。泛型 `List<Student>` 让编译器检查元素类型。遍历期间删除元素时，使用迭代器自身的 `remove()`，避免集合结构和迭代器状态不一致。

## Apply and verify

- Add three students and confirm iteration order matches insertion order.
- Read the first, middle, and last valid index. Define how your method handles an invalid index.
- Remove one matching record through the iterator. Test no match and all records matching.
- Compare the list before and after removal. State which operations depend on an index and which depend on traversal.

## Explain after coding

1. Why did `List<Student>` reject a `String` at compile time?
2. What does indexed access cost on an `ArrayList` versus a `LinkedList`?
3. Why is iterator removal safer than `list.remove(...)` inside a for-each loop?

## Independent transfer

Maintain an ordered playlist of song titles. Add a song, show the song at a position, and remove all titles matching a selected artist by using an iterator over song objects.

**Acceptance criteria:** order remains stable; generics are used; empty and out-of-range behavior is explicit; removal does not skip adjacent matches or modify the list unsafely.

## Completion checklist

- [ ] I stored typed objects in a list and iterated over it.
- [ ] I tested indexed access and empty-list behavior.
- [ ] I removed matching values safely with an iterator.
- [ ] I can justify when indexed access changes the `ArrayList` / `LinkedList` choice.
