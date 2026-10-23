# Tutorial 2 — Inheritance and polymorphism

## Q1. Inheritance — 继承

What problem does inheritance solve? Give one example where inheritance is appropriate and one example where composition would be more suitable.

## Q2. Overloading vs. Overriding

Explain the difference between method overloading and method overriding. Provide one Java example of each.
===========================================================================================================

For overloading:
##

class Calculator {
    ## Version 1: Two integer arguments
    int add(int a, int b) {
        return a + b;
    }

    ## Version 2: Three integer arguments (different number of parameters)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    ## Version 3: Two double arguments (different parameter types)
    double add(double a, double b) {
        return a + b;
    }
}

public class OverloadDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));        // Calls Version 1 -> 5
        System.out.println(calc.add(2, 3, 4));     // Calls Version 2 -> 9
        System.out.println(calc.add(2.5, 3.5));    // Calls Version 3 -> 6.0
    }
}
===========================================================================================================

For Overriding: 
>>subclass provides its own specific implementation of a method that is already defined in its superclass using the exact same signature

class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the superclass method
    @Override
    void makeSound() {
        System.out.println("The dog barks");
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog(); // Polymorphic reference

        myAnimal.makeSound(); // Outputs: The animal makes a sound
        myDog.makeSound();    // Outputs: The dog barks (resolved at runtime)
    }
}

===========================================================================================================
Summary:
Method overloading means using the same method name with different parameters to perform varied actions ;while method overriding permanently replaces a parent class method's behavior with a new, custom implementation inside a child class.


## Q3. Polymorphism

Explain why the following declaration is valid and useful.
===========================================================================================================

```java
Animal animal = new Dog();
```

## Q4. Abstract Classes vs. Interfaces

Compare abstract classes and interfaces. Give one situation in which you would choose each.
===========================================================================================================

## Q5. Code Tracing

What is printed? Explain how Java selects the method implementation.
===========================================================================================================

```java
class Animal {
    void makeSound() { System.out.println("Animal"); }
}
class Dog extends Animal {
    @Override
    void makeSound() { System.out.println("Dog"); }
}
Animal a = new Dog();
a.makeSound();
```

## Q6. Design

Design an abstract Shape class with an area() method. Implement Circle and Rectangle so that both can be processed through a common Shape reference.
===========================================================================================================

No answers were present in the source page.
