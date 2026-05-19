package com.raj.designpatterns.observer.core;

/**
 * The Observer interface is implemented by any class that wishes to be notified
 * of state changes in a Subject. This ensures a loose coupling between the
 * Subject and the Observers.
 */
public interface Observer {
	/**
	 * Called by the Subject when its state has changed.
	 *
	 * @param temp     the updated temperature
	 * @param humidity the updated humidity
	 * @param pressure the updated pressure
	 */
	void update(float temp, float humidity, float pressure);
}
