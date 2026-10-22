# Tutorial 1 — Classes, objects, constructors and encapsulation

## Q1. Classes and Objects

**Explain the difference between a class and an object. Use a Student class as an example.**

```java
public class Main{
	puclic static void main(String[] args){

	String name
	}
}

public class Student(String name ,{
}
```

TODO: The attempt has syntax errors, and two public classes cannot share one Java source file. It is preserved here for review.

## Q2. Constructors

**What is the purpose of a constructor? Explain two differences between a constructor and a regular method.**

```java
public class Car {
    private int fuelLevel;

    public void refuel(int liters) {
        this.fuelLevel += liters;
    }

    public int getFuelLevel() {
        return this.fuelLevel;
    }
}

car.refuel(40);
int remaining = car.getFuelLevel();
```

TODO: The snippet defines the Car class but calls an undeclared car variable outside a method; no written explanation was present in the source.

## Q3. Reference Semantics

**Consider the following code. What will be printed, and why?**

```java
Student a = new Student("Alice");
Student b = a;
b.name = "Bob";
System.out.println(a.name);
```

Attempted answer: Bob

```text
STACK MEMORY                       HEAP MEMORY
(Variables / References)               (The Actual Object)

     +---------------+
  a  |  0x1001       | -----\\
     +---------------+       \\       +----------------------+
                              -----> | Student Object       |
     +---------------+       /       | Address: 0x1001      |
  b  |  0x1001       | -----/        | name: "Bob"          |
     +---------------+               +----------------------+
```

## Q4. Encapsulation

**Why should a bank account's balance usually be private? Describe how deposit() and withdraw() should protect the account's state.**

Attempt (preserved verbatim):

> To enforce encapsulation and prevent external code from tampering with, corrupting, or directly modifying funds without authorization (e.g., bypassing rules, setting negative balances).
>
> -Validates that the input is strictly positive ($amount > 0$) to block "negative deposits" that would secretly drain the account.
>
> -The amount is positive ($amount > 0$).
> The account has sufficient funds ($balance \\ge amount$), preventing unauthorized overdrafts.

## Q5. Coding

**Implement a Student class with name, studentId, and cgpa. Include a constructor, private fields, and appropriate getters.**

The original Java attempt is in [Student.java](Student.java). TODO: The answer calls getStudentId() and getCgpa() in main, but the implemented getter names are studentId() and cgpa(). The getters also lack the get prefix; the attempt is not corrected.

## Q6. Debugging

**Consider the declaration below. Is it a constructor? What happens when Java compiles this class?**

```java
public void Student(String name) {
    this.name = name;
}
```

