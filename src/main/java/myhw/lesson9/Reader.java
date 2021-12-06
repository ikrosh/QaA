package myhw.lesson9;

public class Reader {

    private String fio;
    private String readerId;
    private String faculty;
    private String birth;
    private String phone;

    Reader(String fio, String readerId, String faculty, String birth, String phone) {
        this.fio = fio;
        this.readerId = readerId;
        this.faculty = faculty;
        this.birth = birth;
        this.phone = phone;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getReaderId() {
        return readerId;
    }

    public void setReaderId(String readerId) {
        this.readerId = readerId;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void  takeBook(int number) {
        System.out.println(this.fio + " взял " + number + " книги");
    }

    public void  takeBook(String... books) {
        System.out.println(this.fio + " взял: " + String.join(", ", books) + " книги");
    }

    public void  takeBook(Book... books) {
        System.out.println(this.fio + " взял книги:");
        for (Book book : books) {
            System.out.println(book.getName() );
        }
    }

    public void  returnBook(int number) {
        System.out.println(this.fio + " вернул " + number + " книги");
    }

    public void  returnBook(String... books) {
        System.out.println(this.fio + " вернул: " + String.join(", ", books) + " книги");
    }

    public void  returnBook(Book... books) {
        System.out.println(this.fio + " вернул книги:");
        for (Book book : books) {
            System.out.println(book.getName());
        }
    }

    public String getInfo() {
        return  "ФИО " + fio + ", Id " + readerId + ", факультет " + faculty
                + ", дата рождения " + birth + ", телефон " + phone;
    }

}
