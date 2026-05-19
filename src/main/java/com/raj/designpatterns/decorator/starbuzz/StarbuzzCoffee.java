package com.raj.designpatterns.decorator.starbuzz;

import com.raj.designpatterns.decorator.core.Beverage;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		// 1. Order an Espresso with no condiments
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());

		// 2. Order a HouseBlend with Double Mocha and Whip
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2); // Wrap it in a Mocha
		beverage2 = new Mocha(beverage2); // Wrap it in a second Mocha
		beverage2 = new Whip(beverage2);  // Wrap it in a Whip
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

		// 3. Order an Espresso with Soy and Mocha
		Beverage beverage3 = new Espresso();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
	}
}
