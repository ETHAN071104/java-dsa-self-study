# Before Week 02 · Tutorial 03

**You will learn:** define ordering rules and sort a copy without changing the input list.

**Already know:** list operations and copying from [Tutorial 01](../Tutorial01/requirement.md).

## Ordering vocabulary

| Term / syntax | Meaning |
| --- | --- |
| Comparator<T> | An external rule comparing two T values |
| `compare(a, b)` result | Negative: a before b; zero: tie; positive: a after b |
| `Integer.compare(a, b)` | Compare integers without subtraction overflow |
| `String.CASE_INSENSITIVE_ORDER.compare(a, b)` | Compare text ignoring case without changing spelling |
| Tie-breaker | A second comparison used only if the first ties |
| Comparable<T> / `compareTo(other)` | A class's natural ordering rule |
| `copy.sort(order)` | Reorder copy using a comparator |
| Stable sort | Equal-under-comparator items keep their relative order; List.sort is stable |

## Read a lambda

```java
import java.util.Comparator;
Comparator<Integer> ascending = (a, b) -> Integer.compare(a, b);
```

`(a, b)` names the two inputs; `->` introduces the computation; its result becomes the comparison result. This supplies the comparator's compare method. The result's **sign** matters; do not assume every comparison returns exactly -1 or 1.

An alternative is `new Comparator<String>() { public int compare(String a, String b) { ... } }`: an anonymous class implementing that method.

## Copying and changing data

```java
List<String> copy = new ArrayList<>(words);
```

This makes a separate list container. `copy = words` would alias the original. Mutable objects inside a shallow copy are shared, and changing a sort field does not automatically re-sort either list.

Imports used here: java.util.Comparator, java.util.List, java.util.ArrayList. Comparable and Integer need no explicit imports. Comparison sorting is commonly analysed with O(m log m) comparisons; long strings add character-comparison costs.

## Ready to start?

- [ ] I can interpret negative, zero, and positive comparison results.
- [ ] I can explain a tie-breaker, a lambda, and an independent list container.

[Start the tutorial →](README.md)
