# Week 02 · Tutorial 01

## Lists & input handling

**Read first:** [requirement.md](requirement.md)

---

### 1. Write the statements

**a.** Create a List<String> backed by ArrayList. Add `"oak"`, `"pine"`, and `"oak"` in order.

```java


```

**b.** Print the second element and the list size.

```java


```

**c.** Replace the first element with `"elm"`, then print every element using a for-each loop.

```java


```

**d.** Copy the list into a separate list. Remove the copy’s last element and print both lists.

```java


```

---

### 2. Correct the errors

**a.**

```java
// words is a List<String>.
for (int i = 0; i <= words.length; i++) {
    System.out.println(words[i]);
}
```

**Correction**

```java


```

**b.**

```java
// Inside a loop; word may be null.
if (word.trim().isEmpty() || word == null) continue;
```

**Correction**

```java


```

**c.**

```java
// Print the length after trimming.
String word = " oak ";
word.trim();
System.out.println(word.length());
```

**Correction**

```java


```

---

### 3. Determine the output

```java
List<String> a = new ArrayList<>(Arrays.asList("red", "blue"));
List<String> b = a;
List<String> c = new ArrayList<>(a);
b.set(0, "green");
c.add("white");
System.out.println(a);
System.out.println(c);
System.out.println(a == b);
System.out.println(a == c);
```

**Answer**

```text


```

---

### 4. Complete the iterator loop

Remove all empty strings, including adjacent ones.

```java
List<String> words = new ArrayList<>(Arrays.asList("", "", "oak", ""));
Iterator<String> it = words.iterator();
while (/* condition */) {
    String word = /* next element */;
    if (word.isEmpty()) {
        // Remove through the iterator.
    }
}
```

**Solution**

```java


```

---

### 5. Write a normalization method

Write `static String acceptedWord(String raw)`. Return null for null or whitespace-only input; otherwise return the trimmed word without changing its case. Test `null`, `" "`, `" Oak "`, and `"oak"`.

**Solution**

```java


```

---

### 6. Compare list operations

Fill in the time costs. Use amortized cost for ArrayList append.

| Operation | ArrayList | LinkedList |
| --- | --- | --- |
| Read an arbitrary index | | |
| Traverse using for-each | | |
| Append at the end | | |

Why can traversing LinkedList with repeated get(i) calls take O(n²)? Does copying a list also copy mutable objects stored inside it?

**Answer**

```text


```
