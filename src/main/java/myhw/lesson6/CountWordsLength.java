package myhw.lesson6;

import java.util.ArrayList;
import java.util.HashMap;

public class CountWordsLength {

    public static void main(String[] args) {


// Count the number of words of each length in some text.

        String str = "A test should contain three blocks which are separated by one empty lines";
        getWordsLengthCount(str);
    }

    public static void getWordsLengthCount(String str) {
        String[] arr = str.split(" ");
        ArrayList<Integer> words = new ArrayList<>();
        ArrayList<Integer> counts = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int number = arr[i].length();
            if (!words.contains(number)) {
                words.add(number);
                int index = words.indexOf(number);
                counts.add(index, 1);
            }   else {
                int index = words.indexOf(number);
                int value = counts.get(index);
                counts.add(index, value + 1);
            }
        }

        for (int i = 0; i < words.size(); i++) {
            System.out.println("Word with " + words.get(i) + " letters  appears " + counts.get(i) + " times ");
        }
    }
}
