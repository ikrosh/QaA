package myhw.lesson10.task1;

public class Cat extends Animal {

    public String hunt;

    public Cat(String food, String location, String hunt) {
        super(food, location);
        this.hunt = hunt;
    }

    public void makeNoise(){
        System.out.println("Cat says May");
    }

    public void eat(){
        System.out.println("Cat drinks milk");
    }
}
