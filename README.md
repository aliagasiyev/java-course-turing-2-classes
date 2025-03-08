# University Management System

A comprehensive Java-based Object-Oriented Programming project that demonstrates core OOP principles through a university management application.

## 🎓 Project Overview

The University Management System is designed to manage various aspects of a university environment, including students, professors, courses, and administrative functions. This project serves as a practical demonstration of fundamental OOP concepts in Java.

## 🔑 Key Features

- Abstract base class hierarchy with polymorphic behavior
- Comprehensive class relationships (inheritance, composition)
- Encapsulation through proper access modifiers
- Static and instance members with appropriate usage
- Method overriding and overloading demonstrations
- Type checking and casting with instanceof operator

## 📚 Class Structure

### Person (Abstract Class)
The base class for all individuals in the university system.
- Abstract methods enforce implementation in subclasses
- Demonstrates proper encapsulation with private fields and public getters/setters
- Overrides Object class methods (toString, equals, hashCode)

### Student (Extends Person)
Represents university students with academic attributes.
- Stores course enrollments and academic metrics (GPA)
- Implements grade calculation functionality
- Demonstrates method overloading for grade updates

### Professor (Extends Person)
Represents faculty members with teaching responsibilities.
- Manages subject expertise and department affiliation
- Implements specialized professor-specific functionality

### Course
Manages academic course information and enrollment.
- Demonstrates composition (HAS-A) relationship with Professor and Students
- Maintains course details and student enrollment data

### University
Central management class that coordinates the entire system.
- Uses polymorphism to handle different types of university members
- Provides search and display functionality for university entities
- Demonstrates runtime type identification with instanceof

## 🧩 OOP Concepts Demonstrated

| Concept | Implementation |
|---------|----------------|
| **Classes & Objects** | Each entity modeled as a class with clear responsibilities |
| **Constructors** | Multiple constructor options with proper chaining |
| **Variable Types** | Instance, static, and local variables with appropriate scope |
| **Static Elements** | Class-level counters and utility methods |
| **Encapsulation** | Private fields with controlled access through methods |
| **Access Control** | Strategic use of access modifiers for proper encapsulation |
| **Inheritance** | Clear IS-A relationships in class hierarchy |
| **Composition** | HAS-A relationships between classes |
| **Polymorphism** | Base class references to derived objects, method overriding |
| **Abstraction** | Abstract class and methods for common functionality |
| **Method Overriding** | Implementation of abstract methods, Object class overrides |
| **Method Overloading** | Multiple method signatures for different parameter types |



## 📊 Project Structure

```
src/
├── Person.java           # Abstract base class
├── Student.java          # Student class extending Person
├── Professor.java        # Professor class extending Person
├── Course.java           # Course management class
├── University.java       # Central system management
└── UniversitySystemDemo.java  # Demo application
# University Management System

A comprehensive Java-based Object-Oriented Programming project demonstrating core OOP principles through a university management application.

## 🎓 Project Overview

The University Management System manages students, professors, courses, and administrative functions in a university environment. This project showcases fundamental OOP concepts in Java without using abstract classes/methods or ArrayList/LinkedList, as per specific requirements.

## 🔑 Key Features

- Base class hierarchy with polymorphic behavior using regular classes
- Comprehensive class relationships (inheritance, composition)
- Encapsulation through proper access modifiers
- Static and instance members with appropriate usage
- Method overriding and overloading demonstrations
- Type checking and casting with `instanceof` operator
- Dual GPA system: Student GPA (per student) and Course GPA (per course)

## 📚 Class Structure

### Person
Base class for all individuals in the university system.
- Fields: `name`, `age`, `id`
- Methods: Getters/setters, `toString`, `equals`

### Student (Extends Person)
Represents university students with academic attributes.
- Fields: `major`, `courses` (array), `grades` (array)
- Methods: Enroll in courses, update grades (overloaded), calculate Student GPA

### Professor (Extends Person)
Represents faculty members with teaching responsibilities.
- Fields: `department`, `subjects` (array)
- Methods: Add subjects, get subject list

### Course
Manages academic course information and enrollment.
- Fields: `courseCode`, `courseName`, `professor`, `students` (array)
- Methods: Add students, calculate Course GPA

### University
Central management class coordinating the entire system.
- Fields: `name`, `people` (array), `courses` (array)
- Methods: Add people/courses, display all people, search by ID/course code

## 🧩 OOP Concepts Demonstrated

| Concept              | Implementation                                      |
|----------------------|----------------------------------------------------|
| **Classes & Objects** | Each entity as a class with clear responsibilities |
| **Constructors**      | Multiple constructor options                      |
| **Encapsulation**     | Private fields with public getters/setters        |
| **Inheritance**       | `Student` and `Professor` extend `Person`         |
| **Composition**       | `Course` contains `Professor` and `Students`      |
| **Polymorphism**      | `Person` array holds `Student` and `Professor`    |
| **Method Overriding** | `toString`, `equals` overridden in `Person`       |
| **Method Overloading**| Grade updates in `Student` with different params  |
