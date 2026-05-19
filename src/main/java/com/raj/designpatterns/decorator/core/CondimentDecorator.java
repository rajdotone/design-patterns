package com.raj.designpatterns.decorator.core;

/**
 * The abstract decorator class.
 * It extends Beverage to ensure it matches the type of the object it is decorating.
 * It forces all concrete decorators to reimplement getDescription().
 */
public abstract class CondimentDecorator extends Beverage {
	/**
	 * Decorators must implement this method to append their description
	 * to the base beverage's description.
	 *
	 * @return the combined description
	 */
	public abstract String getDescription();
}
