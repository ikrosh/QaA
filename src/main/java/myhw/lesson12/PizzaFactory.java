package myhw.lesson12;

public class PizzaFactory {

    public Pizza createPizza (PizzaType type) {
        Pizza pizza = null;

        switch (type) {
            case SEA:
                pizza = new FishPizza();
                break;
            case BAVARIA:
                pizza = new MeatPizza();
                break;
            case MARGARITA:
                pizza = new VeganPizza();
                break;
        }

        return pizza;

    }
}
