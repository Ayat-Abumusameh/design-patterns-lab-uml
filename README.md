# 🎯 Design Patterns Lab — Lecture 1: UML Class Diagrams

![Topic](https://img.shields.io/badge/Topic-UML%20Class%20Diagrams-blue)
![Week](https://img.shields.io/badge/Week-1-green)
![Language](https://img.shields.io/badge/Language-Java-orange)
![Focus](https://img.shields.io/badge/Focus-Design%20Thinking-purple)

---

## 🎥 Lecture Video

This repository is accompanied by a full lecture explaining all concepts and examples.

▶️ Watch on YouTube: 

[Watch Lecture](https://youtu.be/uvTyvjGVlV0)

---

## 📌 Overview

This repository is the starting point for the **Design Patterns Lab**.

The goal of this lab is not just to write code, but to **think like a software designer**.

Before jumping into implementation, we focus on:
- Understanding system structure
- Modeling relationships between classes
- Visualizing designs using UML

---

## 🧠 What You Will Learn

- How to represent systems using **UML Class Diagrams**
- How to identify:
  - Classes
  - Attributes
  - Methods
- How to model relationships between classes
- How to translate diagrams into clean Java code

---

## 🧩 Why This Matters

Good developers don’t start with code — they start with **design**.

UML helps you:
- Avoid messy architecture
- Communicate ideas clearly
- Build scalable and maintainable systems

---

## 📚 Examples Included

Each example demonstrates a key UML concept and its Java implementation.

---

### 1️⃣ Basic Class Structure

📁 [`examples/basic-class/`](examples/UML)

Demonstrates how a class is structured:
- Attributes (data)
- Methods (behavior)

**Concept:**
A class is divided into:
- Name
- Properties
- Operations

---

### 2️⃣ Association

📁 [`examples/association/`](examples/Association)

Represents a simple relationship where one class **knows about** another.

**Example idea:**
A customer can place orders.

**Key Insight:**
- Objects are connected
- No ownership implied

---

### 3️⃣ Aggregation

📁 [`examples/aggregation/`](examples/Aggregation)

Represents a **whole–part relationship**, but with independent lifecycles.

**Example idea:**
A company has employees.

**Key Insight:**
- Parts can exist without the whole
- Weak ownership

---

### 4️⃣ Composition

📁 [`examples/composition/`](examples/Composition)

Represents **strong ownership**.

**Example idea:**
A computer contains a processor.

**Key Insight:**
- Part cannot exist without the whole
- Strong lifecycle dependency

---

### 5️⃣ Dependency

📁 [`examples/dependency/`](examples/Dependency)

Represents temporary usage.

**Example idea:**
A schedule uses a course temporarily.

**Key Insight:**
- Short-term relationship
- No long-term storage

---

### 6️⃣ Realization (Interface Implementation)

📁 [`examples/realization/`](examples/Realization)

Shows how a class implements an interface.

**Example idea:**
Different payment methods implementing the same interface.

**Key Insight:**
- Defines a contract
- Enables flexibility and extensibility

---

### 7️⃣ Inheritance (Generalization)

📁 [`examples/inheritance/`](examples/Generalization)

Represents "is-a" relationships.

**Example idea:**
Car and Motorcycle are types of Vehicle.

**Key Insight:**
- Code reuse
- Hierarchical design

---

## 🧪 Activities

---

### 🍔 Activity 1: Food Delivery System

📁 [`activities/food-delivery/`](activities/food-delivery/)

**Task:**
- Identify classes
- Define relationships
- Draw a UML diagram

**Focus:**
- One-to-many relationships

---

### 🛒 Activity 2: Online Store

📁 [`activities/online-store/`](activities/online-store/)

**Requirements:**
- A customer has exactly one cart
- A cart contains multiple products

**Your Tasks:**
1. Design the UML diagram
2. Implement the system in Java

---

## 🚀 How to Use This Repo

1. Fork the repository
2. Clone it locally
3. Explore the examples
4. Complete activities inside [`/activities`](activities)
5. Add your solutions

---

## 💡 Tips for Students

- Think before coding
- Keep classes focused and simple
- Pay attention to relationships — they matter more than code
- Use diagrams as your guide

---

## 📎 Final Note

This lab is about **building the mindset of a software designer**.

Code is just the final step — design is where real engineering happens.
