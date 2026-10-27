# Before Week 01 · Tutorial 04

**You will learn:** index arrays, read characters, trace changes, and describe algorithm costs.

**Already know:** variables, loops, `if`, and basic arithmetic; set/map syntax from [Tutorial 03](../Tutorial03/requirement.md).

## Syntax to recognise

| Syntax | Meaning |
| --- | --- |
| `int[] a = new int[3]` | Three integer slots, initially zero; indices 0, 1, 2 |
| `double[]` / `String[]` | Arrays of decimals / String references; new String slots start null |
| `int[][] grid` / `grid[r][c]` | An array of rows / access row r, column c |
| `'a'` / `"abc"` | A char literal / a String literal |
| `a.length` | Number of array slots; a field with no parentheses |
| `text.length()` / `text.charAt(i)` | Text length / character at position i |
| `sum += x` | Same update as `sum = sum + x` |
| `++j` | Increase j first, then use its new value |
| `x % 5` | Remainder after division by 5 |
| `Math.max(a, b)` | The larger value |
| `"the".equals(word)` | Case-sensitive content check, safe even if word is null |

## Small example

```java
int[] levels = {4, 8};
levels[1] = 6;
for (int level : levels) {
    System.out.println(level); // 4, then 6
}
```

A `for (int i = 0; i < a.length; i++)` loop uses indices. The `:` version reads each element directly. Lowercase letters a–z can map to slots 0–25 with `letter - 'a'`.

`StringBuilder out = new StringBuilder();` creates a changeable text buffer. `out.append('x')` adds a character; `out.toString()` obtains the text. Repeated String concatenation creates new strings instead of extending the old one.

## Cost vocabulary

| Term | Meaning as input size n grows |
| --- | --- |
| O(1) | Bounded work or storage independent of n |
| O(log n) | Work growing with repeated halving/doubling |
| O(n) | Work or storage growing linearly with n |
| O(n²) | Work proportional to pairs of n items |
| Auxiliary space | Extra working storage beyond the input |

A running minimum means the smallest value seen so far. “Strictly before today” excludes today's value. Two different indices may still hold equal values.

## Ready to start?

- [ ] I can distinguish array length, String length, and character indexing.
- [ ] I can trace assignments in order and separate time from extra storage.

[Start the tutorial →](README.md)
