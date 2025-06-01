# 🛒 Java Order Management System – OOP Sample

This repository contains a simple Java program demonstrating **core Object-Oriented Programming (OOP)** concepts through an **Order Management System**. It is ideal for learning or showcasing foundational software design principles in Java without needing any frameworks or build tools like Maven or Gradle.

---

## 📚 Features

- Create customer orders and add items
- Process payments using pluggable payment methods (via interface)
- View order summaries
- Demonstrates clean separation of responsibilities using OOP

---

## 🧠 OOP Concepts Used

| Concept          | Demonstrated Through |
|------------------|----------------------|
| **Encapsulation** | Fields in `Order`, `OrderService` |
| **Inheritance**   | `PaymentMethod` interface and `CreditCardPayment` class |
| **Polymorphism**  | `processPayment()` via `PaymentMethod` |
| **Abstraction**   | Payment method interface decoupled from payment logic |
| **Composition**   | `OrderService` composes `Order` instances |

---

## 🏗️ Project Structure

```bash
java-code-review-sandbox/
├── OrderManagementSystem.java   # Main Java file
├── coding_rules.md              # Optional coding guidelines
└── README.md                    # This documentation
