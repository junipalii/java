import java.util.Random;
/*
2. Dice roller
Simulate rolling two six-sided dice using random numbers.
Print both values and the sum.
If the sum is 7 or 11 print "You win",
if it's 2, 3 or 12 print "You lose",
anything else print "Roll again."
 */

public class DiceRoller {
    public static void main(String[]args){
        //vraiable declaration
        int dice1 , dice2 , sum ;
        //creating random object and generating values
        Random random=new Random();
        dice1=random.nextInt(1,7);
        dice2=random.nextInt(1,7);
        //print both values and the sum
        sum=dice1+dice2;
        System.out.println("First dice :"+dice1);
        System.out.println("Second dice :"+dice2);
        System.out.println("Sum of both dices faces :"+sum);
        //You win , lose , roll again
        if(sum==7||sum==11){
            System.out.println("You win");
        }else if(sum==2||sum==3||sum==12){
            System.out.println("You lose");
        }else{
            System.out.println("Roll again");
        }

    }
}
