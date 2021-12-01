package myhw.lesson7;

public class BookImpl {

    public static void main(String[] args) {
        Book book1 = new Book("Effective Java","Джошуа Блох", 2001);
        Book book2 = new Book("Вивчаємо Java","Кеті Сьєрра, Берт Бейтс", 2003);
        System.out.println(book1.toString());
        System.out.println(book1.author(book2));
    }

}
