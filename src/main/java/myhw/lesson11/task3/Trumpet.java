package myhw.lesson11.task3;

public class Trumpet implements Instrument {

    int diameter;

    Trumpet(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Plays trumpet with diameter " + getDiameter() + " mm");
    }
}
