/*

1. Search for a number

Ask the user to enter 5 integers into an array.

Then ask the user for a number to search for.

Search through the array and determine whether the number exists.

If it exists, print:
"Number found!"

If it does not exist, print:
"Number not found."

Also print the position (index) where the number was found.
*/

/*
PSEUDO CODE
-needs a scanner class for Input
-ask user for 5 numbers . Use a for loop
-ask for number to be searched and use a for loop with an if statement to search
-create a boolean isFound set to false in declaration but updates to true within the loop after number is found
-outside the loop set it to false incase no is not found
-have an if statement with (!isFound) as condition and output number not found
 */


import java.util.Scanner;

public class ArrayIOSearch1 {
    public static void main(String[] args){
    //Scanner object and variables
    Scanner input=new Scanner(System.in);
    int numbers []=new int[5] ;
    int target ;
    boolean isFound=false;
    //tell user they are entering five numbers into an array
        System.out.println("Enter 5 numbers into an array");
    //ask user to enter 5 integers
        for(int i=0;i<numbers.length;i++){
            System.out.println("Enter number :");
            numbers[i]= input.nextInt();
        }
    //ask for number to search for
        System.out.print("Enter number to search for :");
        target= input.nextInt();
    //loop through and search for number
        for(int i=0;i<numbers.length;i++) {
            if (target == numbers[i]) {
                System.out.println("Number found at index :" + i);
                isFound = true;
                break;
            }
        }
    //incase number is not found boolean in loop is not updated
        if(!isFound){
            System.out.println("Number not found");
        }
        input.close();
        }

    }

