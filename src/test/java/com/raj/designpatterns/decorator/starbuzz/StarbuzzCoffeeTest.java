package com.raj.designpatterns.decorator.starbuzz;

import com.raj.designpatterns.decorator.core.Beverage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StarbuzzCoffeeTest {

    @Test
    void testEspressoCostAndDescription() {
        Beverage espresso = new Espresso();
        assertEquals("Espresso", espresso.getDescription());
        assertEquals(1.99, espresso.cost(), 0.001);
    }

    @Test
    void testHouseBlendWithDoubleMochaAndWhip() {
        Beverage beverage = new HouseBlend(); // 0.89
        beverage = new Mocha(beverage);       // + 0.20
        beverage = new Mocha(beverage);       // + 0.20
        beverage = new Whip(beverage);        // + 0.10
                                              // Total: 1.39

        assertEquals("House Blend Coffee, Mocha, Mocha, Whip", beverage.getDescription());
        assertEquals(1.39, beverage.cost(), 0.001);
    }
}
