package myhw.lesson8;

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
        Credentials credentials = new Credentials();
        boolean result = credentials.checkCredentials(credLogin, passLogin);

        if (result) {
            Menu menu = new Menu();
            menu.selectFromMenu();
        } else System.out.println("Your credentials are invalid!!!");
    }

}