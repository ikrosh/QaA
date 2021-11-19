package myhw.lesson3;

public class PurchaseMethod {

    public static void main(String[] args) {

//(*). Сумма покупки составляет а$. Если а больше 1000$, то предоставляется скидка 15%.
// Вывести на экран сумму покупки с учетом скидки либо сообщение о том, что скидка не предоставляется.

        getPurchaseSum(879);
        getPurchaseSum(18436);
    }

    public static void getPurchaseSum(int purchase) {
        if (purchase > 1000) {
            System.out.println("Sum with discount = " + 0.85 * purchase);
        } else if (purchase > 0 && purchase <= 1000) {
            System.out.println("No discount is provided");
        }
    }
}
