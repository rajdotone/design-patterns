<div align="center">
  <h1>Head First Design Patterns</h1>
  <h3>A comprehensive study of classic object-oriented design patterns in Java</h3>

  ![Java](https://img.shields.io/badge/JAVA-17+-orange?style=for-the-badge&logo=java)
  ![Maven](https://img.shields.io/badge/MAVEN-3.x-red?style=for-the-badge&logo=apachemaven)

  *Strive for loosely coupled designs between objects that interact.*
</div>

---

## Overview

This repository contains clean, from-scratch implementations of the design patterns taught in the classic book *Head First Design Patterns*. The goal is to build flexible, maintainable, and loosely coupled object-oriented systems.

Currently featured is the **Observer Pattern**, modeled after the book's "Weather Station" example. The Observer Pattern defines a one-to-many dependency between objects so that when the subject changes state, all of its dependents are **notified** automatically.

| Pattern Element | Class / Interface | Role |
| :--- | :--- | :--- |
| **Subject** | `Subject` | The core interface. Manages the registry of observers (register, remove, notify). |
| **Concrete Subject** | `WeatherData` | Maintains the core state (temperature, humidity) and the `List` of active observers. |
| **Observer** | `Observer` | The listener interface. Defines the `update()` method for receiving state changes. |
| **Concrete Observer** | `CurrentConditionsDisplay` | Registers with the subject and reacts to state changes to display live data. |

<br>

In observer terms, the **Subject** is the sole owner of the data. The **Observers** are completely decoupled from the subject's implementation; they simply wait for the subject to push updates to them via the `update()` method.

## How to Run

Compile and run the current pattern (Observer / Weather Station):

```bash
javac -d target/classes src/main/java/headfirst/designpatterns/observer/weather/*.java
java -cp target/classes headfirst.designpatterns.observer.weather.WeatherStation
```
