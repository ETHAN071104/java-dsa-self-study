# Week 03 · Tutorial 03

## Fast & slow pointers

**Read first:** [requirement.md](requirement.md)

---

### 1. Write the pointer statements

Assume `Node` has fields `int value` and `Node next`.

**a.** Initialize slow and fast to head.

```java


```

**b.** Write a short-circuit condition that allows fast to advance two links safely.

```java


```

**c.** Advance slow by one link and fast by two.

```java


```

**d.** Check whether slow and fast refer to the same node.

```java


```

---

### 2. Correct the errors

**a.**

```java
while (fast.next != null && fast != null) {
    slow = slow.next;
    fast = fast.next.next;
}
```

**Correction**

```java


```

**b.**

```java
// Detect the same node, not equal values.
if (slow.value == fast.value) return true;
```

**Correction**

```java


```

**c.**

```java
// Beginning of cycle detection.
Node slow = head;
Node fast = head;
if (slow == fast) return true;
```

**Correction**

```java


```

---

### 3. Trace the second middle

Start both pointers at head. While fast and fast.next are non-null, advance slow once and fast twice. Name nodes A, B, C, …

| Length | Pointer states after each round | Returned slow node |
| --- | --- | --- |
| 0 | | |
| 1 | | |
| 2 | | |
| 3 | | |
| 4 | | |
| 5 | | |

---

### 4. Trace a cycle

For `A → B → C → D → B`, start slow and fast at A. Advance slow once and fast twice per round; compare after moving.

| Round | slow | fast | Same node? |
| --- | --- | --- | --- |
| 1 | | | |
| 2 | | | |
| 3 | | | |

Repeat for a one-node self-cycle `X.next = X`.

**Answer**

```text


```

---

### 5. Build test lists

**a.** Using Node(int value), create two different nodes containing 5 and link them without a cycle. Print their reference equality and value equality.

```java


```

**b.** Create three nodes and link the tail back to the second node. Keep a reference to each node.

```java


```

---

### 6. Complete the boundary tests

| Input | Has cycle? |
| --- | --- |
| null | |
| One node ending at null | |
| One self-cycle | |
| Two equal-valued nodes ending at null | |
| Tail linked to head | |
| Tail linked to an interior node | |

Why should a middle-node test compare references rather than just values? State time and auxiliary space for middle finding and fast/slow cycle detection. Compare with storing visited nodes in a set.

**Answer**

```text


```
