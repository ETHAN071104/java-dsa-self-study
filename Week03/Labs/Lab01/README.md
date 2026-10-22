# Week 3 · Lab 01 — Bracket matching and breadth-first search

**Classification:** additional Java/DSA self-study, not official WIX1002 lab work. **Starter:** [StructurePractice.java](StructurePractice.java). Implement the TODOs; the placeholders are not complete algorithms.

## Task W3-L01-01 — Match delimiters

Implement `isBalanced(String text)` using `ArrayDeque<Character>` or another stack-compatible `Deque`.

- The input contains only `()[]{}` characters.
- Empty input is valid.
- A closer must match the most recent unmatched opener.
- Return false for a closer with no opener, a mismatched pair, or leftover openers.

Examples: `"{[()]}" → true`; `"([)]" → false`; `")(" → false`; `"" → true`.

## Task W3-L01-02 — BFS over an adjacency list

Implement `bfsOrder(List<List<Integer>> adjacency, int start)`.

- Treat each list index as a vertex; each list contains outgoing neighbor indices in traversal order.
- Graph may contain cycles. Mark a vertex visited when it is enqueued.
- `start` must be a valid index; otherwise throw `IllegalArgumentException`.
- Return the reachable vertices in BFS order. Do not change the input graph.

Example graph: `0 → [1,2], 1 → [2], 2 → [3], 3 → [1]`, start 0, expected order `[0, 1, 2, 3]`.

## Tests and expected behavior

For bracket matching, test empty input, each single opener/closer, nested valid pairs, mismatched type, wrong order, and leftover opener. For BFS, test a single vertex, disconnected vertices, a cycle, a self-loop, and invalid start.

## Complexity and completion

For matching, state time and maximum stack space in terms of input length n. For BFS, state time in terms of V and E and the visited/queue space.

- [ ] Both TODOs attempted in your own working file.
- [ ] Tests include empty/boundary and cyclic cases.
- [ ] BFS visits no vertex more than once.
- [ ] I can explain why FIFO gives level order.
