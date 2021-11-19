package myhw.lesson3;

public class MagnitudeMethod {

    public static void main(String[] args) {

//6.Написать программу которая будет сравнивать величину (magnitude) двух чисел.
// Например, если одно число = 3, а второе число = -9, программа должна выдать, что число -9 имеет большую величину.

        getMagnitude(55, 80);
        getMagnitude(490, 12);
    }

    public static void getMagnitude(int x, int y) {
        if (Math.abs(x) > Math.abs(y)) {
            System.out.println("The number x has the greatest magnitude");
        } else if (Math.abs(y) > Math.abs(x)) {
            System.out.println("The number y has the greatest magnitude");
        }
    }
}
