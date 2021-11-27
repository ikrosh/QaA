package myhw.lesson7;

public class Book {

        public String name;
        public String author;
        public int    year;

        Book(String name, String author, int year){
            this.name   = name;
            this.author = author;
            this.year   = year;
        }

        public boolean author(Object o) {
            return o.equals(author)? true : false;
        }

        @Override
        public String toString(){
            return "Книга " + name + " авторa " + author + " издана в " + year + " году";
        }
}
