package myhw.lesson3;

import java.util.Scanner;

public class Purchase {

    public static void main(String[] args) {

//(*). Сумма покупки составляет а$. Если а больше 1000$, то предоставляется скидка 15%.
// Вывести на экран сумму покупки с учетом скидки либо сообщение о том, что скидка не предоставляется.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter purchase sum:");
        int x = scanner.nextInt();

        if (x > 1000) {
            System.out.println("Sum with discount = " + 0.85 * x);
        } else if (x > 0 && x <= 1000) {
            System.out.println("No discount is provided");
        }
    }
}
