package myhw.lesson8;

public class Replace {

//5. Replace (Написать программу, которая заменяет в исходной строке все буквы а на @. Буквы о на ноль.
// Выводит новую строку на экран. Добавить обработку длины строки, максимальная длина 30 символов.
// Строка может состоять из нескольких слов и любых символов)

    public static void replace() {
        String str1 = "wanted to convert it into a PizzaStatusEnum? ";
        replaceString(str1);
        String str2 = "convert into PizzaStatusEnum?";
        replaceString(str2);
    }

    public static void replaceString(String str) {
        System.out.println("Initial string: " + str);

        if (str.length() > 30) {
            System.out.println("The string is too long!");
        } else {
            String strA =  str.replace("a", "@");
            String strAO =  strA.replace("o", "0");
            System.out.println("The new string is: " + strAO);
        }

    }

}
