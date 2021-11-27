package myhw.lesson7;

public class PersonImpl {

    public static void main(String args[]) {

        Person Bob = new Person("Bob", 32,   "Some address");
        System.out.println(Bob.toString());

        Person Bobby = new Person("Bobby", 28);
        System.out.println(Bobby.toString());
    }
}
