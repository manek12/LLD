package designPatterns.decoratorPattern.PizzaSystem.pizzaCategories;

import designPatterns.decoratorPattern.PizzaSystem.BasePizza;

public class MargheritaPizza extends BasePizza {

    @Override
    public int getCost() {
        return 120;
    }
}
