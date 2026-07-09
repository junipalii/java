/*
A program that asks a user to input an integer value of how many times they want to loop ,
and uses a for loop to loop to that number of times
 */
import java.util.Scanner;
public class ForLoop {
    public static void main(String[]args){
        //vour looping variable
        int max;
        int count=0;
        //Scanner object
        Scanner input=new Scanner(System.in);
        //create a user prompt
        System.out.print("Enter the amount of times you want to loop :");
        max=input.nextInt();
        //for loop
        for(int i=1;i<=max;i++){
            System.out.println(i);
            count++;

        }
        System.out.println("The looped iterated :"+count+" times");

    }
}
