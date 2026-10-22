# Week 4 · Tutorial 03 — Traverse a Tree Recursively

**Source:** supplementary practice based on the 19-week roadmap. The individual Week 4 Notion page is empty.

## Practical challenge

Given a binary tree, report its maximum depth and the values in preorder. A null tree has depth `0` and an empty preorder result.

Use this tree to test: root `2`, left child `1`, right child `3`.

**Constraints:** use the provided `Node` structure in a scratch file; do not use a global variable to accumulate the answer.

## Implementation milestones

1. Draw the tree and write the expected preorder before coding.
2. Define the base case for a null node.
3. For depth, compute the left and right subtree depths, then combine them with the current node.
4. For preorder, process the current node before its left and right subtrees.
5. Add a one-sided tree and trace each call down to the base case and each return back up.
6. Compare selection sort, insertion sort, and merge sort by worst-case time and auxiliary space using the descriptions from the tutorial. Do not implement a second sort unless it helps you verify a claim.

## Concept discovery

**Concept note (Chinese):** 递归函数把当前节点的问题拆成左右子树的同类问题。空节点是停止递归的基例；每次调用都必须朝更小的子树前进。前序遍历先处理当前节点，再访问左右子树。调用过程占用调用栈，单链树会产生较深的递归，因此分析额外空间时要包括最大调用深度。

Draw calls in the order they begin and returns in reverse order. For a tree with a root and two children, mark the point where each node is emitted.

## Apply and verify

- Test null, one node, a balanced three-node tree, and a left- or right-skewed tree.
- Record preorder and depth for each tree before executing.
- Add inorder or postorder traversal and state when the root is emitted.
- Compare recursive traversal's call-stack cost with an iterative traversal using an explicit stack.
- State best/worst time for insertion sort and worst-case time/extra space for merge sort; use the standard algorithm assumptions taught in class.

## Explain after coding

1. What is the base case, and what makes each recursive call progress?
2. Why does preorder produce a different order from postorder?
3. What is the maximum call-stack depth for a one-sided tree of `n` nodes?
4. Why can insertion sort be useful on nearly sorted input despite its quadratic worst case?

## Independent transfer

Write a method that counts the number of nodes in a binary tree. Handle null and one-node trees, then test a balanced tree and a one-sided tree. Explain time and call-stack space.

**Acceptance criteria:** correct counts for all shapes; null base case; finite recursion; time and stack-space analysis.

## Completion checklist

- [ ] I implemented recursive depth and preorder traversal.
- [ ] I handled null and one-sided trees.
- [ ] I traced calls and returns and identified stack usage.
- [ ] I compared sorting complexity using defined algorithm assumptions.
