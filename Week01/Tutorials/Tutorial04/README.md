# Tutorial 4 — Big-O and complexity

## Q1. Constant and Linear Time

Determine the time complexity and explain why.

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

## Q2. Nested Loops

Determine the time complexity of each algorithm and explain the difference.

```java
// Algorithm A
for (int i = 0; i < n; i++) work();
for (int j = 0; j < n; j++) work();

// Algorithm B
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) work();
}
```

## Q3. Logarithmic Time

Determine the time complexity. Explain how the value of i changes during execution.

```java
for (int i = 1; i < n; i *= 2) {
    System.out.println(i);
}
```

## Q4. Auxiliary Space

An algorithm creates a new array of length n and scans the input array once. State its time complexity and auxiliary space complexity. Explain your answer.

## Q5. String Concatenation

Why can repeatedly using result = result + character inside a loop be inefficient in Java? Describe a more suitable alternative.

## Q6. Complexity Analysis

Explain why the following algorithm has linear rather than quadratic time complexity.

```java
int sum = 0;
for (int value : nums) {
    sum += value;
}
```

No answers were present.
