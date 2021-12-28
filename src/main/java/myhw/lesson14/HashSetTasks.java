package myhw.lesson14;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTasks {

//    https://www.w3resource.com/java-exercises/collection/index.php#arraylist//
//    по 2 задачи с разделов HashSet, TreeSet, PriorityQueue

    public static void main(String[] args) {

        System.out.println("Task 1");
//        1. . Write a Java program to append the specified element to the end of a hash set.
        HashSet h1 = new HashSet();
        h1.add("tree");
        h1.add("apple");
        System.out.println(h1);

        System.out.println("\n" + "Task 2");
//        2. Write a Java program to iterate through all elements in a hash list.
        HashSet h2 = new HashSet();
        h2.add("tree");
        h2.add("apple");
        h2.add("wine");
        Iterator<String> i = h2.iterator();
        while (i.hasNext()) System.out.println(i.next());
    }
}
