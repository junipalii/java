/*
A cinema charges different prices based on age and membership status:

Under 12: $5
12 to 17: $8
18 to 64: $12
65 and above: $6

Members get a 20% discount on any of those prices.
Ask the user for their age and whether they have a membership (Y/N).
Print the final ticket price.
Validate that age is a positive number.

 */
import java.util.Scanner;

public class CinemaTicketPricing {
    public static void main(String []args) {
        //variable declaration
        double u12 = 5;
        double teen = 8;
        double adult = 12;
        double senior = 6;
        int age;
        String membership;

        //scanner object
        Scanner input = new Scanner(System.in);
        //ask users for their age and membership status
        System.out.println("How old are you :");
        age = input.nextInt();
        System.out.println("Do you have a membership ?[Y/n]");
        membership = input.next();
        //nested if
        if (age < 0 || age > 120) {
            System.out.println("Invalid age");
        }else if (age <= 12) {
            if (membership.equals("Y")) {
                u12 *= 0.8;
                System.out.printf("You get a 20 membership discount\nprice :$%.2f", u12);
            } else {
                u12 *= 1;
                System.out.printf("price :$%.2f", u12);
            }
        } else if (age <= 17) {
            if (membership.equals("Y")) {
                teen *= 0.8;
                System.out.printf("You get a 20 membership discount\nprice :$%.2f", teen);
            } else {
                teen *= 1;
                System.out.printf("price :$%.2f", teen);
            }
        } else if (age <= 64) {
            if (membership.equals("Y")) {
                adult *= 0.8;
                System.out.printf("You get a 20 membership discount\nprice :$%.2f", adult);
            } else {
                adult *= 1;
                System.out.printf("price :$%.2f", adult);
            }
        }else{
            if (membership.equals("Y")) {
                senior *= 0.8;
                System.out.printf("You get a 20 membership discount\nprice :$%.2f", senior);
            } else {
                senior *= 1;
                System.out.printf("price :$%.2f", senior);
            }
        }
    }

}