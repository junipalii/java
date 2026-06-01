/*
2. Circle calculator
Ask the user for a radius.
Print the area and circumference.
Round both results to 2 decimal places — look into Math.round or Math.pow for this one, think about how you'd approach rounding to a specific decimal place.
 */
import java.util.Scanner;

public class Mathex2 {
    public static void main(String[]args){
    //variable declaration
    double radius;
    double circumference;
    double area;
    //create a scanner object
        Scanner input=new Scanner(System.in);
    //Ask for user input
        System.out.println("Please enter the radius to calculate the circles circumference and area :");
        radius=input.nextDouble();
    //validate input
    if(radius!=0||radius>0){
        circumference=2*Math.PI*radius;
        area=Math.PI*Math.pow(radius,2);
        System.out.print("The area is : ");
        System.out.format("%.2f",area);
        System.out.println("\n");
        System.out.print("The circumference is :");
        System.out.format("%.2f",circumference);

    }  else{
        System.out.println("Please enter a value above 0");
    }
    }
}
