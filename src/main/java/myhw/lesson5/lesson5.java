package myhw.lesson5;

public class lesson5 {

    public static void main(String[] args) {

        System.out.println(" task1");
        System.out.println(getEvenOddNumber(3));
        System.out.println(getEvenOddNumber(10));

        System.out.println("\n" + " task2");
        int[] ar = {1, 5, 3, 10};
        System.out.println(getArraySum(ar));

        System.out.println("\n" + " task3");
        char[] arr = {'a', 's', 'g'};
        int[] newarr = getArrayCodes(arr);
        for (int i: newarr) System.out.println(i);

    }

    public static boolean getEvenOddNumber(int number) {
        if (number % 2 == 0) return true;
        else return false;
    }

    public static int getArraySum(int[] ar) {
        int s = 0;
        for (int i:ar)   s=s+i;
        return s;
    }

    public static int[] getArrayCodes(char[] arr) {
        int newarr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) newarr[i] = (int)arr[i];
        return newarr;
    }

}