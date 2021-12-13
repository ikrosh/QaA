package myhw.lesson10.task1;

public class Horse extends Animal {
    public String ride;

    public Horse(String food, String location, String ride) {
        super(food, location);
        this.ride = ride;
    }

    public void makeNoise(){
        System.out.println("Horse says Igogo");
    }

    public void eat(){
        System.out.println("Horse eats grass");
    }
}
