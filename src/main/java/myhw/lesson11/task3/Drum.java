package myhw.lesson11.task3;

public class Drum implements Instrument {

    String size;

    Drum(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Plays drum with size " + getSize());
    }
}
