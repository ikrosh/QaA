package myhw.lesson10.task3;

public class Pilot extends Profession{

    Pilot(String name, String industry) {
        super(name, industry);
    }

    @Override
    public void work() {
        System.out.println("Pilot controls jets");
    }

    @Override
    public void rest() {
        System.out.println("Pilot visits countries");
    }
}
