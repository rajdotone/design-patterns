package com.raj.designpatterns.decorator.starbuzz;

import com.raj.designpatterns.decorator.core.Beverage;
import com.raj.designpatterns.decorator.core.CondimentDecorator;

public class Soy extends CondimentDecorator {
	private final Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.15;
	}
}
