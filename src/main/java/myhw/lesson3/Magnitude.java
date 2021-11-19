package myhw.lesson3;

import java.util.Scanner;

public class Magnitude {

    public static void main(String[] args) {

//6.Написать программу которая будет сравнивать величину (magnitude) двух чисел.
// Например, если одно число = 3, а второе число = -9, программа должна выдать, что число -9 имеет большую величину.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number x:");
        int x = scanner.nextInt();
        System.out.println("Enter number y:");
        int y = scanner.nextInt();

        if (Math.abs(x) > Math.abs(y)) {
            System.out.println("The number x has the greatest magnitude");
        } else if (Math.abs(y) > Math.abs(x)) {
            System.out.println("The number y has the greatest magnitude");
        }

    }
}
