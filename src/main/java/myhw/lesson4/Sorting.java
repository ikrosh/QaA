package myhw.lesson4;

public class Sorting {

    public static void main(String[] args) {

//    4. Write a program that sorts an array from minimum to maximum

        int[] arr = {23, 2, 4, -3, 5};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {

                if (arr[j] > arr[j+1]) {
                  int k = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = k;
                }
            }

        }

        for (int a:arr)  System.out.println(a);

    }
}
