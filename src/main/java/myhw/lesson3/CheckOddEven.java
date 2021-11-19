package myhw.lesson3;

import java.util.Scanner;

public class CheckOddEven {

    public static void main(String[] args) {

//2.Написать программу с названием “CheckOddEven”, которая печатает “Odd Number” если переменная “number” типа int нечетная.
// Или “Even Number” если переменная четная. Программа всегда должна перед выходом печатать “BYE”

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();

        if (number%2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        System.out.println("BYE");

    }
}
