package myhw.lesson4;

public class ReversibleSring {

    public static void main(String[] args) {

// 5. Write a program that outputs a reversible string (use an array of characters - char string [])

        char[] arr= {'r', 's', 't', 'u', 'v'};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[arr.length - 1 - i]);
        }
    }
}
