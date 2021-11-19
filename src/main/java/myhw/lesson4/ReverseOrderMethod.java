package myhw.lesson4;

public class ReverseOrderMethod {

    public static void main(String[] args) {

// 2. Program to print the elements of an array in reverse order

        int[] arr= {1, 2, 3, 4, 5};
        int[] rev = getReverseOrder(arr);
        for (int i:rev)  System.out.println(i);
    }

    public static int[] getReverseOrder(int[] arr) {
        int[] newarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[arr.length - 1 - i];
        }
        return newarr;
    }

}
