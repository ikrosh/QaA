package myhw.lesson8;

import java.util.Scanner;

public class Reverse {

// 3. Reverse (Напишите программу для переворачивания строки,
// изменив расположение символов в строке задом наперёд без использования встроенных в String функций.)

    public void reversedString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = scanner.nextLine();
        String rev = "";

        for (int i = 0; i < str.length(); i++) {
            rev = rev + str.charAt(str.length() - 1 - i) ;
        }

        System.out.println("Reversed string: " + rev);
    }
}
