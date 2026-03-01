package designPatterns.decoratorPattern.PizzaSystem;

import designPatterns.decoratorPattern.PizzaSystem.pizzaCategories.FarmhousePizza;
import designPatterns.decoratorPattern.PizzaSystem.pizzaCategories.MargheritaPizza;
import designPatterns.decoratorPattern.PizzaSystem.pizzaCategories.VegDelightPizza;
import designPatterns.decoratorPattern.PizzaSystem.toppings.ExtraCheese;
import designPatterns.decoratorPattern.PizzaSystem.toppings.ExtraMushroom;
import designPatterns.decoratorPattern.PizzaSystem.toppings.ExtraVeggies;

public class PizzaMain {

    public static void main(String[] args) {
//        BasePizza margheritaPizza = new MargheritaPizza();
//        BasePizza farmhousePizza = new FarmhousePizza();
//        BasePizza vegDelightPizza = new VegDelightPizza();
//
//        BasePizza margheritaPizzaWithCheeseAndMushroom = new ExtraMushroom(new ExtraCheese(margheritaPizza));
//        BasePizza farmhousePizzaWithVeggies = new ExtraVeggies(farmhousePizza);
//        BasePizza vegDelightPizzaWithCheeseAndVeggiesAndMushroom = new ExtraMushroom(new ExtraVeggies(new ExtraCheese(vegDelightPizza)));
//
//        System.out.println("Margherita Pizza with Extra Cheese and Mushroom: " + margheritaPizzaWithCheeseAndMushroom.getCost());
//        System.out.println("Farmhouse Pizza with Extra Veggies: " + farmhousePizzaWithVeggies.getCost());
//        System.out.println("Veg Delight Pizza with Extra Cheese, Veggies and Mushroom: " + vegDelightPizzaWithCheeseAndVeggiesAndMushroom.getCost());


        //if you don't want to use more constructor chaining then we can use builder pattern to create the pizza with different toppings, that is more readable and maintainable
        BasePizza margheritaPizzaWithCheeseAndMushroom = new PizzaBuilder(new MargheritaPizza())
                .addExtraCheese()
                .addExtraMushroom()
                .build();
        BasePizza farmhousePizzaWithVeggies = new PizzaBuilder(new FarmhousePizza())
                .addExtraVeggies()
                .build();
        BasePizza vegDelightPizzaWithCheeseAndVeggiesAndMushroom = new PizzaBuilder(new VegDelightPizza())
                .addExtraCheese()
                .addExtraVeggies()
                .addExtraMushroom()
                .build();

        System.out.println("Margherita Pizza with Extra Cheese and Mushroom: " + margheritaPizzaWithCheeseAndMushroom.getCost());
        System.out.println("Farmhouse Pizza with Extra Veggies: " + farmhousePizzaWithVeggies.getCost());
        System.out.println("Veg Delight Pizza with Extra Cheese, Veggies and Mushroom: " + vegDelightPizzaWithCheeseAndVeggiesAndMushroom.getCost());
    }
}
