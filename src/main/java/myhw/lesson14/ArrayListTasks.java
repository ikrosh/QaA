package myhw.lesson14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTasks {

//    https://www.w3resource.com/java-exercises/collection/index.php#arraylist//
//    выполнить все задачи с раздела ArrayList

    public static void main(String[] args) {

        System.out.println("Task 1");
//        1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("red");
        colors.add("blue");
        System.out.println("Collection: " + colors);

        System.out.println("\n" + "Task 2");
//        2. Write a Java program to iterate through all elements in a array list.
        List<String> colors2 = new ArrayList<>();
        colors2.add("white");
        colors2.add("red");
        colors2.add("blue");
        colors2.add("black");
        colors2.add("yellow");
        System.out.println("Collection: ");
        for (String c : colors2) System.out.println(c);

        System.out.println("\n" + "Task 3");
//        3. Write a Java program to insert an element into the array list at the first position.
        List<String> colors3 = new ArrayList<>();
        colors3.add("white");
        colors3.add("red");
        colors3.add("blue");
        colors3.add("black");
        colors3.add("yellow");
        System.out.println(colors3);
        colors3.add(0, "new color");
        System.out.println("After adding a new element: " + colors3);

        System.out.println("\n" + "Task 4");
//        4. Write a Java program to retrieve an element (at a specified index) from a given array list.
        List<String> colors4 = new ArrayList<>();
        colors4.add("white");
        colors4.add("red");
        colors4.add("blue");
        colors4.add("black");
        colors4.add("yellow");
        System.out.println(colors4);
        System.out.println("Retrieved element: " + colors4.get(3));

        System.out.println("\n" + "Task 5");
//        5. Write a Java program to update specific array element by given element.
        List<String> colors5 = new ArrayList<>();
        colors5.add("white");
        colors5.add("red");
        colors5.add("blue");
        colors5.add("black");
        colors5.add("yellow");
        System.out.println(colors5);
        colors5.set(3, "new black");
        System.out.println("After updating an element: " + colors5);

        System.out.println("\n" + "Task 6");
//        6. Write a Java program to remove the third element from a array list.
        List<String> colors6 = new ArrayList<>();
        colors6.add("white");
        colors6.add("red");
        colors6.add("blue");
        colors6.add("black");
        colors6.add("yellow");
        System.out.println(colors6);
        colors6.remove(2);
        System.out.println("After removing an element: " + colors6);

        System.out.println("\n" + "Task 7");
//        7. Write a Java program to search an element in a array list.
        List<String> colors7 = new ArrayList<>();
        colors7.add("white");
        colors7.add("red");
        colors7.add("blue");
        colors7.add("black");
        colors7.add("yellow");
        System.out.println(colors7);
        if (colors7.contains("blue")) {
            System.out.println("Element was found!!");
        } else { System.out.println("Element is absent!!"); }

        System.out.println("\n" + "Task 8");
//        8. Write a Java program to sort a given array list.
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(6);
        numbers.add(3);
        numbers.add(0);
        numbers.add(100);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println("After sorting elements: " + numbers);

        System.out.println("\n" + "Task 9");
//        9. Write a Java program to copy one array list into another.
        List<String> arr1 = new ArrayList<>();
        arr1.add("white");
        arr1.add("red");
        arr1.add("blue");
        System.out.println("Arr1 = " + arr1);
        List<String> arr2 = new ArrayList<>();
        arr2.add("5");
        arr2.add("5");
        arr2.add("5");
        System.out.println("Arr2 = " + arr2);
        Collections.copy(arr1, arr2);
        System.out.println("Arr1 after copy: " + arr1);
        System.out.println("Arr2 after copy: " + arr2);

        System.out.println("\n" + "Task 10");
//        10. Write a Java program to shuffle elements in a array list.
        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(4);
        numbers2.add(5);
        System.out.println(numbers2);
        Collections.shuffle(numbers2);
        System.out.println("After shuffle elements: " + numbers2);

        System.out.println("\n" + "Task 11");
//        11. Write a Java program to reverse elements in a array list.
        List<Integer> numbers3 = new ArrayList<>();
        numbers3.add(1);
        numbers3.add(2);
        numbers3.add(3);
        numbers3.add(4);
        numbers3.add(5);
        System.out.println(numbers3);
        Collections.reverse(numbers3);
        System.out.println("After reverse elements: " + numbers3);

        System.out.println("\n" + "Task 12");
//        12. Write a Java program to extract a portion of a array list.
        List<Integer> numbers4 = new ArrayList<>();
        numbers4.add(1);
        numbers4.add(2);
        numbers4.add(3);
        numbers4.add(4);
        numbers4.add(5);
        System.out.println(numbers4);
        List<Integer> numbers5 = numbers4.subList(1,  3);
        System.out.println("Extract a portion: " + numbers5);

        System.out.println("\n" + "Task 13");
//        13. Write a Java program to compare two array lists.
        ArrayList<Integer> numbers6 = new ArrayList<>();
        numbers6.add(1);
        numbers6.add(2);
        numbers6.add(3);
        numbers6.add(4);
        numbers6.add(5);
        System.out.println(numbers6);
        ArrayList<Integer> numbers7 = new ArrayList<>();
        numbers7.add(17);
        numbers7.add(21);
        numbers7.add(3);
        numbers7.add(45);
        numbers7.add(5);
        System.out.println(numbers7);
        List<String> compare = new ArrayList<>();
        for (Integer n : numbers6) {
            compare.add(numbers7.contains(n) ? "Yes" : "No");
        }
        System.out.println("Compare result: " + compare);

        System.out.println("\n" + "Task 14");
//        14. Write a Java program of swap two elements in an array list.
        ArrayList<Integer> numbers8 = new ArrayList<>();
        numbers8.add(1);
        numbers8.add(2);
        numbers8.add(3);
        numbers8.add(4);
        numbers8.add(5);
        System.out.println(numbers8);
        Collections.swap(numbers8, 0, 4);
        System.out.println("Swap results:" + numbers8);

        System.out.println("\n" + "Task 15");
//        15. Write a Java program to join two array lists.
        ArrayList<Integer> numbers9 = new ArrayList<>();
        numbers9.add(17);
        numbers9.add(21);
        numbers9.add(3);
        numbers9.add(45);
        numbers9.add(5);
        System.out.println(numbers9);
        ArrayList<Integer> numbers10 = new ArrayList<>();
        numbers10.add(1);
        numbers10.add(2);
        numbers10.add(3);
        numbers10.add(4);
        numbers10.add(5);
        System.out.println(numbers10);
        numbers9.addAll(numbers10);
        System.out.println("Join results:" + numbers9);

        System.out.println("\n" + "Task 16");
//        16. Write a Java program to clone an array list to another array list.
        ArrayList<Integer> numbers11 = new ArrayList<>();
        numbers11.add(17);
        numbers11.add(21);
        numbers11.add(3);
        numbers11.add(45);
        numbers11.add(5);
        System.out.println(numbers11);
        ArrayList<Integer> numbers12 = (ArrayList)numbers11.clone();
        System.out.println("Clone result: " + numbers12);

        System.out.println("\n" + "Task 17");
//        17. Write a Java program to empty an array list.
        ArrayList<Integer> numbers13 = new ArrayList<>();
        numbers13.add(17);
        numbers13.add(21);
        numbers13.add(3);
        numbers13.add(45);
        numbers13.add(5);
        System.out.println(numbers13);
        numbers13.removeAll(numbers13);
        System.out.println("Clear arrey result: " + numbers13);

        System.out.println("\n" + "Task 18");
//        18. Write a Java program to test an array list is empty or not.
        ArrayList<Integer> numbers14 = new ArrayList<>();
        numbers14.add(17);
        numbers14.add(21);
        numbers14.add(3);
        numbers14.add(45);
        numbers14.add(5);
        System.out.println(numbers14);
        System.out.println("Check if array list is empty: " + numbers14.isEmpty());
        numbers14.removeAll(numbers14);
        System.out.println("Array list after removing all elements: " + numbers14);
        System.out.println("Check if array list is empty: " + numbers14.isEmpty());

        System.out.println("\n" + "Task 19");
//        19. Write a Java program to trim the capacity of an array list the current list size.
        ArrayList<Integer> numbers15 = new ArrayList<>();
        numbers15.add(17);
        numbers15.add(21);
        numbers15.add(3);
        numbers15.add(45);
        numbers15.add(5);
        System.out.println(numbers15);
        numbers15.trimToSize();
        System.out.println("Trim the capacity of an array list: " + numbers15);

        System.out.println("\n" + "Task 20");
//        20. Write a Java program to increase the size of an array list.
        ArrayList<Integer> numbers16 = new ArrayList<>(2);
        numbers16.add(17);
        numbers16.add(21);
        System.out.println(numbers16);
        numbers16.ensureCapacity(5);
        numbers16.add(1);
        numbers16.add(55);
        numbers16.add(24);
        System.out.println("New array list: " + numbers16);

        System.out.println("\n" + "Task 21");
//        21. Write a Java program to replace the second element of a ArrayList with the specified element.
        ArrayList<Integer> numbers17 = new ArrayList<>();
        numbers17.add(17);
        numbers17.add(21);
        numbers17.add(1);
        System.out.println(numbers17);
        numbers17.set(1, 21000);
        System.out.println("New array list: " + numbers17);


        System.out.println("\n" + "Task 22");
//        22. Write a Java program to print all the elements of a ArrayList using the position of the elements.
        ArrayList<Integer> numbers18 = new ArrayList<>();
        numbers18.add(17);
        numbers18.add(21);
        numbers18.add(1);
        for (int i = 0; i < numbers18.size(); i++) System.out.println(numbers18.get(i));

    }

}
