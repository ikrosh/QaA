package myhw.lesson11.task4;

public class ParentImpl {

    public static void main(String[] args) {

        Parent parent = new Child();
        parent.methodA();

        Child child = (Child) parent;
        child.methodA();
        child.methodB();

    }
}
