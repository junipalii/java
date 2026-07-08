/*
1. Bank Statement
Hardcode 4 transactions (description and amount) and print a formatted bank statement:
================================================
                 BANK STATEMENT
================================================
Description          Amount        Balance
------------------------------------------------
Opening Balance                    $1,000.00
Grocery Shopping     -$45.50       $954.50
Salary               +$500.00      $1,454.50
Electric Bill        -$120.00      $1,334.50
================================================
                    Total: $1,334.50
================================================
Focus on getting the columns to line up cleanly using width and flags.
 */
import java.util.Scanner;
public class BankAccountStatement {
    public static void main(String[] args){
        //hardcoded variables
        double openingBal=1000;
        double grocery=-45.5;
        double salary=500;
        double electricBill=-120;
        double closingBal=1334.5;
        double trasnaction1=openingBal-grocery;
        double trasnaction2=openingBal+salary;
        double trasnaction3=openingBal-electricBill;
        //statement
        System.out.println("================================================");
        System.out.printf("%30s\n" , "BANK STATEMENT");
        System.out.println("================================================");
        System.out.printf("%-21s%-14s%-13s\n","Description" , "Amount" , "Balance");
        System.out.println("------------------------------------------------");
        System.out.printf("%-35s%.2f\n","Opening Balance",openingBal);
        System.out.printf("%-20s%+-14.2f%.2f\n","Grocery Shooping",grocery,trasnaction1);
        System.out.printf("%-20s%+-14.2f%.2f\n","Salary",salary,trasnaction2);
        System.out.printf("%-20s%+-14.2f%.2f\n","Electric Bill",electricBill,trasnaction3);
        System.out.println("================================================");
        System.out.printf("%28s%.2f\n","Total: ",closingBal);
        System.out.println("================================================");


    }
}
