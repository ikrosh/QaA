package myhw.lesson9;

public class ReaderImpl {

    public static void main(String args[]) {
        Book book1 = new Book("Приключения", "Some Author");
        Book book2 = new Book("Словарь", "New Author");
        Book book3 = new Book("Энциклопедия", "Latest Author");
        Book[] books = {book1, book2, book3};

        Reader reader1 = new Reader("Петров В.В.", "R001", "ФИОТ", "11.12.2000", "3804441112233");
        Reader reader2 = new Reader("Иванов Ф.T.", "R002", "РТФ", "17.03.2000", "3804441112211");
        Reader reader3 = new Reader("Сидоров А.Л.", "R003", "ФЭЛ", "12.09.2000", "3804441113311");
        Reader[] readers = {reader1, reader2, reader3};

        reader1.takeBook(3);
        reader1.returnBook(3);

        reader2.takeBook("Приключения", "Словарь", "Энциклопедия");
        reader2.returnBook("Приключения", "Словарь", "Энциклопедия");

        reader3.takeBook(books);
        reader3.returnBook(books);

        printBooks(books);
        printReaders(readers);
    }

    public static void printBooks(Book[] books) {
        System.out.println("Список книг:");
        for (Book book : books)
            System.out.println(book.getInfo());
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println( reader.getInfo());
        }

    }

}
