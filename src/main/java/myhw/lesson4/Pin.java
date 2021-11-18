package myhw.lesson4;

import java.util.Scanner;

public class Pin {

    public static void main(String[] args) {

// You have to design the code such that the user has only three tries to guess the correct pin of the account.
// You set the pin as a constant with a final attribute. When correct display “Correct, welcome back.”
// When incorrect display “Incorrect, try again.”. When ran out of tries display “Sorry but you have been locked out.”

        final int pin = 1111;
        int i = 1;
        int n = 3;
        int input = 0;

        while (i <= n && input != pin )  {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter pin");
            input = scanner.nextInt();

            if (input == pin) {
                System.out.println("Correct, welcome back.");
                i = 0;
            }
            else if (input != pin && i == n){
                System.out.println("Sorry but you have been locked out.");
                i++;
            }
            else if (input != pin && i < n){
                System.out.println("Incorrect, try again.");
                i++;
            }

        }

    }
}
