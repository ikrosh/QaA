package myhw.lesson4;

import java.util.Scanner;

public class Quarter {

    public static void main(String[] args) {

//Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer number.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 1 to 12:");
        int month = scanner.nextInt();

        System.out.println("This is quarter: " + (int)Math.ceil((double)month/3) );
    }
}
