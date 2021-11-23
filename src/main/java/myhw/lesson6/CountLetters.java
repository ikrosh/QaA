package myhw.lesson6;

public class CountLetters {

    public static void main(String[] args) {

// Count the single character frequencies

        String str = "the weater is fine";
        getLetterCount(str, 'e');
    }

    public static void getLetterCount(String str, char ch) {
        int p = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch==str.charAt(i)) p++;
        }
        System.out.println("Letter " + ch + " appears " + p + " times");
    }
}
