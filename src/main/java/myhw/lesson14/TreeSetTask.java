package myhw.lesson14;

import java.util.TreeSet;

public class TreeSetTask {

//    https://www.w3resource.com/java-exercises/collection/index.php#arraylist//
//    по 2 задачи с разделов HashSet, TreeSet, PriorityQueue

    public static void main(String[] args) {

        System.out.println("Task 1");
//        1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
        TreeSet<String> t1 = new TreeSet<>();
        t1.add("one");
        t1.add("two");
        t1.add("tree");
        System.out.println(t1);

        System.out.println("\n" + "Task 2");
//        2. Write a Java program to iterate through all elements in a tree set.
        TreeSet<String> t2 = new TreeSet<>();
        t2.add("one");
        t2.add("two");
        t2.add("tree");
        for (String t : t2) System.out.println(t);

    }
}
