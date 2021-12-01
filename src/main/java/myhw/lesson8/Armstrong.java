package myhw.lesson8;

import java.util.Scanner;

public class Armstrong {

//2. Armstrong (Напишите программу для проверки является ли введенное число - числом Армстронга.
// Число Армстронга это число, значение которого равно сумме цифр, из которых оно состоит, возведенных в степень, равную количеству цифр в этом числе.
// Как пример - число 371:
//371 = 3*3*3 + 7*7*7 + 1*1*1 = 27 + 343 + 1 = 371
//Если у вас число четырехзначное:
//8208 = 8*8*8*8 + 2*2*2*2 + 0*0*0*0 + 8*8*8*8 = 4096 + 16 + 0 + 4096 = 8208)

    public static void checkArmstrongNumber() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        char[] str = String.valueOf(number).toCharArray();
        int len = str.length;
        int sum = 0;
        int[] num = new int[len];

        for (int i = 0;  i < len; i++) {
            num[i] = Integer.parseInt(String.valueOf(str[i]));
            num[i] =  (int) Math.pow(num[i], len);
            sum = sum + num[i];
        }

        if (sum == number) System.out.println("Number " + number + " is Armstrong number");
        else System.out.println("Number " + number + " is NOT Armstrong number");
    }
}
