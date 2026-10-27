# Before Week 01 · Tutorial 02

**You will learn:** use parent references, override methods, and catch invalid input.

**Already know:** classes, constructors, methods, and validation from [Tutorial 01](../Tutorial01/requirement.md).

## Keywords to recognise

| Syntax | Meaning |
| --- | --- |
| `class Dog extends Animal` | Dog is a subclass of Animal |
| `super(name)` | Call the parent constructor with name |
| `@Override` | Ask the compiler to check that this method overrides an inherited method |
| `abstract class Shape` | A base class that cannot be instantiated directly |
| `abstract double area();` | Declare a method that a concrete subclass must implement |
| `interface Printable` | Declare a capability a class can implement |
| `implements Printable` | Promise to implement the interface's required methods |

An abstract class can hold shared state and constructors. Interface methods like `void print();` require public implementations.

**Overloading:** same name, different parameter lists. **Overriding:** a subclass supplies an implementation with the matching signature and a compatible return type.

## Small example

```java
class Animal {
    String sound() { return "?"; }
}
class Cat extends Animal {
    @Override
    String sound() { return "meow"; }
}
// Inside main:
Animal pet = new Cat();
System.out.println(pet.sound()); // meow
```

The object's class selects the overridden instance method at runtime.

## Collections and exceptions used here

```java
import java.util.ArrayList;
import java.util.List;
// Inside main:
List<Animal> pets = new ArrayList<>();
pets.add(new Cat());
for (Animal animal : pets) {
    System.out.println(animal.sound());
}
```

`List<Animal>` is an ordered collection of Animal references. The `:` loop visits each element.

`try { ... } catch (IllegalArgumentException e) { ... }` handles a matching exception. `Integer.parseInt("12")` returns 12; parsing `"abc"` throws NumberFormatException. A compile-time error prevents compilation; a runtime exception happens during execution; a logic error gives unintended behaviour.

## Ready to start?

- [ ] I can distinguish an overload from an override.
- [ ] I can explain which code runs inside try and which runs after a matching exception is caught.

[Start the tutorial →](README.md)
