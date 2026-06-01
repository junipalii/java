//Ask the user to enter two sides of a right triangle.
// Calculate and print the hypotenuse.
// You know which Math method fits here.

import java.util.Scanner;

public class Mathex1 {
    public static void main(String[]args){
    //variable declaration
    double c , a , b ;
    //create a scanner object
        Scanner input=new Scanner(System.in);
    //assign variables from user input
        System.out.print("This is a hypotenuse calculator for a right angled triangle\nEnter the first side of the triangle :");
        a=input.nextDouble();
        System.out.print("Enter the second side of the triangle :");
        b=input.nextDouble();
    //perform arithmetic
        c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("The hypotenuse is : " +c);


    }
}
