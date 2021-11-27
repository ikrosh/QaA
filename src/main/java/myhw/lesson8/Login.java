package myhw.lesson8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {

//    Создать программу, которая логинит пользователя. На стартовом экране запрашиваете логин  пароль.
//    Если логин удачный, переходим на след экран. Если нет, выводим ошибку. Пара логин-пароль храниться в переменных.
//    После удачного логина выводим меню с 5 вариантами задач.  Добавить обработку ошибок.
//    Разложить задачи на методы (плюсом будет разложение на классы). Все запушить в гит отдельным проэктом или папкой и скинуть мне мердж реквестом.
//1. Even Number
//2. Armstrong
//3. Reverse
//4. Fibonacci
//5. Replace


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your login:");
        String credLogin = scanner.nextLine();
        System.out.println("Enter your password:");
        String passLogin = scanner.nextLine();
        boolean result = checkCredentials(credLogin, passLogin);

        if (Boolean.TRUE.equals(result)) {
            selectFromMenu();
        } else System.out.println("Your credentials are invalid!!!");
    }

    public static boolean checkCredentials(String credLogin, String passLogin) {
        final String login = "admin";
        final String password = "qwerty";
        return credLogin.equals(login) && passLogin.equals(password);
    }

    public static void selectFromMenu() {
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
                        EvenNumber.evenNumber();
                        break;
                    case 2:
                        Armstrong.checkArmstrong();
                        break;
                    case 3:
                        Reverse.reversedString();
                        break;
                    case 4:
                        Fibonacci.fibonacciMethod();
                        break;
                    case 5:
                        Replace.replace();
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