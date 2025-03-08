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

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Java IDE (Eclipse, IntelliJ IDEA, or similar)

### Installation
1. Clone the repository:
   ```
   git clone https://github.com/yourusername/university-management-system.git
   ```
2. Open the project in your preferred Java IDE
3. Run the `UniversitySystemDemo` class to see the system in action

## 📝 Usage Example

```java
// Create a university
University myUniversity = new University("Tech University", 100, 50);

// Create professors
Professor profMath = new Professor("John Smith", 45, "P001", "Mathematics");
Professor profCS = new Professor("Alice Johnson", 38, "P002", "Computer Science");

// Add subjects to professors
profMath.addSubject("Calculus");
profCS.addSubject("Java Programming");

// Create students
Student student1 = new Student("Bob Wilson", 20, "S001", "Computer Science");
Student student2 = new Student("Emma Davis", 21, "S002", "Mathematics");

// Create and assign courses
Course javaCourse = new Course("CS101", "Introduction to Java", profCS);
javaCourse.addStudent(student1);
student1.enrollCourse(javaCourse);

// Display university information
myUniversity.displayAllPeople();
```

## 📊 Project Structure

```
src/
├── Person.java           # Abstract base class
├── Student.java          # Student class extending Person
├── Professor.java        # Professor class extending Person
├── Course.java           # Course management class
├── University.java       # Central system management
└── UniversitySystemDemo.java  # Demo application
```

## 🛠️ Future Improvements

- Database integration for data persistence
- GUI interface for user interaction
- Additional university entities (departments, faculties, etc.)
- Advanced reporting and analytics features
- Grade management and academic performance tracking

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgements

- Project created as an educational demonstration of Object-Oriented Programming principles
- Inspired by real-world university management systems
