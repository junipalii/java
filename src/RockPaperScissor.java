/*
***PSEUDO CODE***
-create a method rock,paper,scissor
-print out rock paper scissor to the user
-tell them to take a pick
-get their input and present a randomly generated value
-tell them whether they are correct or not
-ask if the user wants to play again , if yes redo the game
-maybe randomly generate a number between 0 and 2 , assign 0 to rock ,1 to scissor , 2 to paper
-use .equalsIgnoreCase to compare the random value and user input
*/

import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {
    public static void main(String[]args){
     rockPaperScissors();
    }
    public static void rockPaperScissors(){
        //variable declaration
        String tryAgain;
        Scanner input=new Scanner(System.in);
        Random random=new Random();
        String userGuess;
        boolean isContinue=false;
        while(!isContinue){
            System.out.print("ROCK"+"\t"+"PAPER"+"\t"+"SCISSOR"+"\n"+"Take a guess:");
            userGuess=input.nextLine();
            int computerGuess=random.nextInt(0,3);
            switch (computerGuess){
                case 0 -> System.out.println("Computer guess :ROCK");
                case 1 -> System.out.println("Computer guess :PAPER");
                case 2 -> System.out.println("Computer guess :SCISSOR");
            }
            if(userGuess.equalsIgnoreCase("rock")&&computerGuess==2){
                System.out.println("YOU WIN !");
            }else if (userGuess.equalsIgnoreCase("paper")&&computerGuess==0){
                System.out.println("YOU WIN !");
            }else if(userGuess.equalsIgnoreCase("scissor")&&computerGuess==1){
                System.out.println("YOU WIN !");
            }else if(userGuess.equalsIgnoreCase("scissor")&&computerGuess==2||userGuess.equalsIgnoreCase("paper")&&computerGuess==1||userGuess.equalsIgnoreCase("rock")&&computerGuess==0){
                System.out.println("TIE !");
            }else {
                System.out.println("YOU LOSE !");
            }
            System.out.println("WOULD YOU LIKE TO TRY AGAIN [Y/n]:");
                tryAgain=input.next();
                input.nextLine();
                if(tryAgain.equalsIgnoreCase("n")){
                    isContinue=true;
                }
            }

        }

    }

