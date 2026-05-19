package com.raj.designpatterns.decorator.core;

/**
 * The abstract base component for the Decorator pattern.
 * All concrete components and decorators must extend this class
 * so they can be treated uniformly.
 */
public abstract class Beverage {
	protected String description = "Unknown Beverage";

	/**
	 * @return the description of the beverage and any decorators
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Calculates the cost of the beverage.
	 *
	 * @return the cost
	 */
	public abstract double cost();
}
