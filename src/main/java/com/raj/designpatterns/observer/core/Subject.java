package com.raj.designpatterns.observer.core;

/**
 * The Subject interface represents the core entity that holds state and allows
 * observers to register for updates. When the state changes, the subject
 * is responsible for notifying all registered observers.
 */
public interface Subject {
	/**
	 * Registers a new observer to listen for state changes.
	 *
	 * @param o the observer to register
	 */
	void registerObserver(Observer o);

	/**
	 * Removes an existing observer from the notification list.
	 *
	 * @param o the observer to remove
	 */
	void removeObserver(Observer o);

	/**
	 * Notifies all currently registered observers that a state change has occurred.
	 */
	void notifyObservers();
}
