package myhw.lesson14;

import java.util.PriorityQueue;

public class PriorityQueueTasks<S> {

//    https://www.w3resource.com/java-exercises/collection/index.php#arraylist//
//    по 2 задачи с разделов HashSet, TreeSet, PriorityQueue

    public static void main(String[] args) {

        System.out.println("Task 1");
//        1. Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue.
        PriorityQueue<String> pq1 = new PriorityQueue<String>();
        pq1.add("one");
        pq1.add("two");
        pq1.add("three");
        System.out.println(pq1);

        System.out.println("\n" + "Task 2");
//        2. Write a Java program to iterate through all elements in priority queue.
        PriorityQueue<String> pq2 = new PriorityQueue<String>();
        pq2.add("one");
        pq2.add("two");
        pq2.add("three");
        for (String p : pq2) System.out.println(p);

    }
}
