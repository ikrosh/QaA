package myhw.lesson4;

public class ReverseOrder {

    public static void main(String[] args) {

// 2. Program to print the elements of an array in reverse order

        int[] arr= {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
             System.out.println(arr[arr.length - 1 - i]);
        }


    }
}
