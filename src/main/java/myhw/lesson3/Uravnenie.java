package myhw.lesson3;

import java.util.Scanner;

public class Uravnenie {

    public static void main(String[] args) {

// 5.Написать программу, которая бы решала уравнение вида a * x + b = 0
//Переменные a и b можно задать вручную. Далее нужно будет посчитать и вывести значение “х”.
// Программа должна также учитывать варианты, когда или а = 0 или b = 0

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a:");
        int a = scanner.nextInt();
        System.out.println("Enter number b:");
        int b = scanner.nextInt();

        if (a != 0 ) {
           System.out.println("x = " + -(double)b/a);
        } else if (a == 0 && b == 0) {
            System.out.println("x = any number" );
        } else if (a == 0 && b != 0) {
            System.out.println("no solution" );
        }
    }
}

