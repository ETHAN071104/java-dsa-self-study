# Week 03 · Tutorial 02

## Linked nodes & reversal

**Read first:** [requirement.md](requirement.md)

---

### 1. Create and connect nodes

Use this Node type for all questions.

```java
static class Node {
    int value;
    Node next;
    Node(int value) { this.value = value; }
}
```

**a.** Create nodes a, b, and c containing 10, 20, and 30. Link a → b → c → null.

```java


```

**b.** Set head to a. Print the second value through head.

```java


```

**c.** Insert a new node containing 5 before head, then update head.

```java


```

**d.** Declare an empty list and check for null before reading its value.

```java


```

---

### 2. Correct the errors

**a.**

```java
// Print every value, including the last; handle an empty list.
Node cursor = head;
while (cursor.next != null) {
    System.out.println(cursor.value);
    cursor = cursor.next;
}
```

**Correction**

```java


```

**b.**

```java
// Traverse while preserving this local head reference.
while (head != null) {
    System.out.println(head.value);
    head = head.next;
}
```

**Correction**

```java


```

**c.**

```java
// Reverse one link without losing the original next node.
current.next = previous;
Node savedNext = current.next;
```

**Correction**

```java


```

---

### 3. Trace the references

Start with `a(1) → b(2) → c(3) → null` and head=a.

```java
Node p = head;
Node q = p;
p = p.next;
q.next = p.next;
```

Draw all final links and the references head, p, and q. Which node is skipped when traversing from head?

**Answer**

```text


```

---

### 4. Complete one reversal step

Start with previous=null, current=a, and `a(1) → b(2) → c(3) → null`.

```java
Node savedNext = /* complete */;
current.next = /* complete */;
previous = /* complete */;
current = /* complete */;
```

Repeat the step on paper until current is null. Draw the links after each round and identify the new head.

**Solution**

```java


```

---

### 5. Write a traversal method

Write `static int countNodes(Node head)` for an acyclic list. Return zero for null and leave all links unchanged. Test lists of lengths 0, 1, and 3.

**Solution**

```java


```

---

### 6. Check node identity and complexity

**a.** Describe checks proving that reversal returns the original nodes in reverse order, rather than replacement nodes containing copied values.

**b.** What should the original head’s next reference become?

**c.** State time and auxiliary space for traversal and iterative reversal.

**d.** Why is arbitrary indexed access not O(1)? What happens if countNodes follows a cycle?

**Answer**

```text


```
