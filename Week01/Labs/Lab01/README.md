# Lab 1 — Student Management, OOP and debugging

Source: Notion page Lab1.

## 01 Student Management — Class Design

### Requirements

1. Create a Student class with private fields: name, studentId, and cgpa.
2. Add a constructor and appropriate getters.
3. Add a method to update CGPA.
4. Accept CGPA values only in the range 0.0–4.0.
5. Create three Student objects and print their details.

### Acceptance criteria

- Each object maintains its own state.
- Invalid CGPA values cannot be assigned.
- The code compiles and runs successfully.

The existing attempted solution is in [Student.java](Student.java). TODO: it calls an undefined setOrUpdateCgpa, does not enforce the CGPA range, and creates three objects without printing their details. Original misspellings and incomplete logic are retained.

## 02 Employee Salary System — Inheritance & Polymorphism

### Requirements

1. Create an abstract Employee class.
2. Implement FullTimeEmployee and PartTimeEmployee.
3. Add an interface named BonusEligible.
4. Implement different salary calculation methods.
5. Store different employee types in a List<Employee> and calculate their salaries through a common method.

### Acceptance criteria

- Both employee types can be processed using the same parent-class reference.
- Method overriding is demonstrated.
- Adding another employee type does not require rewriting the existing salary-processing loop.

No implementation was present.

## 03 Student Identity — equals() & hashCode()

### Requirements

1. Define Student identity using studentId.
2. Override equals() and hashCode().
3. Create two different Student objects with the same ID.
4. Compare their references and logical equality.
5. Insert both into a HashSet<Student> and observe the resulting size.

### Acceptance criteria

- Two different objects with the same student ID compare as logically equal.
- Equal objects have equal hash codes.
- You can explain why the set contains only one logical student.

No implementation was present.

## 04 Debugging & Exceptions

### Requirements

1. Validate salary and working-hour inputs.
2. Throw IllegalArgumentException for invalid arguments where appropriate.
3. Handle invalid user input without unexpectedly terminating the program.
4. Test valid input, boundary values, and invalid input.
5. Document one bug you found and how you fixed it.

### Acceptance criteria

- Invalid input is handled intentionally.
- The program produces the expected results for all test cases.
- You can distinguish a compile-time error, runtime exception, and logic error.

No implementation was present.
