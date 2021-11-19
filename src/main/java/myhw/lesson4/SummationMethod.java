package myhw.lesson4;

public class SummationMethod {

    public static void main(String[] args) {

//    Write a program that finds the summation of every number from 1 to num.
//    The number will always be a positive integer greater than 0.

        System.out.println("Sum is " + getNumberSum(6));
        int p = getNumberSum(3);
        System.out.println("Sum is " + p);
    }

    public static int getNumberSum(int number) {
        int sum =  0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        return sum;
    }

}
