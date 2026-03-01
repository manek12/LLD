package designPatterns.decoratorPattern.PizzaSystem.pizzaCategories;

import designPatterns.decoratorPattern.PizzaSystem.BasePizza;

public class VegDelightPizza extends BasePizza {

    @Override
    public int getCost() {
        return 150;
    }
}
