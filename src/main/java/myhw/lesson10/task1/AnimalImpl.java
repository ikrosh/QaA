package myhw.lesson10.task1;

import java.util.ArrayList;
import java.util.List;

public class AnimalImpl {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("bones", "house", "house"));
        animals.add(new Cat("milk", "bed", "mouse"));
        animals.add(new Horse("carrot", "forest", "galop"));

        Veterinar veterinar = new Veterinar();
        for (Animal an : animals) veterinar.treatAnimal(an);

    }

}
