package designPatterns.decoratorPattern.PizzaSystem.toppings;

import designPatterns.decoratorPattern.PizzaSystem.BasePizza;

public class ExtraCheese extends ToppingDecorator{

    BasePizza pizza;

    public ExtraCheese(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 20;
    }
}
