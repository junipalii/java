/*
3. Number guessing game
Generate a random number between 1 and 10.
Ask the user to guess it.
Tell them if they're too high, too low, or correct.
Use a while loop to keep letting them guess until they get it right,
then print how many attempts it took.
 */
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[]args){
        //variable declaration
        int actualNumber;
        int attempt=0 ;
        int sum=0;

        //random object and scanner object
        Random random=new Random();
        Scanner input=new Scanner(System.in);
        //assign random number to actualNumber
        actualNumber=random.nextInt(1,11);

        //while loop
        while(attempt!=actualNumber){
       //ask for user input
            System.out.print("Guess a number between 1 and 10 :");
            attempt=input.nextInt();
            //close I/O stream
            input.close();
            if(attempt>10||attempt<1){
                System.out.println("Please guess a number between 1 and 10");
            }else if(attempt<actualNumber){
                System.out.println("Too low");
            }else if(attempt>actualNumber){
                System.out.println("Too high");
            }else if(attempt==actualNumber){
                System.out.println("Correct :"+actualNumber);
            }

            sum++;

        }
        System.out.println("Total attempts : "+sum);
    }
}
