package myhw.lesson11.task2;

public class Book implements Printable {

    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void print() {
        System.out.println("Book has name " + getName());
    }

    public static void printBooks(Printable[] printables) {
        for (Printable p : printables) {
            if (p instanceof Book) {
                p.print();
            }
        }
    }


}
