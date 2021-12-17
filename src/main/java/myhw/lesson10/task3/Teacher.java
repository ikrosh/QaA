package myhw.lesson10.task3;

public class Teacher extends Profession{

    Teacher(String name, String industry) {
        super(name, industry);
    }

    @Override
    public void work() {
        System.out.println("Teacher teaches children");
    }

    @Override
    public void rest() {
        System.out.println("Teacher meditates");
    }
}
