/*
2. Leap year checker
Ask the user to enter a year.
Determine if it's a leap year and print the result.
A year is a leap year if it's divisible by 4, but not by 100, unless it's also divisible by 400.
That last rule is where the if statement logic gets interesting.
 */

import java.util.Scanner;
import java.io.*;

public class LeapYearChecker {
    public static void main(String[]args){
    //create a scanner object
        Scanner input=new Scanner(System.in);
        //ask user to enter the year
        System.out.println("Enter a year to check whether it is a leap year");
        int year=input.nextInt();
        //check whether it is a leap year
        if(year%4==0&&year%100!=0){
                System.out.println("The"+ " "+year+"is a leap year");
            }else if(year%100==0&&year%400==0){
            System.out.println("The"+ " "+year+"is a leap year");
        }else{
            System.out.println("The"+ " "+year+"is not a leap year");
        }
        }
    }
