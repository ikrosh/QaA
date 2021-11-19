package myhw.lesson3;

import java.util.Scanner;

public class lesson3 {
    public static class Lesson3 {
        public static void main(String[] args) {

    //        1. Is it day or evening? In case time more then 18, show Good evening, otherwise Good day. Try to use IF and Ternary.
    //
    //        Scanner scanner = new Scanner(System.in);
    //        System.out.println("Input time:");
    //        int t = scanner.nextInt();
    //        String answer =  (t > 18 && t < 24 ) ? "Good evening" : "Good day";
    //        System.out.println(answer);
    //
    //-----------------------------------------------------
    //        2. Print name of Weekday according to numbers int. If program gets wrong number, return “Not a valid day”. For example: Enter 1, Print “Monday”
    //
    //        Scanner scanner = new Scanner(System.in);
    //        System.out.println("Enter day :");
    //        int t = scanner.nextInt();
    //        switch (t) {
    //            case 1:
    //                System.out.println("Monday");
    //                break;
    //            case 2:
    //                System.out.println("Thursday");
    //                break;
    //            case 3:
    //                System.out.println("Wednesday");
    //                break;
    //            case 4:
    //                System.out.println("Monday");
    //                break;
    //            case 5:
    //                System.out.println("Friday");
    //                break;
    //            case 6:
    //                System.out.println("Sunday");
    //                break;
    //            case 7:
    //                System.out.println("Sartuday");
    //                break;
    //            default:
    //                System.out.println("Not a valid day");
    //        }
    //
    //----------------------------------------
    //        3. Check length of string, if string more then expected print error
    //
    //        Scanner scanner = new Scanner(System.in);
    //        System.out.println("Enter string :");
    //        String t = scanner.nextLine();
    //        if (t.length() > 5) System.out.println("error");
    //
    //-------------------------------
    //        4. Create program that login you in system. Check password length. Example:
    //        Enter your name: Yuriy (in case wrong login print error)
    //        Enter your password: pass (in case wrong pass print error)

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name");
            String name = scanner.nextLine();
            System.out.println("Enter password");
            String password = scanner.nextLine();

            if (!name.equals("Ira")) System.out.println("error1");
            if (!password.equals("qwerty")) System.out.println("error3");






        }
    }
}
