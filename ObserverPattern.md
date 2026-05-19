# The Observer Pattern

## Definition
The **Observer Pattern** defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.

## Related To (But Different From)
**Publish-Subscribe (Pub/Sub)**

*Note: People often use these terms interchangeably, but there is a key technical difference:* 
*   *In the **Observer Pattern**, the Subject and Observers are aware of each other (the Subject directly holds a list of Observers and calls their methods).*
*   *In the **Pub/Sub Pattern**, there is a "Message Broker" or "Event Channel" in the middle. Publishers don't know who the Subscribers are, and Subscribers don't know the Publishers. They only communicate through the broker.*

## The Problem
You have a core object (the **Subject**) that maintains some important state or data. You have other objects (**Observers**) that need to stay perfectly in sync with the Subject. If you hardcode the observers into the subject, you tightly couple them, making it hard to add or remove observers at runtime without changing the subject's code.

## The Solution
Create two core interfaces: `Subject` and `Observer`. 
* The `Subject` interface handles registering, removing, and notifying observers. 
* The `Observer` interface has a single `update()` method. 

The Subject maintains a list of Observers. When the Subject's state changes, it loops through its list and calls the `update()` method on each Observer.

## Key Design Principles
*   **Strive for loosely coupled designs between objects that interact.** The Subject knows nothing about the Observers other than they implement the `Observer` interface. This loose coupling allows you to build flexible object-oriented systems that can handle change.

## Structure (from Head First Design Patterns)

1.  **Subject Interface:**
    *   `registerObserver(Observer o)`
    *   `removeObserver(Observer o)`
    *   `notifyObservers()`
2.  **Observer Interface:**
    *   `update(float temp, float humidity, float pressure)`
3.  **Concrete Subject (e.g., `WeatherData`):**
    *   Implements the `Subject` interface.
    *   Manages the state and the `ArrayList` of Observers.
4.  **Concrete Observer (e.g., `CurrentConditionsDisplay`):**
    *   Implements the `Observer` interface (and usually a `DisplayElement` interface in the book).
    *   Registers itself with the Concrete Subject to receive updates.

## When to use it
*   When a change to one object requires changing others, and you don't know exactly how many objects need to be changed.
*   When an object should be able to notify other objects without making assumptions about who those objects are (keeping them loosely coupled).
