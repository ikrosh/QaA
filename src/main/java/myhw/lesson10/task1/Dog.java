package myhw.lesson10.task1;

public class Dog extends Animal {

    public String save;

    public Dog(String food, String location, String save) {
        super(food, location);
        this.save = save;
    }

    public void makeNoise(){
        System.out.println("Dog says Gav");
    }

    public void eat(){
        System.out.println("Dog eats meat");
    }
}
