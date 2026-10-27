# Week 04 · Tutorial 03

## Recursion & binary trees

**Read first:** [requirement.md](requirement.md)

---

### 1. Build a tree

Use this Node type for all tree questions. Trees are acyclic with no shared child nodes.

```java
static class Node {
    int value;
    Node left, right;
    Node(int value) { this.value = value; }
}
```

**a.** Declare an empty tree.

```java


```

**b.** Create a root containing 6, with left child 2 and right child 9.

```java


```

**c.** Add a node containing 4 as the right child of node 2.

```java


```

**d.** Write a condition identifying a non-null leaf.

```java


```

---

### 2. Correct the recursive errors

**a.**

```java
// n is nonnegative.
static int countdown(int n) {
    if (n == 0) return 0;
    return 1 + countdown(n);
}
```

**Correction**

```java


```

**b.**

```java
// Handle empty subtrees safely.
if (root.left == null && root.right == null) return 1;
if (root == null) return 0;
```

**Correction**

```java


```

**c.**

```java
// Depth counts nodes: null has depth 0, a leaf has depth 1.
return Math.max(leftDepth, rightDepth);
```

**Correction**

```java


```

---

### 3. Trace calls and traversal

For this tree, write preorder and the depth of each non-null subtree. Depth counts nodes. Draw the depth-method calls for the subtree rooted at 2, including null calls and return values.

```text
6
├── left: 2
│   └── right: 4
└── right: 9
```

**Answer**

```text


```

---

### 4. Arrange the preorder operations

Write `static void collect(Node node, List<Integer> result)` using these actions in the correct order: recurse right; return if null; append node.value; recurse left. Use the same result list for both child calls.

What output would the Q3 tree give if append happened between the child calls, or after both calls?

**Solution**

```java


```

---

### 5. Write a recursive node counter

Write `static int countNodes(Node root)` without a global counter. Return zero for null. Test null, a leaf, and the Q3 tree.

How does combining child counts differ from combining child depths?

**Solution**

```java


```

---

### 6. Complete the cases and complexity

| Tree | Depth | Preorder |
| --- | --- | --- |
| null | | |
| Leaf 8 | | |
| 8 → left 5 → left 1 | | |

State time, call-stack space, and result-list space for preorder using one shared list. Compare height h for a balanced n-node tree and a chain. State time and stack space for maxDepth.

**Answer**

```text


```
