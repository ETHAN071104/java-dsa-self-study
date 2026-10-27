# Before Week 01 · Tutorial 01

**You will learn:** create objects, read their fields through methods, and reject invalid updates.

**Already know:** variables, assignment (`=`), `if`, and printing. A `double` stores decimal values; a `String` stores text.

## Words and syntax

| Term | Meaning |
| --- | --- |
| Class / object | A class defines a type; an object is one instance created with `new` |
| Field | A value stored in an object, such as its title |
| `private` | Restricts direct access to the declaring class |
| Constructor | Initializes a new object; same name as its class, no return type |
| `this.title` | This object's title field |
| Method / getter | An action; a getter returns a stored value |
| `return value;` | Sends a result back to the caller and ends the method |
| `void` | The method returns no value |

## Read a method call

```java
class Lamp {
    private boolean on;
    Lamp(boolean on) { this.on = on; }
    boolean isOn() { return on; }
}
// Inside main:
Lamp desk = new Lamp(true);
boolean state = desk.isOn(); // true
```

`desk.isOn()` means “call isOn on desk.” The dot selects a member; parentheses call a method. `Lamp other = desk;` gives two references to the same object, not two objects.

## Validation vocabulary

| Expression | Meaning |
| --- | --- |
| `x < 0 || x > 10` | Below 0 OR above 10; `||` stops once the left side is true |
| `x >= 0 && x <= 10` | Both conditions must hold; `&&` stops if the left side is false |
| `!condition` | Reverse true/false |
| `Double.isFinite(x)` | False for NaN and either infinity |
| `throw new IllegalArgumentException("message");` | Reject an invalid argument by throwing an exception |
| `text == null` | No String object is referenced |
| `text.trim()` | Return text with outer ordinary spaces removed; keep the result |
| `text.isEmpty()` | True when text has zero characters |

`null`, `""`, and `" "` differ: no object, empty text, and one space. Check null before calling a method on it. Validate before changing a field so rejection leaves the old value intact.

## Ready to start?

- [ ] I can tell a constructor, field, and method apart.
- [ ] I can explain why `new Lamp(true)` and `other = desk` do different things.

[Start the tutorial →](README.md)
