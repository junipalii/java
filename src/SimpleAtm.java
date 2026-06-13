/*
Simple ATM
Build on what you just did but this time:

Ask for a 4 digit PIN at the start (just store it as a variable).
If the user enters the wrong PIN, deny access and exit.
If correct, proceed to the menu.
Add a transaction history — every deposit and withdrawal gets recorded and when the user picks "Check Balance" it shows the balance AND lists all transactions made that session.

For the transaction history, you haven't learned arrays or lists yet so just use a String that you keep appending to each transaction like:
javaString history = "";
history += "Deposited: $" + deposit + "\n";
Then print it when they check balance. Go.

 */
import java.util.Scanner;

public class SimpleAtm {
    public static void main(String[]args){
    //variable declaration
        int pin=1629;
        int pinCopy;
        boolean isOnline=true;
        int menuchoice;
        double statBalance=0;
        double currentbalance=0;
        double deposit;
        double withdrawal;

        //scanner object
        Scanner input=new Scanner(System.in);
        //asking for pin
        System.out.println("Please enter your 4 digit pin :");
        pinCopy=input.nextInt();
        if(pinCopy==1629) {
            while (isOnline) {
                System.out.println("Olease enter your starting Balance");
                statBalance = input.nextDouble();

                System.out.printf("%s10", "Menu");
                System.out.printf("1.%s-13", "Deposit");
                System.out.printf("2.%s-13", "Withdraw");
                System.out.printf("3.%s-13", "Check Balance");
                System.out.printf("4.%s-13", "Exit");

                menuchoice = input.nextInt();
                switch (menuchoice) {
                    case 1:
                        System.out.println("Please enter the amount you wish to deposit : ");
                        deposit = input.nextInt();
                        if (deposit < 0) {
                            System.out.println("Please enter an amount greater than zero :");
                        } else {
                            currentbalance += deposit;
                            System.out.println("New Balance :" + currentbalance);
                        }
                        break;
                    case 2:
                        System.out.println("Please enter the amount you wish to withdraw :");
                        withdrawal = input.nextDouble();
                        if (withdrawal <= currentbalance) {
                            System.out.println("Withdrawal successful ");
                            currentbalance -= withdrawal;
                            System.out.println("New Balance :" + currentbalance);
                        } else {
                            System.out.println("Insufficient funds to complete the transaction :");
                        }
                        break;
                    case 3:
                        currentbalance += statBalance;
                        System.out.println("Current Balance :" + currentbalance);
                        break;
                    case 4:
                        isOnline = false;
                        break;
                }
            }
        }else{
            System.out.println("Incorrect pin please try again ");
            return;
        }

    }
}
