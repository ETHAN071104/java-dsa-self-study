# Week 4 · Lab 02 — Insertion sort and recursive trees

**Classification:** additional Java/DSA self-study, not official WIX1002 lab work. **Starter:** [AlgorithmsPractice.java](AlgorithmsPractice.java). Both implementations are intentionally unfinished.

## Task W4-L02-01 — Insertion sort

Implement `insertionSort(int[] values)` in place without calling a library sorting method.

- Sort ascending and retain duplicate values.
- Empty and one-item arrays remain valid.
- Example: `[5, 1, 4, 1] → [1, 1, 4, 5]`.
- Trace the array after each pass before coding.

## Task W4-L02-02 — Recursive tree depth and preorder

Use the supplied `Node` type.

- `maxDepth(root)` returns the number of nodes on the longest root-to-leaf path; null tree depth is 0.
- `preorder(root)` returns values in node/left/right order; null root gives an empty list.
- Example tree with root 2 and children 1 and 3 has depth 2.
- Test null, one node, a balanced three-node tree, and a one-sided tree.

## Test cases and expected behavior

For sorting, test empty, single, already sorted, reverse sorted, duplicates, and negative values. For the tree tasks, check null and one-sided trees. Keep tree shape in a small diagram in your notes.

## Complexity and completion

State best/worst time for insertion sort, its auxiliary space, and time/space for each tree method. Include recursive call-stack space in your tree analysis.

- [ ] Sort attempted with a trace, no library sort.
- [ ] Tree methods handle null and single-node input.
- [ ] Tests cover both balanced and one-sided trees.
- [ ] Complexity separates traversal work from call-stack space.
