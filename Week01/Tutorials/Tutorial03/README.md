# Tutorial 3 — References, equality and exceptions

Source: Notion page Tutorial3. All six answer callouts were empty.

## Q1. Reference Semantics

Trace the code below. Which objects do a and b reference after the last statement?

```java
Student a = new Student("Alice");
Student b = a;
a = new Student("Bob");
```

## Q2. == vs. equals()

What is the output of this code? Explain the difference between reference equality and logical equality.

```java
String x = new String("Java");
String y = new String("Java");
System.out.println(x == y);
System.out.println(x.equals(y));
```

## Q3. equals() and hashCode()

Suppose two Student objects are considered equal when their studentId values match. Why should their hashCode() implementations use a consistent identity rule?

## Q4. HashSet

What problems can occur if two objects return true from equals() but have different hash codes? Explain how this affects a HashSet.

## Q5. Exceptions

Explain how ArrayIndexOutOfBoundsException and NullPointerException can occur. Describe one way to prevent each problem.

## Q6. Debugging

A withdraw(-100) operation compiles and runs but incorrectly increases the account balance. Identify the bug and propose a fix using input validation and appropriate testing.

No answers were present.
