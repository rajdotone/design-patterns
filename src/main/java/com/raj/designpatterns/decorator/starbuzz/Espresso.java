package com.raj.designpatterns.decorator.starbuzz;

import com.raj.designpatterns.decorator.core.Beverage;

public class Espresso extends Beverage {
	
	public Espresso() {
		description = "Espresso";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}
}
