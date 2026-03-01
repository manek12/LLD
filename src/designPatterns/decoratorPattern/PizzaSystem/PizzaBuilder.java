package designPatterns.decoratorPattern.PizzaSystem;

import designPatterns.decoratorPattern.PizzaSystem.toppings.ExtraCheese;
import designPatterns.decoratorPattern.PizzaSystem.toppings.ExtraMushroom;
import designPatterns.decoratorPattern.PizzaSystem.toppings.ExtraVeggies;

public class PizzaBuilder {

    BasePizza pizza;

    public PizzaBuilder(BasePizza pizza){
        this.pizza = pizza;
    }

    public PizzaBuilder addExtraCheese(){
        this.pizza = new ExtraCheese(this.pizza);
        return this;
    }

    public PizzaBuilder addExtraVeggies(){
        this.pizza = new ExtraVeggies(this.pizza);
        return this;
    }

    public PizzaBuilder addExtraMushroom(){
        this.pizza = new ExtraMushroom(this.pizza);
        return this;
    }

    public BasePizza build(){
        return this.pizza;
    }
}
