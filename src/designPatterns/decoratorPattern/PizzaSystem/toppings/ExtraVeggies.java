package designPatterns.decoratorPattern.PizzaSystem.toppings;

import designPatterns.decoratorPattern.PizzaSystem.BasePizza;

public class ExtraVeggies extends ToppingDecorator{

    BasePizza pizza;

    public ExtraVeggies(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 30;
    }
}
