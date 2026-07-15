/*
3. Ask the user to enter 5 names into an array using a loop and Scanner.
Print them back in reverse order.
 */
import java.util.Arrays;
import java.util.Scanner;
public class ArrayPractice3 {
    public static void main(String[]args){
        //create scanner object
        Scanner input=new Scanner(System.in);
        //create the array to be populated
        String []names=new String[5];
        //prompting the user to enter names
        for(int i =0 ; i< names.length;i++){
            System.out.println("Enter names 5 times :");
            names[i]=input.next();
        }
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
        }

    }

