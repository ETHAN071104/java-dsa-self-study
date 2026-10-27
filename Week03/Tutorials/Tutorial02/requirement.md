# Before Week 03 · Tutorial 02

**You will learn:** build nodes, follow references, and reverse links without replacing nodes.

**Already know:** classes and references from [Week 1 Tutorial 01](../../../Week01/Tutorials/Tutorial01/requirement.md); while loops and null checks.

## Node vocabulary

| Name / syntax | Meaning |
| --- | --- |
| Node | An object storing a value and a reference to the following node |
| `head` | Reference to the first node; null means an empty list |
| `node.value` | Read the value field |
| `node.next` | Read the next-node field; null marks the end |
| `cursor = cursor.next` | Move the cursor reference to the following node |
| `cursor.next = other` | Change a link in the node itself |
| Acyclic | Following links eventually reaches null |
| Node identity | The particular object, not just its stored number |

**`node.next` is a field. `iterator.next()` is a method call.** Their similar names do not make them the same operation.

## Small example

Place this helper class inside your scratch class; put the statements inside main.

```java
static class Node {
    int value;
    Node next;
    Node(int value) { this.value = value; }
}
// Inside main:
Node first = new Node(6);
Node second = new Node(9);
first.next = second;
Node cursor = first;
cursor = cursor.next;
// first still references 6; cursor now references 9.
```

New Node references such as next start null. Reading a field through a null reference throws NullPointerException.

## Think in arrows

Copying a reference does not copy its node. Moving a cursor changes that variable; changing next changes the shared chain. Before overwriting a link, keep any reference you still need for the unprocessed nodes.

A method parameter `Node head` receives a copy of the reference: reassigning that local variable does not reassign the caller's variable, but editing the shared nodes affects the caller's chain.

Extra storage counts new working memory. A few reference variables use constant space even when they point into a long list.

## Ready to start?

- [ ] I can tell “move a reference” from “change a link.”
- [ ] I can draw head, cursor, next, and null without treating values as identities.

[Start the tutorial →](README.md)
