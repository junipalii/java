/*
A program that simulates a countdown using a for loop
 */
import java.util.Scanner;
public class Countdown {
    public static void main(String[] args){
        //variable declaration
        int count;
        //Scanner object
        Scanner input=new Scanner(System.in);
        //ask user to input where they want the countdown to start from
        System.out.println("Enter the time in seconds youd want th countdown to start from :");
        count=input.nextInt();
        //for loop that simulates the countdown
        for(int i=count;i>0;i--){
            System.out.println(i);
        }
        System.out.println("HAPPY NEW YEAR");
    }

}
