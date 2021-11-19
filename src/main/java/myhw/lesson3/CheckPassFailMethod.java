package myhw.lesson3;

import java.util.Scanner;

public class CheckPassFailMethod {

    public static void main(String[] args) {

//1.Написать программу с названием “CheckPassFail”, которая выводит PASS если переменная “mark” типа int больше или равно 50 или вывести “FAIL”
// в противном случае. Программа всегда должна перед выходом печатать “DONE”

        getCheckPass(3);
        getCheckPass(88);
    }

    public static void getCheckPass(int mark) {
        if (mark >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        System.out.println("DONE");
    }
}
