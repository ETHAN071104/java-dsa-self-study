# Tutorial 2 — Inheritance and polymorphism

Source: Notion page Tutoria2 (title spelled this way in Notion). All answer blocks were empty.

## Q1. Inheritance — 继承

What problem does inheritance solve? Give one example where inheritance is appropriate and one example where composition would be more suitable.

## Q2. Overloading vs. Overriding

Explain the difference between method overloading and method overriding. Provide one Java example of each.

## Q3. Polymorphism

Explain why the following declaration is valid and useful.

```java
Animal animal = new Dog();
```

## Q4. Abstract Classes vs. Interfaces

Compare abstract classes and interfaces. Give one situation in which you would choose each.

## Q5. Code Tracing

What is printed? Explain how Java selects the method implementation.

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

No answers were present in the source page.
