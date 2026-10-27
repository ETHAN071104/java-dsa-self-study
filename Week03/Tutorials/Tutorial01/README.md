# Week 03 · Tutorial 01

## Stacks, queues & brackets

**Read first:** [requirement.md](requirement.md)

---

### 1. Write the statements

**a.** Declare a Deque<Character> backed by ArrayDeque. Push `'('`, then `'['`.

```java


```

**b.** Print the top without removing it, then print the stack size.

```java


```

**c.** Remove the top only when the stack is nonempty.

```java


```

**d.** Declare a Queue<String>, add `"A"` then `"B"`, and remove one item in FIFO order. Include imports.

```java


```

---

### 2. Correct the errors

**a.**

```java
Deque<char> stack = new ArrayDeque<>();
```

**Correction**

```java


```

**b.**

```java
// Print "empty" if the character stack is empty.
char top = stack.peek();
System.out.println(top);
```

**Correction**

```java


```

**c.**

```java
// Process requests FIFO.
Deque<String> requests = new ArrayDeque<>();
requests.push("first");
requests.push("second");
System.out.println(requests.pop());
```

**Correction**

```java


```

---

### 3. Determine the output

```java
Deque<Integer> stack = new ArrayDeque<>();
Queue<Integer> queue = new ArrayDeque<>();
for (int value : new int[]{2, 4, 6}) {
    stack.push(value);
    queue.offer(value);
}
System.out.println(stack.pop());
System.out.println(queue.poll());
System.out.println(stack.peek());
System.out.println(queue.peek());
```

Show the remaining stack from top to bottom and queue from front to back.

**Answer**

```text


```

---

### 4. Trace bracket matching

Trace `"{[]}"`, `"([)]"`, `")("`, and `"(("` separately. Put the stack top on the left. Stop at the first rejection.

| Character | Stack before | Action | Stack after |
| --- | --- | --- | --- |
| | | | |

Which invalid input has equal numbers of opening and closing brackets?

**Answer**

```text


```

---

### 5. Write a matching-pair method

Write `static boolean matches(char opener, char closer)`. Return true only for `()`, `[]`, and `{}`.

Test all three valid pairs, `(]`, and `)(`.

**Solution**

```java


```

---

### 6. Choose checks and test cases

For a closing bracket, put these actions in the correct order: compare types; reject an empty stack; pop the opener. What must be checked after the entire string?

| Case | Example input | Expected result |
| --- | --- | --- |
| Empty string | | |
| Unmatched closer | | |
| Leftover opener | | |
| Wrong bracket type | | |
| Wrong nesting | | |
| Valid nesting | | |

State time and worst-case auxiliary space for a stack-based scan of n characters.

**Answer**

```text


```
