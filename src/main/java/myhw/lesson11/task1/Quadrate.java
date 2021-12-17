package myhw.lesson11.task1;

public class Quadrate implements Figure{

    private int side;

    public Quadrate(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void square() {
        System.out.println("Square Quadrate = " + Math.pow(getSide(), 2));
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter Quadrate = " + getSide() * 4);
    }
}
