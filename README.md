# Bakery Management System – Java OOP Polymorphism Demo

## Project Details
- Author: Harry Joseph
- Course: Data Structures & Algorithms - CPAN-211-RNA
- Created: 2025-09-27
- Platform: Java 21 LTS + Maven
- Build Tool: Apache Maven 3.6.3+
- IDE: VS Code with Java Extension Pack
- Concepts Demonstrated: Inheritance, Polymorphism, Abstract Classes

## Overview
The Bakery Management System demonstrates core Object-Oriented Programming concepts in Java, specifically inheritance and polymorphism. The project showcases how different cake types can be stored in a single collection and have their prices calculated differently through polymorphic method calls.

## 📥 Quick Download

**Get the complete project instantly:**

[![Download Bakery App](https://img.shields.io/badge/Download-bakery--appZip.zip-blue?style=for-the-badge&logo=download)](https://github.com/hjoseph777/bakery-app/releases/download/V1/bakery-appZip.zip)

*Complete Java 21 Maven project with OOP polymorphism demo ready to run*

## 🍰 Quick Start

## Important: Where your core OOP code lives
- The abstract base class is in [`src/main/java/com/bakery/Cake.java`](src/main/java/com/bakery/Cake.java) with common properties and abstract methods
- Ready-made cake implementation is in [`src/main/java/com/bakery/ReadyCake.java`](src/main/java/com/bakery/ReadyCake.java) with fixed pricing logic
- Custom cake implementation is in [`src/main/java/com/bakery/CustomCake.java`](src/main/java/com/bakery/CustomCake.java) with weight-based pricing
- The main application is in [`src/main/java/com/bakery/BakeryApp.java`](src/main/java/com/bakery/BakeryApp.java) demonstrating polymorphism

## Project Explorer
An interactive, collapsible view of the codebase. Click file names to explore the implementation.

<details open>
   <summary><strong>src/main/java/com/bakery/ – Core Application Classes</strong></summary>

   - 📁 <strong>com.bakery</strong>
      - 🍰 [`Cake.java`](src/main/java/com/bakery/Cake.java) – **Abstract base class for all cake types**
      - 🧁 [`ReadyCake.java`](src/main/java/com/bakery/ReadyCake.java) – **Ready-made cakes with fixed pricing**
      - 🎂 [`CustomCake.java`](src/main/java/com/bakery/CustomCake.java) – **Custom cakes with weight-based pricing**
      - 🏪 [`BakeryApp.java`](src/main/java/com/bakery/BakeryApp.java) – **Main application demonstrating polymorphism**
</details>

<details>
   <summary><strong>src/test/java/com/bakery/ – Unit Tests</strong></summary>

   - 📁 <strong>test/com.bakery</strong>
      - 🧪 [`AppTest.java`](src/test/java/com/bakery/AppTest.java) – JUnit 5 test cases
</details>

<details>
   <summary><strong>Configuration & Build Files</strong></summary>

   - ⚙️ [`pom.xml`](pom.xml) – Maven configuration with Java 21 setup
   - 📁 <strong>target/</strong> – Compiled classes and build artifacts
   - 📁 <strong>.vscode/</strong> – VS Code workspace settings
</details>

## File Structure

```text
bakery-app/
├── 📁 src/                          # Source code directory
│   ├── 📁 main/java/com/bakery/     # Main application package
│   │   ├── 🍰 Cake.java             # Abstract base class
│   │   ├── 🧁 ReadyCake.java        # Fixed-price cake implementation
│   │   ├── 🎂 CustomCake.java       # Weight-based pricing implementation
│   │   └── 🏪 BakeryApp.java        # Main application with polymorphism demo
│   │
│   └── 📁 test/java/com/bakery/     # Test package
│       └── 🧪 AppTest.java          # JUnit 5 test cases
│
├── 📁 target/                       # Maven build output
│   ├── 📁 classes/                  # Compiled .class files
│   └── 📁 test-classes/             # Compiled test files
│
├── 📁 .vscode/                      # VS Code configuration
│   └── ⚙️ settings.json             # Java 21 workspace settings
│
├── ⚙️ pom.xml                       # Maven project configuration
├── 📝 README.md                     # Documentation (this file)
└── 📄 Example.md                    # Template reference
```

### Quick Code Reference
| Icon | Type | Class | Purpose |
|------|------|-------|---------|
| 🍰 | Abstract | [`Cake.java`](src/main/java/com/bakery/Cake.java) | **Base class with common properties** |
| 🧁 | Concrete | [`ReadyCake.java`](src/main/java/com/bakery/ReadyCake.java) | **Fixed-price ready-made cakes** |
| 🎂 | Concrete | [`CustomCake.java`](src/main/java/com/bakery/CustomCake.java) | **Weight-based custom cakes** |
| 🏪 | Main | [`BakeryApp.java`](src/main/java/com/bakery/BakeryApp.java) | **Polymorphism demonstration** |
| 🧪 | Test | [`AppTest.java`](src/test/java/com/bakery/AppTest.java) | JUnit 5 test cases |
| ⚙️ | Config | [`pom.xml`](pom.xml) | Maven build configuration |

## Key OOP Concepts Demonstrated

### 1. **Inheritance** 🔗
- `ReadyCake` and `CustomCake` both extend the abstract `Cake` class
- Common properties (`cakeName`) inherited from parent
- Specialized behavior in each subclass

### 2. **Polymorphism** 🔄
- Same method call (`calculatePrice()`) works on all cake objects
- Different implementations in `ReadyCake` vs `CustomCake`
- Runtime method resolution based on object type

### 3. **Abstract Classes** 📋
- `Cake` class cannot be instantiated directly
- Defines contract that subclasses must implement
- Provides common functionality while enforcing specialization

## Complete Program Output

**Live execution results showing all 20 cake objects and polymorphism in action:**

```
=== Welcome to Sweet Dreams Bakery ===
Today's Available Cakes:

📋 READY-MADE CAKES (sitting in our display case):
1. Carrot Cake (Ready-Made) - $30.00
2. Chocolate Cake (Ready-Made) - $35.00
3. Vanilla Cake (Ready-Made) - $25.00
4. Red Velvet Cake (Ready-Made) - $40.00
5. Lemon Cake (Ready-Made) - $28.00
6. Marble Cake (Ready-Made) - $32.00
7. Coffee Cake (Ready-Made) - $30.00
8. Black Forest Cake (Ready-Made) - $45.00
9. Cheesecake (Ready-Made) - $38.00
10. Tiramisu Cake (Ready-Made) - $42.00


🎂 CUSTOM-ORDER CAKES (made specially for customers):
11. Bob's Birthday Cake (Custom: 2.5kg @ $40.00/kg + $15.00 fee) - $115.00
12. Wedding Cake (Custom: 5.0kg @ $50.00/kg + $25.00 fee) - $275.00
13. Anniversary Cake (Custom: 3.0kg @ $45.00/kg + $20.00 fee) - $155.00
14. Baby Shower Cake (Custom: 2.0kg @ $35.00/kg + $10.00 fee) - $80.00
15. Graduation Cake (Custom: 4.0kg @ $42.00/kg + $18.00 fee) - $186.00
16. Custom Chocolate (Custom: 1.5kg @ $38.00/kg + $12.00 fee) - $69.00
17. Custom Vanilla (Custom: 2.2kg @ $36.00/kg + $14.00 fee) - $93.20
18. Theme Park Cake (Custom: 3.5kg @ $48.00/kg + $22.00 fee) - $190.00
19. Cartoon Cake (Custom: 2.8kg @ $44.00/kg + $16.00 fee) - $139.20
20. Special Order Cake (Custom: 6.0kg @ $52.00/kg + $30.00 fee) - $342.00

==================================================
TOTAL INVENTORY VALUE: $1989.40
Total Cakes Available: 20
==================================================
```

*✅ **Program Successfully Executed** - Complete output showing all 20 cake objects with polymorphic price calculations*

## Features

### 🍰 Cake Inventory Management
- **20 diverse cake objects** (10 ready-made + 10 custom)
- **Polymorphic array storage** - all cakes in single collection
- **Type-specific pricing logic** - fixed vs. weight-based calculations

### 🧁 Ready-Made Cakes
- Simple fixed pricing model
- Variety of flavors: Carrot, Chocolate, Vanilla, Red Velvet, etc.
- Immediate availability pricing

### 🎂 Custom Cakes
- Weight-based pricing calculation
- Additional customization fees
- Special occasion cakes: Birthdays, Weddings, Graduations

### 📊 Business Intelligence
- Total inventory value calculation
- Individual cake price breakdown
- Clear categorization and reporting

## ⚙️ Global Maven Configuration
