package myhw.lesson11.task1;

public class Rectangle implements Figure{

    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public void square() {
        System.out.println("Square Rectangle = " + getSideA() * getSideB());
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter Rectangle = " + (getSideA() + getSideB()) * 2);
    }
}
