package myhw.lesson6;

public class StringGenerator {

    public static void main(String[] args) {

// This function should return a randomly generated string of given length according to the specified mode.
// Modes: alpha, numeric, alphanumeric

        getGeneratedString("alpha", 4);
        getGeneratedString("numeric", 6);
        getGeneratedString("alphanumeric", 10);
    }

    public static void getGeneratedString(String type, int length) {
        String AlphaString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvxyz";
        String NumericString= "0123456789";
        String AlphaNumericString = AlphaString + NumericString;
        StringBuilder str = new StringBuilder(length);
        String pattern = "";
        switch (type) {
            case "alpha": pattern = AlphaString;
                break;
            case "numeric": pattern = NumericString;
                break;
            case "alphanumeric": pattern = AlphaNumericString;
                break;
            default: pattern = "No such type";
                break;
        }
        for ( int i = 0; i < length; i++) {
            int index = (int) (pattern.length() * Math.random());
            str.append(pattern.charAt(index));
        }
        System.out.println("Random " + type + " string: " + str.toString());
    }
}
