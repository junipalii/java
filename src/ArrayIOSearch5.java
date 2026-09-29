/*
4. Find All Matches

Ask the user how many numbers they want to enter.

Create an integer array using that size.

Ask the user to enter each number.

Then ask the user which number they want to search for.

Search through the entire array.

For every occurrence:
    Print its index.

At the end:
    Print how many times the number appeared.

If there are no matches:
    Print "Number not found."
*/

/*
PSEUDO CODE
-variables : int size , target , boolean isFound , int [] numbers , int count
-ask user how many numbers they want to enter
-dynamic array sizing from user response
-loop through populating the array
-ask the user what they want to search for
-loop through and search while printing occurrences and updating count
-if found isFound is updated to true and the loop ends
-if not found isFound is left as is and used as a condition in an if statement to print number not found
*/

import java.util.Scanner;

public class ArrayIOSearch5 {
    public static void main(String[]args){
        //variables and Scanner object
        int [] numbers;
        int size;
        boolean isFound=false;
        int target;
        int count=0;
        Scanner input=new Scanner(System.in);
    //ask user how many numbers they want to write and assign to size
        System.out.print("How many numbers would you like to input? :");
        size=input.nextInt();
        numbers=new int[size];
    //prompt user to enter number
        for(int i=0;i<numbers.length;i++) {
            System.out.print("Enter number :");
            numbers[i]=input.nextInt();
        }
        //ask user what number they want to search for
        System.out.println("Enter number to search for :");
        target=input.nextInt();
        //loop through and find occurrences
        for(int i=0;i<numbers.length;i++){
            if(target==numbers[i]){
                System.out.println("Number found at index "+i);
                count+=1;
                isFound=true;
            }
        }
        //if not found print number is not found , if found print count
        if(!isFound){
            System.out.println("Number not found");
        }else{
            System.out.println("Occurrences :"+count);
        }
    }
}
