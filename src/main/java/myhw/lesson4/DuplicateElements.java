package myhw.lesson4;

public class DuplicateElements {

    public static void main(String[] args) {

// 1.In this program, we need to print the duplicate elements present in the array. This can be done through two loops.
//  The first loop will select an element and the second loop will iteration through the array by comparing the selected element with other elements.
//  If a match is found, print the duplicate element.
//  Program to print the duplicate elements of an array
//  So, duplicate elements in the above array are 2, 3 and 8.

        int[] arr= {1, 2, 3, 4, 2, 7, 8, 8, 3};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length ; j++ ) {
                if (arr[i] == arr[j] && i != j) System.out.println(arr[i]);
            }
        }


    }
}
