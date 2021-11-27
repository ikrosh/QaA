package myhw.lesson6;

public class CountWords {

    public static void main(String[] args) {
        String str = "the weater is fine";
        System.out.println("The text contains " + getWordsCount(str) + " words");
    }

    public static int getWordsCount(String str) {
        String[] arr = str.split(" ");
        return arr.length;
    }
}
