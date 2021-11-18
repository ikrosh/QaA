package myhw.lesson4;

import java.util.Scanner;

public class StringRepeat {

    public static void main(String[] args) {

//    Write a function called repeatStr which repeats the given string string exactly n times.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string to repeat");
        String enter = scanner.nextLine();
        System.out.println("Enter number of repeat");
        int rep = scanner.nextInt();

        String sum = enter;

        if (rep > 0) {
            for (int i = 1; i < rep; i++) {
                sum = sum + enter;
            }
        }
        else if (rep == 0) sum = "";

        System.out.print(sum);
    }

}
