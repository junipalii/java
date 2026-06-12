/*
**Bank Account Simulator**

Ask the user for their starting balance. Then show them a menu:
```
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
```
Use a while loop to keep the menu running until they choose 4. For withdrawals, don't let the balance go below zero. Print the updated balance after every transaction.

This touches everything — while loops, switch or if statements, scanner input, arithmetic, and basic validation. Don't overthink it, just start writing and see where you get stuck. That'll tell you more than any review will.
 */

import java.util.Scanner;

public class BankAccountSimulator {
    public static void main(String[]args){
        //variable declaration
        int statBalance=0;
        int menuChoice=0;
        double deposit;
        double withdrawal;
        double currentBalance=0;
        boolean isOnline=true;

        //scanner object
        Scanner input=new Scanner(System.in);

        //ask for starting balance
        System.out.println("Please input your starting balance :");
        statBalance=input.nextInt();

        //updating balance
        currentBalance+=statBalance;

        //menu
       while(menuChoice<4){
            System.out.printf("%6s\n","Menu");
           System.out.printf("1.%-13s\n" , "Deposit");
           System.out.printf("2.%-13s\n" , "Withdraw");
           System.out.printf("3.%-13s\n" , "Check Balance");
           System.out.printf("4.%-13s\n" , "Exit");

           switch(menuChoice){
               case 1:
                   System.out.println("Enter deposit amount :");
                   deposit=input.nextDouble();break;
               case 2:
                   System.out.println("Enter the amount you want to withdraw :");
                   withdrawal=input.nextDouble();
                   if(withdrawal>=currentBalance&&withdrawal-currentBalance>0){
                       System.out.println("Withdrawal successful :");
                       currentBalance-=withdrawal;
                       System.out.println("Balance :"+currentBalance);
                   }else{
                       System.out.println("Insufficient amount for the transaction :");

                   }
                   break;
               case 3:
                   System.out.println("Balance :"+currentBalance);
                   break;
               case 4:isOnline=false;break;

           }
           currentBalance+=statBalance;

       }



    }
}
