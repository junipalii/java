/*
Theme park ride eligibility

A ride requires:

Height of at least 140cm
Age between 12 and 60
Not pregnant (Y/N)
Must have a valid ticket (Y/N)
ALL conditions must be met.
Print either "Enjoy the ride!" or specifically what disqualifies them
— they could be disqualified by multiple things at once.
That last part is where logical operators get interesting.
 */

import java.util.Scanner;

/*
-ask for requirements
-all requirements must be met to access
-create a boolean that will be the condition in a while loop
-how do i know what disqualified them , maybe a while loop , if else statement
-if else statement would be kinda redundant since the boolean already checks
-maybe a while loop with an if else statement(turns into an infnite loop)
-maybe a case switch but no its basically an if else statement
 */
public class ThemeParkRideEligibility {
    public static void main(String[]args){
    //variable declaration
        Scanner input=new Scanner(System.in);
        int height=0;
        int age=0;
        String pregnant;
        String validTicket;
        int count=0;
    //ask for requirements
            System.out.print("Please enter your height :");
            height=input.nextInt();
            System.out.print("Please enter your age :");
            age=input.nextInt();
            System.out.print("Are you pregnant[Y/N] :");
            pregnant=input.next();
            System.out.print("Do you have a valid ticket[Y/N] :");
            validTicket= input.next();
            boolean checkEligibility=(height>=140&&age>11&&age<60&&pregnant.equals("N")&&validTicket.equals("Y"));

        if(checkEligibility){
            System.out.println("Enjoy the ride ");
        }else{
            while(count<4) {
                System.out.println("You are not eligible for the ride ");
                if (height < 140) {
                    System.out.println("Your height " + height + " is lower than 140cm");
                } else if (age < 11 && age > 60) {
                    System.out.println("Your age " + height + " does not meet age requirements");
                } else if (pregnant.equals("Y")) {
                    System.out.println("Expectant women are not permitted in the heme park");
                } else if (validTicket.equals("N")) {
                    System.out.println("You do not have a valid ticket");
                    count++;
                }
            }
        }
    }
}
