package designPatterns.decoratorPattern.PizzaSystem.toppings;

import designPatterns.decoratorPattern.PizzaSystem.BasePizza;

public class ExtraMushroom extends ToppingDecorator{

    BasePizza pizza;

    public ExtraMushroom(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 25;
    }
}
