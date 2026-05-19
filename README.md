# Observer Pattern: Weather Station

This repository contains a clean, from-scratch implementation of the **Observer Pattern** exactly as taught in Chapter 2 of *Head First Design Patterns*.

## Overview

The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.

This project simulates a **Weather Station** where a `WeatherData` object (the Subject) tracks the current temperature, humidity, and pressure. Various displays (like the `CurrentConditionsDisplay`) act as Observers. They register themselves with the `WeatherData` object and update automatically whenever new measurements are available.

## Structure

*   **`Subject`**: The interface that the `WeatherData` class implements to allow observers to register, remove, and be notified.
*   **`Observer`**: The interface that all displays implement to receive `update()` calls.
*   **`WeatherData`**: The concrete subject that maintains state and a list of observers.
*   **`CurrentConditionsDisplay`**: A concrete observer that listens to `WeatherData` and prints the current temperature and humidity.
*   **`WeatherStation`**: The main execution class that ties everything together.

## How to Run

Compile and run the `WeatherStation` class:

```bash
javac -d target/classes src/main/java/headfirst/designpatterns/observer/weather/*.java
java -cp target/classes headfirst.designpatterns.observer.weather.WeatherStation
```
