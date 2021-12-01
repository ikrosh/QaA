package myhw.lesson7;

public class FractionNumbers {
    int a;
    int b;

    public FractionNumbers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int plus (int a, int b) {
        return a + b;
    }

    public int minus (int a, int b) {
        return a - b;
    }

    public int multiply (int a, int b) {
        return a * b;
    }

    public double divide (int a, int b) {
        return (double) a / b;
    }

    public String toString() {
        return "Number a: " + a + " and number b: " + b;
    }

}
