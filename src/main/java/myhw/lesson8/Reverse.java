package myhw.lesson8;

public class Reverse {

// 3. Reverse (Напишите программу для переворачивания строки,
// изменив расположение символов в строке задом наперёд без использования встроенных в String функций.)

    public static void reversedString() {
        String str = "wanted to convert it into a PizzaStatusEnum? ";
        System.out.println("Initial string: " + str);
        String rev = "";

        for (int i = 0; i < str.length(); i++) {
            rev = rev + str.charAt(str.length() - 1 - i) ;
        }

        System.out.println("Reversed string: " + rev);
    }
}
