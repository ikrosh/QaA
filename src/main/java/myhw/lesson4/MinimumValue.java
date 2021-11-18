package myhw.lesson4;

public class MinimumValue {
    public static void main(String[] args) {

// 3. Write a program that finds the minimum value in an array

        int[] arr = {23, 2, 4, -3, 5};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }

        System.out.println("Minimum value is " + min);
    }

}
