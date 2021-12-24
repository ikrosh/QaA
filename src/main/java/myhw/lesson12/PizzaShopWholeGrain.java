package myhw.lesson12;

public class PizzaShopWholeGrain extends PizzaShop {

    @Override
    public Pizza createPizza (PizzaType type) {
        Pizza pizza = null;

        switch (type) {
            case SEA:
                pizza = new FishPizzaWholeGrain();
                break;
            case BAVARIA:
                pizza = new MeatPizzaWholeGrain();
                break;
            case MARGARITA:
                pizza = new VeganPizzaWholeGrain();
                break;
        }

        return pizza;

    }
}
