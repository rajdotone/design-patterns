<div align="center">
  <h1>Design Patterns in Java</h1>
  <h3>A comprehensive study of classic object-oriented design patterns</h3>

  ![Java](https://img.shields.io/badge/JAVA-17+-orange?style=for-the-badge&logo=java)
  ![Maven](https://img.shields.io/badge/MAVEN-3.x-red?style=for-the-badge&logo=apachemaven)

  *Building flexible, maintainable, and loosely coupled systems.*
</div>

---

## Overview

This repository contains clean, from-scratch implementations of fundamental software design patterns. The goal is to leverage proven architectural solutions to solve common software design problems, making code more reusable and resilient to change.

The patterns are organized by their primary purpose: **Creational** (how objects are created), **Structural** (how objects are composed), and **Behavioral** (how objects communicate).

### Implemented Patterns

| Category | Pattern | Description | Status |
| :--- | :--- | :--- | :---: |
| **Behavioral** | **Observer** | Defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified automatically. | ✅ |
| **Behavioral** | **Strategy** | Defines a family of algorithms, encapsulates each one, and makes them interchangeable at runtime. | ⏳ |
| **Structural** | **Decorator** | Attaches additional responsibilities to an object dynamically without altering its structure. | ⏳ |
| **Creational** | **Factory** | Defines an interface for creating an object, but lets subclasses decide which class to instantiate. | ⏳ |
| **Creational** | **Singleton** | Ensures a class has only one instance and provides a global point of access to it. | ⏳ |

<br>

*More patterns will be added to this repository as the study progresses.*

## How to Run

Each pattern is contained within its own package and includes a main execution class that can be compiled and run independently. For example, to run the current Observer pattern implementation:

```bash
javac -d target/classes src/main/java/headfirst/designpatterns/observer/weather/*.java
java -cp target/classes headfirst.designpatterns.observer.weather.WeatherStation
```
