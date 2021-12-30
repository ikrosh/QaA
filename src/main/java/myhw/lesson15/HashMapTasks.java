package myhw.lesson15;

import java.util.*;

public class HashMapTasks {

    public static void main(String[] args) {

        System.out.println("Task 1");
//        1. Write a Java program to associate the specified value with the specified key in a HashMap.
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "grey");
        hm.put(2, "yellow");
        hm.put(3, "white");
        for (Map.Entry m : hm.entrySet()) System.out.println("key: " + m.getKey() + ", value: " + m.getValue());

        System.out.println("\n" + "Task 2");
//        2. Write a Java program to count the number of key-value (size) mappings in a map.
        HashMap<Integer, String> hm1 = new HashMap<>();
        hm1.put(1, "grey");
        hm1.put(2, "yellow");
        hm1.put(3, "white");
        System.out.println("Size: " + hm1.size());

        System.out.println("\n" + "Task 3");
//        3. Write a Java program to copy all of the mappings from the specified map to another map.
        HashMap<Integer, String> hm2 = new HashMap<>();
        hm2.put(1, "grey");
        hm2.put(2, "yellow");
        hm2.put(3, "white");
        for (Map.Entry m : hm2.entrySet()) System.out.println("Initial hash map - key: " + m.getKey() + ", value: " + m.getValue());
        HashMap<Integer, String> hm3 = new HashMap<>();
        hm3.putAll(hm2);
        for (Map.Entry m : hm3.entrySet()) System.out.println("Copied hash map - key: " + m.getKey() + ", value: " + m.getValue());

        System.out.println("\n" + "Task 4");
//        4. Write a Java program to remove all of the mappings from a map.
        HashMap<Integer, String> hm4 = new HashMap<>();
        hm4.put(1, "grey");
        hm4.put(2, "yellow");
        hm4.put(3, "white");
        for (Map.Entry m : hm4.entrySet()) System.out.println("Initial hash map - key: " + m.getKey() + ", value: " + m.getValue());
        hm4.clear();
        for (Map.Entry m : hm4.entrySet()) System.out.println("Cleared hash map - key: " + m.getKey() + ", value: " + m.getValue());

        System.out.println("\n" + "Task 5");
//        5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
        HashMap<Integer, String> hm5 = new HashMap<>();
        hm5.put(1, "grey");
        hm5.put(2, "yellow");
        hm5.put(3, "white");
        for (Map.Entry m : hm5.entrySet()) System.out.println("Initial has map - key: " + m.getKey() + ", value: " + m.getValue());
        System.out.println("Check if hash map is empty: " + hm5.isEmpty());
        hm5.clear();
        System.out.println("Check if hash map is empty ater clearing: " + hm5.isEmpty());

        System.out.println("\n" + "Task 6");
//        6. Write a Java program to get a shallow copy of a HashMap instance.
        HashMap<Integer, String> hm6 = new HashMap<>();
        hm6.put(1, "grey");
        hm6.put(2, "yellow");
        hm6.put(3, "white");
        for (Map.Entry m : hm6.entrySet()) System.out.println("Initial has map - key: " + m.getKey() + ", value: " + m.getValue());
        HashMap<Integer, String> hm7 = new HashMap<>();
        hm7 = (HashMap)hm6.clone();
        for (Map.Entry m : hm7.entrySet()) System.out.println("Cloned has map - key: " + m.getKey() + ", value: " + m.getValue());

        System.out.println("\n" + "Task 7");
//        7. Write a Java program to test if a map contains a mapping for the specified key.
        HashMap<Integer, String> hm8 = new HashMap<>();
        hm8.put(1, "grey");
        hm8.put(2, "yellow");
        hm8.put(3, "white");
        for (Map.Entry m : hm8.entrySet()) System.out.println("Initial has map - key: " + m.getKey() + ", value: " + m.getValue());
        System.out.println("Has map contains key 2: " +  hm8.containsKey(2));
        System.out.println("Has map contains key 20: " +  hm8.containsKey(20));

        System.out.println("\n" + "Task 8");
//        8. Write a Java program to test if a map contains a mapping for the specified value.
        HashMap<Integer, String> hm9 = new HashMap<>();
        hm9.put(1, "grey");
        hm9.put(2, "yellow");
        hm9.put(3, "white");
        for (Map.Entry m : hm9.entrySet()) System.out.println("Initial has map - key: " + m.getKey() + ", value: " + m.getValue());
        System.out.println("Has map contains value yellow: " +  hm9.containsValue("yellow"));
        System.out.println("Has map contains value black: " +  hm9.containsValue("black"));

        System.out.println("\n" + "Task 9");
//        9. Write a Java program to create a set view of the mappings contained in a map.
        HashMap<Integer, String> hm10 = new HashMap<>();
        hm10.put(1, "grey");
        hm10.put(2, "yellow");
        hm10.put(3, "white");
        for (Map.Entry m : hm10.entrySet()) System.out.println("Initial has map - key: " + m.getKey() + ", value: " + m.getValue());
        System.out.println("Set view: " + hm10.entrySet());

        System.out.println("\n" + "Task 10");
//        10. Write a Java program to get the value of a specified key in a map.
        HashMap<Integer, String> hm11 = new HashMap<>();
        hm11.put(1, "grey");
        hm11.put(2, "yellow");
        hm11.put(3, "white");
        for (Map.Entry m : hm11.entrySet()) System.out.println("Initial has map - key: " + m.getKey() + ", value: " + m.getValue());
        System.out.println("Value from key: " + hm11.get(1));

        System.out.println("\n" + "Task 11");
//        11. Write a Java program to get a set view of the keys contained in this map.
        HashMap<Integer, String> hm12 = new HashMap<>();
        hm12.put(1, "grey");
        hm12.put(2, "yellow");
        hm12.put(3, "white");
        for (Map.Entry m : hm12.entrySet()) System.out.println("Initial has map - key: " + m.getKey() + ", value: " + m.getValue());
        System.out.println("Set view of the keys: " + hm12.keySet());

        System.out.println("\n" + "Task 12");
//        12. Write a Java program to get a collection view of the values contained in this map.
        HashMap<Integer, String> hm13 = new HashMap<>();
        hm13.put(1, "grey");
        hm13.put(2, "yellow");
        hm13.put(3, "white");
        for (Map.Entry m : hm13.entrySet()) System.out.println("Initial has map - key: " + m.getKey() + ", value: " + m.getValue());
        System.out.println("Set view of the values: " + hm13.values());

    }
}
