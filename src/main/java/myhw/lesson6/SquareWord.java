package myhw.lesson6;

public class SquareWord {

    public static void main(String[] args) {

// Given a word, print a square made from letter rotations of the word as in:
//help
//elph
//lphe
//phel

        String str = "weather";
        printWordSquare(str);
    }

    public static void printWordSquare(String str) {
        for (int i = 0; i < str.length(); i++) {
            String s2 = str.substring(i) + str.substring(0, i);
            System.out.println(s2);
        }
    }
}
