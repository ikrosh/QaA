package myhw.lesson8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public void selectFromMenu() {
        List<String> menu = new ArrayList<>();
        menu.add("1. Even Number");
        menu.add("2. Armstrong");
        menu.add("3. Reverse");
        menu.add("4. Fibonacci");
        menu.add("5. Replace");

        List<Integer> items = new ArrayList<>();
        for (int k = 0; k < menu.size(); k++) {
            String cur = menu.get(k).substring(0, 1);
            items.add(k, Integer.parseInt(cur));
        }

        int del = -1;
        int menuItem = 1;
        int i = 0;

        for (; i < 3; ) {

            if (del != -1) {
                menu.remove(del);
                items.remove(del);
            }

            System.out.println("\nSelect from menu:");

            for (String m : menu) {
                System.out.println(m);
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("\nEnter menu item number:");
            menuItem = scanner.nextInt();

            if (items.contains(menuItem)) {
                del = items.indexOf(menuItem);

                switch (menuItem) {
                    case 1:
                        EvenNumber evenNumber = new EvenNumber();
                        evenNumber.checkEvenNumber();
                        break;
                    case 2:
                        Armstrong armstrong = new Armstrong();
                        armstrong.checkArmstrongNumber();
                        break;
                    case 3:
                        Reverse reverse = new Reverse();
                        reverse.reversedString();
                        break;
                    case 4:
                        Fibonacci fibonacci = new Fibonacci();
                        fibonacci.checkFibonacciSum();
                        break;
                    case 5:
                        Replace replace = new Replace();
                        replace.replaceString();
                        break;
                }

                i++;

            } else if (!items.contains(menuItem)) {
                System.out.println("You've entered incorrect menu item! Game is over!");
                i = 3;
            }

        }

    }
}
