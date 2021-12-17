package myhw.lesson10.task3;

public class Developer extends Profession {

    Developer(String name, String industry) {
        super(name, industry);
    }

    @Override
    public void work() {
        System.out.println("Developer writes code");
    }

    @Override
    public void rest() {
        System.out.println("Developer reads a lot");
    }

    public void create() {
        System.out.println("Developer creates programmes");
    }

}
