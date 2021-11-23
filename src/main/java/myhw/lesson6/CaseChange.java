package myhw.lesson6;

public class CaseChange {

    public static void main(String[] args) {

// Change given text into all upper case or lower case or change the first letter of each word (or
// sentence) to upper and the rest to lower, etc.

        String str = "the weater is fine";
        System.out.println("String = " + str);
        System.out.println("Uppercase = " + getUpperCaseString(str));
        System.out.println("First letter case = " + getFirstLetterUpperCase(str));
    }

    public static String getUpperCaseString(String str) {
        return str.toUpperCase();
    }

    public static String getFirstLetterUpperCase(String str) {
        String[] str2 = str.split(" ");
        String newstr = "";
        for (String s:str2) {
            String first = s.substring(0, 1).toUpperCase();
            String rest = s.substring(1).toLowerCase();
            newstr = newstr + first + rest + " ";
        }
        return newstr.trim();
    }

}
