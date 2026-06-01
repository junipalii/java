/*
3. Compound interest calculator
Ask the user for a principal amount, annual interest rate, and number of years.
Calculate and print the final amount using the compound interest formula A = P(1 + r)^t.
You'll need Math.pow for this one.
 */
import java.util.Scanner;

public class Mathex3 {
    public static void main(String[]args){
    //variable declaration
    double principal;
    double rate;
    double years;
    double newAmount;
    //create a Scanner object
    Scanner input=new Scanner(System.in);
    //ask user to input details and assign variables
        System.out.print("Enter the principal amount :");
        principal=input.nextDouble();
        System.out.print("Enter the annual interest rate :");
        rate=input.nextDouble();
        System.out.print("Enter the number of years :");
        years=input.nextDouble();
    //validate input and calculate the new amount
    if(principal>0&&rate>0&&years>0){
        newAmount=Math.pow(1+(rate/100),years)*principal;
        System.out.printf("final amount :%.2f",newAmount);
    }else{
        System.out.println("One of the fields is empty , please try again");
    }

    }
}
