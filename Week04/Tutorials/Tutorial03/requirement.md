# Before Week 04 · Tutorial 03

**You will learn:** read recursive calls, measure tree depth, and collect traversal results.

**Already know:** Node fields from [Week 3 Tutorial 02](../../../Week03/Tutorials/Tutorial02/requirement.md), method parameters, and return values.

## Recursion and tree vocabulary

| Term / syntax | Meaning |
| --- | --- |
| Recursion | A method calls itself on a smaller problem |
| Base case | A case answered immediately without further recursion |
| Call stack | Pending method calls waiting for results |
| Root / child / leaf | Starting node / connected node below it / node with no children |
| `node.left` / `node.right` | References to child nodes; null means no child |
| Depth in this tutorial | Number of nodes on the longest path; null depth is 0 |
| Preorder / inorder / postorder | Node-left-right / left-node-right / left-right-node |
| `Math.max(a, b)` | Choose the larger child result |
| `result.add(value)` | Append a value to a List<Integer> |

## Small recursive example

```java
static int steps(int n) { // n must be nonnegative
    if (n == 0) return 0;
    return 1 + steps(n - 1);
}
```

For steps(2), calls descend `2 → 1 → 0`, then results return `0 → 1 → 2`. Each call has its own local n. A call waits for its smaller call before completing the addition.

## Applying that idea to trees

A child subtree is a smaller tree. Check null before reading child fields. Finite acyclic trees eventually reach null children.

A shared result list means every recursive call receives a reference to the same list and appends into it. Returning a new list from every call and combining them may introduce extra copying.

Node count adds all nodes; maximum depth selects the longest path. Tree height h controls the deepest chain of pending calls. The result list's storage is separate from the call stack.

## Ready to start?

- [ ] I can identify a base case and explain what makes a recursive call smaller.
- [ ] I can distinguish node count, depth, traversal order, and result-list storage.

[Start the tutorial →](README.md)
