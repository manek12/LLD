package designPatterns.decoratorPattern.PizzaSystem.pizzaCategories;

import designPatterns.decoratorPattern.PizzaSystem.BasePizza;

public class FarmhousePizza extends BasePizza {

    @Override
    public int getCost() {
        return 200;
    }
}
