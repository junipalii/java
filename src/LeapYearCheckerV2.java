/*
1. Leap year checker v2
You built this before with if statements.
Rebuild it using a single boolean expression with logical operators assigned to a variable,
then print the result using a ternary. No if statements allowed.
*/
import java.util.Scanner;

public class LeapYearCheckerV2 {
    public static void main(String[] args){
    //create a scanner object for input , declare a variable to check input
        int year;
        Scanner input=new Scanner(System.in);
    //ask user for year input
        System.out.println("Leap Year Checker");
        System.out.print("Please enter the year in numbers to be checked :");
        year=input.nextInt();
        boolean leapYearCheck= (year%4==0 && year%100!=0) || (year%400==0);
        String leapTernary;
    //logic to check for the leap year
        leapTernary=(leapYearCheck) ? year+" is a leap year" : year+" is not a leap year ";
        System.out.println(leapTernary);

    }
}
