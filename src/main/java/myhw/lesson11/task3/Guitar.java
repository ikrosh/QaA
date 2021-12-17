package myhw.lesson11.task3;

public class Guitar implements Instrument {

    int numberStrings;

    Guitar(int numberStrings) {
        this.numberStrings = numberStrings;
    }

    public int getNumberStrings() {
        return numberStrings;
    }

    public void setNumberStrings(int numberStrings) {
        this.numberStrings = numberStrings;
    }

    @Override
    public void play() {
        System.out.println("Plays guitar with " + getNumberStrings() + " strings");
    }
}
