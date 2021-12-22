package myhw.lesson12;

public abstract class PizzaShop {

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);
        pizza.preparePizza();
        pizza.bakePizza();
        pizza.servePizza();

        System.out.println("Your pizza is ready!!!");
        return pizza;
    }

    protected abstract Pizza createPizza(PizzaType type);
}
