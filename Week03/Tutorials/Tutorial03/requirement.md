# Before Week 03 · Tutorial 03

**You will learn:** find a middle node and detect cycles using two moving references.

**Already know:** node fields and reference identity from [Tutorial 02](../Tutorial02/requirement.md).

## Terms and expressions

| Term / expression | Meaning |
| --- | --- |
| Slow pointer | A Node reference advanced one link per round |
| Fast pointer | A Node reference advanced two links per round |
| `fast.next.next` | Follow two links; fast and fast.next must exist |
| `fast != null && fast.next != null` | Check fast before reading its field; && stops on a false left side |
| `slow == fast` | Both references identify the same node (or both are null) |
| Second middle | For even length, choose the later of the two centre nodes |
| Cycle / self-cycle | A link returns to an earlier node / a node links to itself |

## Small example: equal values are not equal nodes

```java
Node a = new Node(8);
Node b = new Node(8);
a.next = b;
System.out.println(a.value == b.value); // true
System.out.println(a == b);             // false
```

Use the Node class from Tutorial 02. A pointer here is an ordinary Java reference, not a raw memory address.

## Tracing rules

Name nodes A, B, C to track identity even when values repeat. Each round means both scheduled advances have happened. If both references start at head, their initial equality is not evidence of a cycle.

Middle-finding assumes an acyclic list. A loop that simply waits for null will not terminate on a cycle. For cycle detection, count distinct reachable nodes when describing input size.

A visited-node HashSet can remember every encountered node, but uses additional storage. The fast/slow exercise asks for constant auxiliary space instead.

## Ready to start?

- [ ] I can read two-link movement and put null guards in a safe order.
- [ ] I can compare node identities even when their values are identical.

[Start the tutorial →](README.md)
