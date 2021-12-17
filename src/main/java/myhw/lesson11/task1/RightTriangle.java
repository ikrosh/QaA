package myhw.lesson11.task1;

public class RightTriangle implements Figure{

    private int sideA;
    private int sideB;

    public RightTriangle(int sideA, int sideB) {
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
        System.out.println("Square Right Triangle = " + getSideA() * getSideB() / 2);
    }

    @Override
    public void perimeter() {
        double katetKv = Math.pow(getSideA(), 2) + Math.pow(getSideB(), 2);
        System.out.println("Perimeter Rectangle = " +
                (getSideA() + getSideB() + Math.sqrt(katetKv)));
    }
}
