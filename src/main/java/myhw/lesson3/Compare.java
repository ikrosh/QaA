package myhw.lesson3;

import java.util.Scanner;

public class Compare {

    public static void main(String[] args) {

//4.Написать программу, которая сравнивает два числа типа int и определяет, какое из чисел большее, а какое меньшее.
// Программа должна вывести что-то типа “The number x has the greatest value”. Где “x” одно из чисел

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number x:");
        int x = scanner.nextInt();
        System.out.println("Enter number y:");
        int y = scanner.nextInt();

        if (x > y) {
            System.out.println("The number x has the greatest value");
        } else if (y > x) {
            System.out.println("The number y has the greatest value");
        }

    }
}
