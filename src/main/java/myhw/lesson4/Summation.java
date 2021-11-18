package myhw.lesson4;

import java.util.Scanner;

public class Summation {

    public static void main(String[] args) {

//    Write a program that finds the summation of every number from 1 to num.
//    The number will always be a positive integer greater than 0.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number > 0:");
        int number = scanner.nextInt();
        int sum =  0;

        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }

        System.out.println("Sum is " + sum);
    }

}
