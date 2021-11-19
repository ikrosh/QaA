package myhw.lesson4;

import java.util.Scanner;

public class QuarterMethod {

    public static void main(String[] args) {

//Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer number.

        System.out.println("This is quarter: " + getQuarter(1));
        System.out.println("This is quarter: " + getQuarter(5));
    }

    public static int getQuarter(int month) {
        return (int)Math.ceil((double)month/3);
    }
}
