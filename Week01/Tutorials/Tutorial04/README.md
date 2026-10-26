# Week 01 · Tutorial 04

## Arrays, strings & complexity

---

### 1. Write the declarations and statements

**a.** Declare an array for 12 floating-point numbers and an array for 100 student names.

```java


```

**b.** Initialize a character array with A through E.

```java


```

**c.** Initialize an integer matrix with rows `{6,9}`, `{2,5}`, `{4,6}`. Change its second row’s second value to 4.

```java


```

**d.** Print each element of `String[] contact` on a separate line.

```java


```

**e.** Count the exact word `"the"` in `String[] sentence`. Ignore null entries and keep the comparison case-sensitive.

```java


```

---

### 2. Correct the errors

**a.**

```java
String[] code = {'AAA', 'AAB'};
```

**Correction**

```java


```

**b.**

```java
int[] num = new num[10];
int sum = 0;
for (int k = 0; k <= num.length(); k++) {
    sum += num;
}
```

**Correction**

```java


```

**c.**

```java
String text = "cat";
System.out.println(text[0]);
```

**Correction**

```java


```

---

### 3. Trace the array

```java
int[] marks = new int[5];
int i = 0, j = 1;
marks[i] = 12;
marks[j] = marks[i] + 19;
marks[j - 1] = marks[j] * marks[j];
marks[j * 3] = marks[i + 1];
marks[++j] = marks[i] % 5;
marks[2 * j] = marks[j - 1];
```

Record i, j, and all five elements after each assignment.

**Answer**

```text


```

---

### 4. Write the loops

**a.** For `{2, 7, 2}`, print every index pair with `i < j` and its sum.

```java


```

**b.** For `String word = "banana"`, use an int[26] to count lowercase letters. Print the counts of a, b, and n.

```java


```

**c.** Write a condition that detects different lengths for strings s and t. Are `"aab"` and `"abb"` anagrams? Compare their letter counts.

```java


```

**d.** Print a non-null string in reverse order using StringBuilder.

```java


```

---

### 5. Track earlier prices

For `{8, 6, 9, 3, 7}`, complete the table.

| Day | Price | Minimum strictly before today | Profit if sold today |
| --- | --- | --- | --- |
| 0 | 8 | — | — |
| 1 | 6 | | |
| 2 | 9 | | |
| 3 | 3 | | |
| 4 | 7 | | |

Write `static int minimum(int[] values)` for a nonempty array. Then, given `minimumEarlier = 6`, `today = 9`, and `bestProfit = 1`, write statements updating bestProfit.

**Solution**

```java


```

---

### 6. Complete the complexity table

Assume bounded-cost hashing and characters restricted to a–z.

| Operation | Time | Auxiliary space |
| --- | --- | --- |
| One array scan with a counter | | |
| Two consecutive array scans | | |
| All distinct index pairs | | |
| Scan and store values in a HashSet | | |
| Scan and count letters in int[26] | | |

List the values of i for `i = 1; i < 32; i *= 2`. State the growth rate for a bound n, ignoring integer overflow.

**Answer**

```text


```
