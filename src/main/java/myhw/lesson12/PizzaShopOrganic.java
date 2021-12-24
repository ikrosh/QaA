package myhw.lesson12;

public class PizzaShopOrganic extends PizzaShop{

    @Override
    public Pizza createPizza (PizzaType type) {
        Pizza pizza = null;

        switch (type) {
            case SEA:
                pizza = new FishPizzaOrganic();
                break;
            case BAVARIA:
                pizza = new MeatPizzaOrganic();
                break;
            case MARGARITA:
                pizza = new VeganPizzaOrganic();
                break;
        }

        return pizza;

    }
}
