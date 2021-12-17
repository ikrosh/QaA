package myhw.lesson10.task2;

public class Student {

    String firstName;
    String lastName;
    String group;
    double averageMark;

    final static int mark = 5;

    Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        if (averageMark == mark) return 100;
        else return 80;
    }

}
