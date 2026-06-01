/*
1. Coin flip
Simulate a coin flip using a random boolean.
Print "Heads" or "Tails".
Then ask the user to guess before the flip and tell them if they were right or wrong.
 */

import java.util.Random;
import java.util.Scanner;

public class CoinFlipSimulation {
    public static void main(String[]args){
        //variable declaration
        boolean isHeads;
        String userGuess;
        //create random and scanner object
        Scanner input=new Scanner(System.in);
        Random random=new Random();

        //Geenerate random boolean
        isHeads=random.nextBoolean();

        //ask user to guess heads or tails
        System.out.println(" Heads or Tails :");
        userGuess=input.nextLine();

        //print out whether it is heads or tails for verification
        System.out.println(isHeads ? "Heads":"Tails");

     if(isHeads && userGuess.equalsIgnoreCase("Heads")||!isHeads && userGuess.equalsIgnoreCase("Tails")){
         System.out.println("Correct");
     }else{
         System.out.println("Wrong");
     }

    }
}
