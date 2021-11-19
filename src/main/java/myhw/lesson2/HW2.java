package myhw.lesson2;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {

//        1. Write a Java program that reads a number in inches, converts it to meters.
//                Note: One inch is 0.0254 meter.
//                Test Data
//        Input a value for inch: 1000
//        Expected Output :
//        1000.0 inch is 25.4 meters

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number in inches:");
//        double number = scanner.nextInt();
//        double met = number * 0.0254;
//        System.out.println(number + " inch is " + met + " meters");
//
//--------------------------------
//
//        2. Write a Java program to convert minutes into a number of years and days.
//        Test Data
//        Input the number of minutes: 3456789
//        Expected Output :
//        3456789 minutes is approximately 6 years and 210 days
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input the number of minutes:");
//        int minutes = scanner.nextInt();
//        int years = minutes / (365 * 24 * 60);
//        int days = (minutes - years * 525600) / (24 * 60);
//        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
//
//--------------------------------
//
//        3. Write a Java program to compute body mass index (BMI).
//                Test Data
//        Input weight in pounds: 452
//        Input height in inches: 72
//        Expected Output:
//        Body Mass Index is 61.30159143458721
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input weight in pounds:");
//        int weight = scanner.nextInt();
//        System.out.println("Input height in inches:");
//        int height = scanner.nextInt();
//        double bmi = (weight * 0.45359237) / Math.pow(height *  0.0254, 2);
//        System.out.println("Body Mass Index is " + bmi);
//
//--------------------------------
//
//        4. Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour
//
//        Test Data
//        Input distance in meters: 2500
//        Input hour: 5
//        Input minutes: 56
//        Input seconds: 23
//        Expected Output :
//        Your speed in meters/second is 0.11691531
//        Your speed in km/h is 0.42089513
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input distance in meters:");
//        int distance = scanner.nextInt();
//        System.out.println("Input hour:");
//        int hour = scanner.nextInt();
//        System.out.println("Input minutes:");
//        int minutes = scanner.nextInt();
//        System.out.println("Input seconds:");
//        int seconds = scanner.nextInt();
//
//        int distance = 2500;
//        int hour = 5;
//        int minutes = 56;
//        int seconds = 23;
//
//        double v1 = (double) distance / (seconds + (minutes * 60) + (hour * 3600));
//        System.out.println("Your speed in meters/second is " + String.format("%.8f", v1));
//
//        double v2 = (distance * 0.001) / (hour + ((double) seconds * 1 / 3600) + ((double) minutes * 1 / 60));
//        System.out.println("Your speed in km/h is " + String.format("%.8f", v2));
//
//--------------------------------
//
//        5. Write a Java program to generate random integers in a specific range.(Hint: Use Math class)
//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input minimum of range:");
        int min = scanner.nextInt();
        System.out.println("Input maximum of range:");
        int max = scanner.nextInt();
        int delta = max - min;
        int r = (int) (Math.random() * ++delta) + min;
        System.out.println("Random integer in a specific range (" +  min +  ", " + max + ") is: "+ r);

    }
}
