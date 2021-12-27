package myhw.lesson14;

import java.util.*;

public class LinkedListTasks {

//    https://www.w3resource.com/java-exercises/collection/index.php#arraylist//
//    выполнить все задачи с раздела LinkedList

    public static void main(String[] args) {

        System.out.println("Task 1");
//        1. Write a Java program to append the specified element to the end of a linked list.
        LinkedList<String> list = new LinkedList<>();
        list.add("Madrid");
        list.add("Kiev");
        list.add("Rome");
        System.out.println(list);
        list.add("New York");
        System.out.println("Added a new element to the end of a linked list: " + list);

        System.out.println("\n" + "Task 2");
//        2. Write a Java program to iterate through all elements in a linked list.
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Madrid");
        list2.add("Kiev");
        list2.add("Rome");
        for (String l : list2) System.out.println(l);

        System.out.println("\n" + "Task 3");
//        3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
        LinkedList<String> list3 = new LinkedList<>();
        list3.add("Madrid");
        list3.add("Kiev");
        list3.add("Rome");
        list3.add("New York");
        System.out.println("Initial linked list: " + list3);
        Iterator i = list3.listIterator(1);
        while (i.hasNext()) System.out.println(i.next());

        System.out.println("\n" + "Task 4");
//        4. Write a Java program to iterate a linked list in reverse order.
        LinkedList<String> list4 = new LinkedList<>();
        list4.add("Madrid");
        list4.add("Kiev");
        list4.add("Rome");
        list4.add("New York");
        System.out.println("Initial linked list: " + list4);
        Collections.reverse(list4);
        System.out.println("Reversed linked list: " + list4);

        System.out.println("\n" + "Task 5");
//        5. Write a Java program to insert the specified element at the specified position in the linked list.
        LinkedList<String> list31 = new LinkedList<>();
        list31.add("Madrid");
        list31.add("Kiev");
        list31.add("Rome");
        System.out.println("Initial linked list: " + list31);
        list31.add(2, "New York");
        System.out.println("Linked list with added element: " + list31);

        System.out.println("\n" + "Task 6");
//        6. Write a Java program to insert elements into the linked list at the first and last position.
        LinkedList<String> list32 = new LinkedList<>();
        list32.add("Madrid");
        list32.add("Kiev");
        list32.add("Rome");
        System.out.println("Initial linked list: " + list32);
        list32.addFirst("New York");
        list32.addLast( "Chiсago");
        System.out.println("Linked list with added elements: " + list32);

        System.out.println("\n" + "Task 7");
//        7. Write a Java program to insert the specified element at the front of a linked list.
        LinkedList<String> list5 = new LinkedList<>();
        list5.add("Madrid");
        list5.add("Kiev");
        list5.add("Rome");
        System.out.println("Initial linked list: " + list5);
        list5.offerFirst("New York");
        System.out.println("Linked list with added elements at the front: " + list5);

        System.out.println("\n" + "Task 8");
//        8. Write a Java program to insert the specified element at the end of a linked list.
        LinkedList<String> list6 = new LinkedList<>();
        list6.add("Madrid");
        list6.add("Kiev");
        list6.add("Rome");
        System.out.println("Initial linked list: " + list6);
        list6.offerLast("New York");
        System.out.println("Linked list with added elements at the end: " + list6);

        System.out.println("\n" + "Task 9");
//        9. Write a Java program to insert some elements at the specified position into a linked list.
        LinkedList<String> list7 = new LinkedList<>();
        list7.add("Madrid");
        list7.add("Kiev");
        list7.add("Rome");
        System.out.println("Initial linked list: " + list7);
        LinkedList<String> list8 = new LinkedList<>();
        list8.add("Paris");
        list8.add("Lviv");
        System.out.println("Linked list to add: " + list8);
        list7.addAll(1, list8);
        System.out.println("Linked list with added list: " + list7);

        System.out.println("\n" + "Task 10");
//        10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
        LinkedList<String> list9 = new LinkedList<>();
        list9.add("Madrid");
        list9.add("Kiev");
        list9.add("Rome");
        System.out.println("Initial linked list: " + list9);
        System.out.println("First element: " + list9.getFirst());
        System.out.println("Last element: " + list9.getLast());

        System.out.println("\n" + "Task 11");
//        11. Write a Java program to display the elements and their positions in a linked list.
        LinkedList<String> list10 = new LinkedList<>();
        list10.add("Madrid");
        list10.add("Kiev");
        list10.add("Rome");
        for (int j = 0; j < list10.size(); j++) System.out.println("Element with position " + j
                + " is " + list10.get(j));

        System.out.println("\n" + "Task 12");
//        12. Write a Java program to remove a specified element from a linked list.
        LinkedList<String> list11 = new LinkedList<>();
        list11.add("Madrid");
        list11.add("Kiev");
        list11.add("Rome");
        System.out.println("Initial linked list: " + list11);
        list11.remove(1);
        System.out.println("Linked list with removed element: " + list11);

        System.out.println("\n" + "Task 13");
//        13. Write a Java program to remove first and last element from a linked list.
        LinkedList<String> list12 = new LinkedList<>();
        list12.add("Madrid");
        list12.add("Kiev");
        list12.add("Rome");
        System.out.println("Initial linked list: " + list12);
        list12.removeFirst();
        list12.removeLast();
        System.out.println("Linked list with removed element: " + list12);

        System.out.println("\n" + "Task 14");
//        14. Write a Java program to remove all the elements from a linked list.
        LinkedList<String> list13 = new LinkedList<>();
        list13.add("Madrid");
        list13.add("Kiev");
        list13.add("Rome");
        System.out.println("Initial linked list: " + list13);
        list13.clear();
        System.out.println("Linked list with removed all elements: " + list13);

        System.out.println("\n" + "Task 15");
//        15. Write a Java program of swap two elements in a linked list.
        LinkedList<String> list14 = new LinkedList<>();
        list14.add("Madrid");
        list14.add("Kiev");
        list14.add("Rome");
        System.out.println("Initial linked list: " + list14);
        Collections.swap(list14, 1,2);
        System.out.println("Linked list with swapped elements: " + list14);

        System.out.println("\n" + "Task 16");
//        16. Write a Java program to shuffle the elements in a linked list.
        LinkedList<String> list15 = new LinkedList<>();
        list15.add("Madrid");
        list15.add("Kiev");
        list15.add("Rome");
        System.out.println("Initial linked list: " + list15);
        Collections.shuffle(list15);
        System.out.println("Linked list with shuffled elements: " + list15);

        System.out.println("\n" + "Task 17");
//        17. Write a Java program to join two linked lists.
        LinkedList<String> list16 = new LinkedList<>();
        list16.add("Madrid");
        list16.add("Kiev");
        list16.add("Rome");
        System.out.println("Initial linked list1: " + list16);
        LinkedList<String> list17 = new LinkedList<>();
        list17.add("Paris");
        list17.add("Lviv");
        System.out.println("Initial linked list2: " + list17);
        LinkedList<String> list18 = new LinkedList<>();
        list18.addAll(list16);
        list18.addAll(list17);
        System.out.println("Linked list with joined elements: " + list18);

        System.out.println("\n" + "Task 18");
//        18. Write a Java program to clone an linked list to another linked list.
        LinkedList<String> list19 = new LinkedList<>();
        list19.add("Madrid");
        list19.add("Kiev");
        list19.add("Rome");
        System.out.println("Initial linked list: " + list19);
        LinkedList<String> list20 = new LinkedList<>();
        list20 = (LinkedList)list19.clone();
        System.out.println("Linked list with cloned elements: " + list20);

        System.out.println("\n" + "Task 19");
//        19. Write a Java program to clone an linked list to another linked list.
        LinkedList<String> list33 = new LinkedList<>();
        list33.add("Madrid");
        list33.add("Kiev");
        list33.add("Rome");
        System.out.println("Initial linked list: " + list33);
        LinkedList<String> list34 = new LinkedList<>();
        list34 = (LinkedList)list33.clone();
        System.out.println("Linked list with cloned elements: " + list34);

        System.out.println("\n" + "Task 20");
//        20. Write a Java program to retrieve but does not remove, the first element of a linked list.
        LinkedList<String> list21 = new LinkedList<>();
        list21.add("Madrid");
        list21.add("Kiev");
        list21.add("Rome");
        System.out.println("Initial linked list: " + list21);
        System.out.println("Linked list with retrieved first elements: " + list21.peekFirst());

        System.out.println("\n" + "Task 21");
//        21. Write a Java program to retrieve but does not remove, the last element of a linked list.
        LinkedList<String> list22 = new LinkedList<>();
        list22.add("Madrid");
        list22.add("Kiev");
        list22.add("Rome");
        System.out.println("Initial linked list: " + list22);
        System.out.println("Linked list with retrieved last elements: " + list22.peekLast());

        System.out.println("\n" + "Task 22");
//        22. Write a Java program to check if a particular element exists in a linked list.
        LinkedList<String> list23 = new LinkedList<>();
        list23.add("Madrid");
        list23.add("Kiev");
        list23.add("Rome");
        System.out.println("Initial linked list: " + list23);
        if (list23.contains("Rome")) {  System.out.println("Linked list contains a particular element"); }
        else { System.out.println("Linked list does not contain a particular element"); }

        System.out.println("\n" + "Task 23");
//        23. Write a Java program to convert a linked list to array list.
        LinkedList<String> list24 = new LinkedList<>();
        list24.add("Madrid");
        list24.add("Kiev");
        list24.add("Rome");
        System.out.println("Initial linked list: " + list24);
        List<String> list25 = new ArrayList<>(list24);
        for (String l : list25) System.out.println(l);

        System.out.println("\n" + "Task 24");
//        24. Write a Java program to compare two linked lists.
        LinkedList<String> list26 = new LinkedList<>();
        list26.add("Madrid");
        list26.add("Kiev");
        list26.add("Rome");
        System.out.println("Initial linked list: " + list26);
        LinkedList<String> list27 = new LinkedList<>();
        list27.add("Lviv");
        list27.add("Kiev");
        list27.add("Rome");
        LinkedList<String> list28 = new LinkedList<>();
        for (String l : list26) {
            list28.add(list27.contains(l) ? "Yes": "No");
        }
        System.out.println("Linked list with compare result: " + list28);

        System.out.println("\n" + "Task 25");
//        25. Write a Java program to test an linked list is empty or not.
        LinkedList<String> list29 = new LinkedList<>();
        list29.add("Madrid");
        list29.add("Kiev");
        list29.add("Rome");
        System.out.println("Initial linked list: " + list29);
        System.out.println("Check if linked list is empty: " + list29.isEmpty());
        list29.removeAll(list29);
        System.out.println("Linked list after removing elements: " + list29);
        System.out.println("Check if linked list is empty after removing elements: " + list29.isEmpty());


        System.out.println("\n" + "Task 24");
//        26. Write a Java program to replace an element in a linked list.
        LinkedList<String> list30 = new LinkedList<>();
        list30.add("Madrid");
        list30.add("Kiev");
        list30.add("Rome");
        System.out.println("Initial linked list: " + list30);
        list30.set(1, "Vienna");
        System.out.println("Linked list after replace an element: " + list30);

    }

}
