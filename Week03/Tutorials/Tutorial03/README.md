# Week 3 · Tutorial 03 — Implement and Inspect a Linked List

**Source:** supplementary practice based on the Week 3 roadmap; the individual Week 3 Notion page is empty.

## Practical challenge

Create a singly linked list of integers. Append values, print them in order, reverse the links in place, and find the middle node. The list must support an empty head and a one-node list.

**Constraints:** use a `Node` class with a value and `next` reference; do not copy values into an array to reverse the list.

## Implementation milestones

1. Define the node and manually connect `1 → 2 → 3 → null`.
2. Traverse with a cursor and print each value. Keep the `head` reference available to the caller.
3. Implement append by walking to the final node; test empty and non-empty lists.
4. Reverse the links iteratively. Before changing `current.next`, save the reference to the unprocessed suffix. Update `previous`, `current`, and the saved next reference one step at a time.
5. Find the middle with slow/fast references. State which middle is returned for even-length lists.
6. Draw a cyclic list and trace slow/fast movement until they meet or a pointer reaches `null`.

## Concept discovery

**Concept note (Chinese):** 单向链表的每个节点只知道下一个节点，访问第 `i` 个位置必须从头沿链接前进。反转时若先改写 `current.next`，可能失去尚未处理的后缀，所以要先保存下一节点。快慢指针每轮分别前进一格和两格，可定位中点；若存在环，两者最终会在环内相遇。空指针检查必须发生在读取节点字段之前。

For one reversal iteration, draw three references: `previous`, `current`, and `nextNode`. Label which nodes are already reversed and which remain unprocessed. Do not begin with a complete method copied from elsewhere.

## Apply and verify

- Traverse empty, one-node, and three-node lists.
- Reverse `1 → 2 → 3 → null`, then reverse the result again.
- Find the middle of odd- and even-length lists; document the convention.
- Test an acyclic one-node list and a cycle where the tail points to the second node.
- Explain time and auxiliary space for traversal, reversal, middle search, and cycle detection.

## Explain after coding

1. Why must the caller's original head not be advanced during a traversal?
2. Which reference preserves the unprocessed suffix during reversal?
3. What does the chosen loop condition return for an even number of nodes?
4. Why compare node references rather than node values during cycle detection?

## Independent transfer

Given a linked list of sensor readings, remove the first node containing a target value and return the updated head. Handle removal at the head, in the middle, when absent, and on an empty list.

**Acceptance criteria:** links remain connected; head changes only when required; all boundary cases are tested; no array conversion is used.

## Completion checklist

- [ ] I traversed without losing the head.
- [ ] I reversed links in place and preserved the unprocessed nodes.
- [ ] I tested fast/slow behavior on odd and even lengths.
- [ ] I traced cycle detection using node references.
