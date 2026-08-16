/*
5. Ask the user to enter 5 product names and 5 prices into two separate arrays.
Print a formatted receipt showing each product and its price, then the total at the bottom.
 */

/*
PSEUDO CODE
Declare an array for product names , prices
So i should start off with a scanner object , then take in user input .
use a for loop to get the input needed for both
A system out statement with printf will work for formatting
 */
import java.util.Scanner;
public class ArrayPractice5 {
    public static void main(String[] args){
        //variable declaration
        double total=0;
        String prodNames[]=new String[5];
        Double prodPrices[]=new Double[5];
        //scanner object
        Scanner input=new Scanner(System.in);
        //use a for loop to populate the product names
        for(int i = 0;i< prodNames.length;i++){
            System.out.println("Please enter the product name :");
            prodNames[i]=input.next();

        }
        for(int i = 0;i< prodPrices.length;i++){
            System.out.println("Please enter the product price :");
            prodPrices[i]=input.nextDouble();
        }
        //formatted receipt
        System.out.printf("%14s\n", "STOCK");
        for(int i=0;i< prodNames.length;i++){
            System.out.printf("%-14s%.2f\n",prodNames[i],prodPrices[i]);
            total+=prodPrices[i];
        }
        System.out.printf("%-14s%.2f","Total",total);


    }
}
