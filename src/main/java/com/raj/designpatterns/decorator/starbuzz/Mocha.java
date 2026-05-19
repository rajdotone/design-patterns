package com.raj.designpatterns.decorator.starbuzz;

import com.raj.designpatterns.decorator.core.Beverage;
import com.raj.designpatterns.decorator.core.CondimentDecorator;

public class Mocha extends CondimentDecorator {
	private final Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.20;
	}
}
