package myhw.lesson8;

import java.util.Scanner;

public class Replace {

//5. Replace (Написать программу, которая заменяет в исходной строке все буквы а на @. Буквы о на ноль.
// Выводит новую строку на экран. Добавить обработку длины строки, максимальная длина 30 символов.
// Строка может состоять из нескольких слов и любых символов)

    public static void replace() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = scanner.nextLine();
        replaceString(str);
    }

    public static void replaceString(String str) {
        if (str.length() > 30) {
            System.out.println("The string is too long!");
        } else {
            String strA =  str.replace("a", "@");
            String strAO =  strA.replace("o", "0");
            System.out.println("The new string is: " + strAO);
        }

    }

}
