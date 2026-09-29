/*

3. Find the Largest Number

Ask the user how many numbers they want to enter.

Create an integer array using that size.

Ask the user to enter the numbers.

Search through the array and determine the largest number.

Print:
"The largest number is: X"
*/

/*
PSEUDO CODE
-set largest number to be numbers[0]
-loop through comparing and update largest number when need be
-print it out

*/

import java.util.Scanner;

public class ArrayIOSearch4 {
    public static void main(String[] args){
        //variables and scanner object
        Scanner input=new Scanner(System.in);
        int numbers[];
        int size;
        int largestNo;
        //ask user how many numbers they want to enter and assign to numbers size
        System.out.println("How many numbers do you want to enter :" );
        size=input.nextInt();
        numbers=new int[size];
        //loop through populating the array
        for(int i=0;i<numbers.length;i++){
            System.out.print("Enter number :");
            numbers[i]=input.nextInt();
        }
        //initiate the first index as the largest
        largestNo=numbers[0];
        //search through the array and determine the largest number
        for(int i=0;i<numbers.length;i++){
           if(largestNo<numbers[i]){
             largestNo=numbers[i];
           }
        }
        System.out.println("The largest number is :"+largestNo);
    }
}
