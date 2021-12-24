package myhw.lesson12;

public class GetPizza {

    public static void main(String[] args) {

        // get organic pizza

        PizzaShop organicPizzaShop = new PizzaShopOrganic();
        organicPizzaShop.orderPizza(PizzaType.MARGARITA);

        // get whole grain flour pizza

        PizzaShop wholeGrainPizzaShop = new PizzaShopWholeGrain();
        wholeGrainPizzaShop.orderPizza(PizzaType.SEA);


    }
}
