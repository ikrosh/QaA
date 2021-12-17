package myhw.lesson10.task3;

public abstract class Profession {

    private String name;
    private String industry;

    Profession(String name, String industry) {
        this.name = name;
        this.industry = industry;
    }

    public abstract void work();

    public abstract void rest();

    public String getName() {
        return name;
    }

    public String getIndustry() {
        return industry;
    }
}
