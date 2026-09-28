/*
2. Number Frequency

Ask the user how many numbers they want to enter.

Create an integer array of that size.

Ask the user to enter the numbers.

Then ask the user which number they want to search for.

Search through the entire array and count how many times
the number appears.

Print the number of occurrences.

If it doesn't appear, print:
"Number not found."
*/

/*
PSEUDO CODE
-ask user how many nos they want to enter
-dynamically size the array from this
=create a boolean isFound initialized to false
-allow input into an integer array
-search through using a for loop with an if
-use count+=1 to count occurences
-update initialized to true and break the loop
-outside loop isFound is initialized to False incase target is not found
-if statement with initialized as parameter and body prints out target not found
 */

import java.util.Scanner;

public class ArrayIOSearch3 {
    public static void main(String[] args) {
        //variables and Scanner objects
        int target;
        int numbers[];
        int count = 0;
        int size;
        boolean isFound = false;
        Scanner input = new Scanner(System.in);
        //ask user how many numbers they want to enter and assign size to numbers[]
        System.out.print("How many numbers do you want enter :");
        size = input.nextInt();
        numbers = new int[size];
        //loop through adding numbers into the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number :");
            numbers[i] = input.nextInt();
        }
        //ask user what number they want to search for
        System.out.print("What number do you want to search :");
        target = input.nextInt();
        //Loop through and count occurencess
        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                System.out.println("Number found at index :" + i);
                isFound = true;
                count += 1;
            }
        }
        //if number not found boolean isFound=false
        if (!isFound) {
            System.out.println("Number is not found :");
        }else{
            System.out.println("Occurrences :"+count);

        }
    }
}
