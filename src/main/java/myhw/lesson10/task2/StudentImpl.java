package myhw.lesson10.task2;

import java.util.ArrayList;
import java.util.List;

public class StudentImpl {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Tom", "Ronnin", "G1", 4.3));
        students.add(new Student("Shon", "Verti", "G1", 5.0));
        students.add(new Aspirant("Rina", "larno", "G1", 5.0, "study1"));
        students.add(new Aspirant("Tony", "Tren", "G1", 4.9, "study2"));

        for (Student s : students) System.out.println(s.getScholarship());

    }
}
