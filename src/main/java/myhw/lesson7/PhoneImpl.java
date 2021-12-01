package myhw.lesson7;

public class PhoneImpl {

    public static void main(String[] args) {

        PhoneNumber phone = new PhoneNumber();
        phone.setCountryCode("380");
        phone.setNumber("441113322");
        System.out.println(phone.toString());
    }
}
