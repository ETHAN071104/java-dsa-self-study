# Before Week 04 · Tutorial 04

**You will learn:** write behaviour checks, locate a repeated search state, and read lambdas/streams.

**Already know:** [binary search](../Tutorial01/requirement.md), [insertion sort](../Tutorial02/requirement.md), [trees](../Tutorial03/requirement.md), and list copying.

## Testing vocabulary

| Term / call | Meaning |
| --- | --- |
| Expected / actual | Result required by the contract / result the code produced |
| Assertion | A check that fails when behaviour differs from expectation |
| `assertEquals(expected, actual)` | Check equal values |
| `assertArrayEquals(expected, actual)` | Check array contents element by element |
| `assertTrue(condition)` | Require a true condition |
| `values.clone()` | A separate array copy; for int[], it preserves the original numbers |
| `@Test` | Mark a JUnit test method |
| Regression test | Retain a case that exposed a bug so it cannot quietly return |

Use JUnit 5 only if configured; a manual check is also valid. JUnit imports come from org.junit.jupiter.api.Test and static org.junit.jupiter.api.Assertions methods.

## Small manual check

```java
int actual = Math.max(2, 7);
if (actual != 7) {
    throw new AssertionError("Expected 7");
}
```

Plain Java assertions using `assert` may be disabled at runtime; the explicit check above does not depend on enabling them. For duplicate search hits, test an allowed index and its value rather than demanding one particular hit. Check bounds before indexing.

## Lambdas and streams

| Syntax | Meaning |
| --- | --- |
| `(a, b) -> Integer.compare(a, b)` | Lambda taking two values and returning a comparison |
| `list.stream()` | Start a pipeline over list elements |
| `.filter(x -> condition)` | Keep elements satisfying the condition |
| `.map(x -> expression)` | Transform each retained element |
| `.collect(Collectors.toList())` | Execute and collect into a list |

```java
List<Integer> doubled = numbers.stream()
    .map(n -> n * 2)
    .collect(Collectors.toList());
```

Assume numbers contains small non-null integers. Import java.util.List and java.util.stream.Collectors. filter/map are intermediate operations; collect is terminal. This pipeline does not replace elements in numbers. Stream operations can have side effects if your lambdas mutate shared objects, so read their code.

A compile-time error prevents compilation; a runtime exception occurs during execution; a logic error returns the wrong behaviour. Non-terminating recursion can exhaust the call stack.

## Ready to start?

- [ ] I can turn a contract into expected outputs and preserve an input snapshot.
- [ ] I can read a lambda and identify filtering, transformation, and collection.

[Start the tutorial →](README.md)
