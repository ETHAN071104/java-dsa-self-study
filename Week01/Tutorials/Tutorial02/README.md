# Week 01 · Tutorial 02

## Inheritance, polymorphism & exceptions

**Read first:** [requirement.md](requirement.md)

---

### 1. Write the declarations and statements

**a.** Declare an abstract `Ticket` class with an abstract method `double price()`.

```java


```

**b.** Declare an interface `Printable` with a method `void print()`.

```java


```

**c.** Assume `BusTicket` extends Ticket and has a no-argument constructor. Create a BusTicket through a Ticket reference and print its price.

```java


```

**d.** Declare an empty `List<Ticket>` backed by ArrayList. Write a loop that prints each ticket’s price. Include imports.

```java


```

---

### 2. Correct the errors

**a.**

```java
// Ticket is abstract; BusTicket is concrete with a no-argument constructor.
Ticket ticket = new Ticket();
```

**Correction**

```java


```

**b.**

```java
// Override the parent's double price() method.
@Override
int price(int discount) { return 10; }
```

**Correction**

```java


```

**c.**

```java
interface Printable { void print(); }
class Receipt implements Printable {
    void print() { System.out.println("Paid"); }
}
```

**Correction**

```java


```

---

### 3. Determine the output

```java
class Parent {
    String label() { return "parent"; }
    String label(String suffix) { return "parent-" + suffix; }
}
class Child extends Parent {
    @Override
    String label() { return "child"; }
}
// Inside main:
Parent p = new Child();
System.out.println(p.label());
System.out.println(p.label("x"));
```

Identify the overriding and overloading.

**Answer**

```text


```

---

### 4. Complete the constructor

```java
abstract class Machine {
    private final String code;
    Machine(String code) { this.code = code; }
}
class Printer extends Machine {
    Printer(String code) {
        // Complete this constructor.
    }
}
```

**Solution**

```java


```

---

### 5. Write input-validation code

**a.** Write `static int checkedHours(int hours)`. Return hours when it is from 0 to 24, inclusive; otherwise throw IllegalArgumentException.

```java


```

**b.** Call checkedHours(-1) inside try/catch. Print `Invalid hours` on failure, then print `Program continues`.

```java


```

**c.** Parse `"abc"` with Integer.parseInt. Catch NumberFormatException and print a friendly error message.

```java


```

---

### 6. Classify the errors

Classify each as a compile-time error, runtime exception, or logic error.

| Case | Classification |
| --- | --- |
| Instantiate an abstract class | |
| Parse `"abc"` as an integer | |
| Accept -5 working hours | |
| Divide an integer by a variable containing zero | |

Why can one `List<Employee>` loop call different salary calculations without checking each employee’s type?

**Answer**

```text


```
