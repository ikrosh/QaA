package myhw.lesson7;

public class App {

    public static void main(String[] args) {

        FractionNumbers fn = new FractionNumbers(2, 6);
        System.out.println(fn.toString());
        System.out.println(fn.plus(5,7));
        System.out.println(fn.minus(5,7));
        System.out.println(fn.multiply(5,7));
        System.out.println(fn.divide(5,7));
    }

}
