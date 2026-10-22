# Week 3 · Lab 02 — Linked-list operations

**Classification:** additional Java/DSA self-study, not official WIX1002 lab work. **Starter:** [LinkedListPractice.java](LinkedListPractice.java). Nodes and method bodies are intentionally incomplete.

## Problem statement

Implement operations on a singly linked list. Preserve node identities: reversal must change links, not copy or swap values. Use the even-length convention stated below.

### Task W3-L02-01 — Reverse the links

Implement `reverse(Node head)`.

- Return the new head after reversing links.
- Empty input returns null; one-node input returns that same node.
- Do not allocate replacement data nodes.
- Example: `1 → 2 → 3 → null` becomes `3 → 2 → 1 → null`.

### Task W3-L02-02 — Find the second middle

Implement `secondMiddle(Node head)`.

- Return the middle node for odd length and the second middle for even length.
- Return null for empty input.
- Test lengths 1, 2, 3, and 4; compare the node reference, not just its value.

### Task W3-L02-03 — Detect a cycle

Implement `hasCycle(Node head)` using constant auxiliary space.

- Null and one-node acyclic lists return false.
- Test a cycle back to the head and a cycle to an interior node.
- Do not compare node values to decide whether two references are the same.

## Test cases and expected behavior

Trace `[1,2,3]`, `[1]`, and `[]` for reversal. For middle, use lengths 0–4. For cycle detection, test no cycle, self-cycle, and a tail link to an earlier node. Ensure traversal tests do not loop forever on cyclic input.

## Complexity and completion

State time and auxiliary-space complexity for each operation. Explain why a linked-list traversal is O(n) even if each pointer update is O(1).

- [ ] All three methods attempted without copying a complete solution.
- [ ] Empty and one-node cases checked.
- [ ] Reversal preserves the original nodes and values.
- [ ] Complexity notes distinguish pointer count from auxiliary space.
