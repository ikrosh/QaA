package myhw.lesson6;

public class LetterRemoval {

    public static void main(String[] args) {

// Given a phrase and a letter (or series of letters) remove all occurrences of that letter(s) in the
//phrase.

        String str = "the weater is fine";
        getLetterRemoval(str, 'e');
    }

    public static void getLetterRemoval(String str, char ch) {
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            char let = str.charAt(i);
            if (let != ch) {
               str2 = str2 + str.charAt(i);
            }
        }

        System.out.println("New string = " + str2);
    }

}
