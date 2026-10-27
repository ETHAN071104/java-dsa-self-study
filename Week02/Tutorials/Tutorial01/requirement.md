# Before Week 02 · Tutorial 01

**You will learn:** store and copy lists, clean text, and remove items safely while traversing.

**Already know:** variables, `if`, loops, and references. If references are unclear, read [Week 1 Tutorial 01](../../../Week01/Tutorials/Tutorial01/requirement.md).

## 1. Read the dots and brackets

`word.trim()` means “call the trim method on word.” These are method names, not shortcuts. `()` calls a method; `.` selects a member.

`List<String>` means a list of strings. List is the interface; ArrayList is an implementation. `<>` lets Java infer the element type from the declaration.

```java
import java.util.ArrayList;
import java.util.List;
// Put these statements inside main:
List<String> names = new ArrayList<>();
names.add("Mira");
```

## 2. null, empty, and spaces

| Value | Meaning | Can call String methods? |
| --- | --- | --- |
| `null` | No String object is referenced | No: calling a method throws NullPointerException |
| `""` | A String containing zero characters | Yes |
| `" "` | A String containing one space | Yes |

`word == null` checks for no object. `word.isEmpty()` checks for zero characters; a space is still a character.

## 3. Clean text with trim()

```java
String raw = "  Mira  ";
String clean = raw.trim(); // "Mira"
// raw still contains "  Mira  "
```

`trim()` removes outer ordinary spaces and characters up to U+0020, such as tabs/newlines. It does not remove internal spaces or every Unicode whitespace character. Keep its returned value; calling `raw.trim()` alone does not change raw. “Normalize” here means trim accepted text while preserving its case. See [String methods](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html).

## 4. List methods

| Expression | Meaning |
| --- | --- |
| `names.add("Kai")` | Append one item |
| `names.get(0)` | Read the first item; indices start at zero |
| `names.set(0, "Jo")` | Replace an item at an existing index |
| `names.size()` | Number of items |
| `names.remove(0)` | Remove the item at index 0; later indices shift |
| `new ArrayList<>(names)` | New list container with the same element references |
| `List<String> other = names` | A second reference to the same list |
| `Arrays.asList("a", "b")` | Fixed-size list; import java.util.Arrays |

Wrap Arrays.asList in `new ArrayList<>(...)` if you need to add/remove items. A copied list still shares any mutable element objects; Strings themselves are immutable.

**Lengths:** array → `.length`; String → `.length()`; List → `.size()`.

## 5. Iterator: visit items one at a time

```java
import java.util.Iterator;
// After creating names inside main:
Iterator<String> it = names.iterator();
```

`it` is a variable name you choose. The iterator remembers where traversal has reached.

| Call | Meaning |
| --- | --- |
| `names.iterator()` | Create an iterator for the list |
| `it.hasNext()` | Is there another item? Returns boolean; does not advance |
| `it.next()` | Return the next item and advance; throws if no item remains |
| `it.remove()` | Remove the last item returned by next; at most once per next call |

For a fresh iterator over `["Mira", "Kai"]`:

```text
hasNext() → true
next()    → "Mira"
hasNext() → true
next()    → "Kai"
hasNext() → false
```

Check hasNext before next. ArrayList's iterator supports remove; some other iterators do not. During this traversal, use it.remove rather than names.remove. See [Iterator methods](https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Iterator.html).

## 6. Loop and cost vocabulary

| Syntax / term | Meaning |
| --- | --- |
| `for (String name : names)` | Visit each item in order |
| `while (condition)` | Repeat while the condition is true |
| `continue;` | Skip the rest of this loop iteration |
| `return value;` | End the method and return a result |
| `a || b` | OR; skip b if a is true |
| `a && b` | AND; skip b if a is false |
| Amortized O(1) | Constant average cost per operation across a sequence; an individual operation can cost more |

ArrayList uses an underlying array; LinkedList walks linked nodes. A null check must happen before an expression that calls a method on the reference. Review [Big-O](../../../Week01/Tutorials/Tutorial04/requirement.md) for the comparison question.

## Ready to start?

- [ ] I can distinguish null, empty text, and a space.
- [ ] I can say which iterator call checks, advances, or removes.
- [ ] I know why trim needs a stored result and why a copied list differs from an alias.

[Start the tutorial →](README.md)
