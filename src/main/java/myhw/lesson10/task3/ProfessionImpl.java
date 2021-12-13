package myhw.lesson10.task3;

public class ProfessionImpl {

    public static void main(String[] args) {

        Pilot pilot = new Pilot("Pilot", "Air freight");
        pilot.work();
        pilot.rest();

        Teacher  teacher = new Teacher("Teacher", "English");
        teacher.work();
        teacher.rest();

        Developer developer = new Developer("Developer", "Java");
        developer.work();
        developer.rest();
        developer.create();

    }
}
