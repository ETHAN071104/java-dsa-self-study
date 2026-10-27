# Before Week 03 · Tutorial 01

**You will learn:** use FIFO/LIFO operations and recognise properly nested brackets.

**Already know:** generics, null checks, and collection calls from [Week 2 Tutorial 01](../../../Week02/Tutorials/Tutorial01/requirement.md).

## Names and methods

| Term / call | Meaning |
| --- | --- |
| Stack / LIFO | Last in, first out: remove the newest item |
| Queue / FIFO | First in, first out: remove the oldest item |
| Deque | A collection supporting both ends; can act as a stack or queue |
| `stack.push(x)` | Add x to the top |
| `stack.peek()` | Read the top without removal; null if empty |
| `stack.pop()` | Remove and return the top; throws if empty |
| `queue.offer(x)` | Add x to the back |
| `queue.poll()` | Remove and return the front; null if empty |
| `queue.peek()` | Read the front without removal; null if empty |
| `isEmpty()` / `size()` | Check for no items / count items |

## Small example

```java
import java.util.ArrayDeque;
import java.util.Deque;
// Inside main:
Deque<String> history = new ArrayDeque<>();
history.push("open");
history.push("edit");
System.out.println(history.pop()); // edit
```

For a queue use `import java.util.Queue;` and `Queue<String> jobs = new ArrayDeque<>();`. Keep stack and queue operation conventions separate.

## Empty values and brackets

ArrayDeque cannot hold null. Use `Character` in generics, not `char`. Unboxing a null Character into char throws NullPointerException; inspect emptiness before reading an expected character.

An **opener** is one of `(`, `[`, `{`; a **closer** is one of `)`, `]`, `}`. Proper nesting closes the most recently opened unclosed pair. Compare primitive chars using `==`. You can combine boolean pair checks with `&&` and `||`.

Draw the stack top on the left so traces use one consistent direction.

## Ready to start?

- [ ] I can predict whether a stack or queue returns the newest item.
- [ ] I know which removal throws on empty and which returns null.

[Start the tutorial →](README.md)
