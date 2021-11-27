package myhw.lesson8;

import java.util.Scanner;

public class EvenNumber {

// 2. Even Number (Напишите программу которая определяет, является ли число четным или нет.
// Проверять только целые числа. Добавить обработку ошибок с описанием.)

     public static void evenNumber() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        String str = scanner.nextLine();

        if (str.matches("[-0-9]+" )) {
            int number = Integer.parseInt(str);

            if (number%2 == 0) {
                System.out.println("Even Number");
            } else {
            System.out.println("Odd number");
            }

        } else System.out.println("Incorrect data format! Number should be integer!");

    }
}
