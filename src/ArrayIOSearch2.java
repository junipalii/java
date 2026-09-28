/*
1. Student ID Search

Ask the user how many student IDs they want to enter.

Create an integer array using that number.

Ask the user to enter each student ID.

Then ask the user for a student ID to search for.

Search through the array.

If the ID is found:
    Print "Student ID found!"
    Print the index where it was found.

If it is not found:
    Print "Student ID not found."
*/

/*
PSEUDO CODE

 */

import java.util.Scanner;

public class ArrayIOSearch2 {
    public static void main(String[] args){
            //Scanner object and variables
            Scanner input=new Scanner(System.in);
            int studentID [];
            int targetID ;
            int size;
            boolean isFound=false;
            //ask user the number they want to enter and assign to array size
            System.out.print("Enter the number of student IDs you want :");
            size=input.nextInt();
            studentID=new int[size];
            //ask user to enter 5 studentIDs
            for(int i=0;i<studentID.length;i++){
                System.out.print("Enter ID :");
                studentID[i]= input.nextInt();
            }
            //ask for ID to search for
            System.out.print("Enter ID to search for :");
            targetID= input.nextInt();
            //loop through and search for ID
            for(int i=0;i<studentID.length;i++) {
                if (targetID == studentID[i]) {
                    System.out.println("Student ID found at index :" + i);
                    isFound = true;
                    break;
                }
            }
            //incase ID is not found boolean in loop is not updated
            if(!isFound){
                System.out.println("Student ID not found");
            }
            input.close();
        }

    }




