# Week 01 · Tutorial 01

## Classes, objects & validation

**Read first:** [requirement.md](requirement.md)

---

### 1. Write the declarations and statements

**a.** Declare private fields `name`, `studentId`, and `cgpa` with suitable types.

```java


```

**b.** Write a constructor for `Book`, which has a private String field `title`. Name the parameter `title`.

```java


```

**c.** Write a getter for the Book title.

```java


```

**d.** Using `Student(String name, String studentId, double cgpa)` and `getCgpa()`, create two students and print the second student’s CGPA.

```java


```

---

### 2. Correct the errors

**a.**

```java
// Constructor for Book, which has a String field title.
public void Book(String title) {
    this.title = title;
}
```

**Correction**

```java


```

**b.**

```java
// Getter for a String field title.
public int getTitle() {
    return title;
}
```

**Correction**

```java


```

**c.**

```java
// Reject values outside 0.0–4.0.
if (value < 0.0 && value > 4.0) {
    throw new IllegalArgumentException("Invalid CGPA");
}
cgpa = value;
```

**Correction**

```java


```

---

### 3. Determine the output

```java
class Box {
    int value;
    Box(int value) { this.value = value; }
}
// Inside main:
Box a = new Box(10);
Box b = a;
Box c = new Box(10);
b.value = 30;
System.out.println(a.value);
System.out.println(c.value);
System.out.println(a == b);
System.out.println(a == c);
```

How many objects exist? Draw the references.

**Answer**

```text


```

---

### 4. Write an update method

Write `void updateCgpa(double value)` for a class with a private `double cgpa` field. Accept only finite values from 0.0 to 4.0, inclusive. Throw `IllegalArgumentException` otherwise, leaving the old value unchanged.

**Solution**

```java


```

---

### 5. Write a title-validation method

In Book, write `void rename(String newTitle)`. Reject null and whitespace-only input with `IllegalArgumentException`; otherwise store the trimmed title.

**Solution**

```java


```

---

### 6. Complete the test table

Start each test with CGPA 3.0.

| Input | Accept / reject | CGPA afterwards |
| --- | --- | --- |
| 0.0 | | |
| 4.0 | | |
| -0.1 | | |
| 4.1 | | |
| Double.NaN | | |

Write one additional test showing that two independently created students keep separate state.

**Solution**

```java


```
