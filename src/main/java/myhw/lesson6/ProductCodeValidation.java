package myhw.lesson6;

import org.junit.Assert;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProductCodeValidation {

    public static void main(String[] args) {

// 1st part can contain only capital letters and 6 digits. 2nd part is all digits and = the product of the
// first 6 digits taken in groups of two from the left. Eg 65*66*67 = 287430.

        String code = "AX6BYU56UX6CV6BNT7NM 287430";
        validateProductCode(code);
    }

    public static void validateProductCode(String str) {
        String[] arr = str.split(" ");
        Assert.assertTrue(arr[0].matches("[A-Z0-9]+"));
        Assert.assertTrue(arr[1].matches("[0-9]+" ));
        String s = "";
        Pattern pat = Pattern.compile("[0-9]+");
        Matcher matcher = pat.matcher(arr[0]);

        while (matcher.find()) {
            s = s + matcher.group();
        };

        Assert.assertEquals(6, s.length());
        int p = 1;

        for (int i=0;  i < s.length();) {
            String s2 = s.substring(i, i+2);
            p = p * Integer.parseInt(s2);
            i = i + 2;
        }

        Assert.assertEquals(Integer.parseInt(arr[1]), p);
    }
}
