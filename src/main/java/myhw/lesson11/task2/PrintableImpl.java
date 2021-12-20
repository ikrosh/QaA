package myhw.lesson11.task2;

public class PrintableImpl {

    public static void main(String[] args) {

        Book book1 = new Book("Bukvar");
        Book book2 = new Book("Skanavi");
        Magazine magazine1 = new Magazine("Svet");
        Magazine magazine2 = new Magazine("Science");

        Printable[] printables = {book1, book2, magazine1, magazine2};
        Book.printBooks(printables);
        Magazine.printMagazines(printables);
    }
}
