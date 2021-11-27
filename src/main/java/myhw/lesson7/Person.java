package myhw.lesson7;

public class Person {
    private String name;
    private int age;
    private String  address;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age,  String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person name: " + name + " and his age is: " + age + " with address: " + address;
    }
}
