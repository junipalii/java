/*
2. Receipt generator
Write a method calculateTotal(double price, int quantity, double discountPercent)
that returns the final price after discount.
Call it from main for at least 3 different products and print a formatted receipt with each item and the grand total.
 */

import java.util.Scanner;

/*
PSEUDO CODE
***In Main***
initialize three items with different prices
Have a set discount percent
quantity can be different or similar
Call the method and add price , discount percent and quantity as arguments
Printing a formatted receipt use printf
***method***
returns final price after discount
should take discountPercent , quantity and price
first take discountPercent on a single item and multiply it by quantity
finally return final price
 */
public class ReceiptGenerator {
    public static void main(String[] args){
        //create a scanner object
        Scanner input=new Scanner(System.in);
        //variable declaration
        double price1 , price2 , price3 ;
        double discountPercent=0.15;
        int Juice=2200;
        int Fries=1100;
        int Burger=3500;
        price1=calculatePrice(Fries,2,discountPercent);
        price2=calculatePrice(Burger,1,discountPercent);
        price3=calculatePrice(Juice,3,discountPercent);
        double total=price1+price2+price3;
        //calling the method while printing the receipt
        System.out.printf("%14s\n","RECEIPT");
        System.out.printf("Product%14s\n","Price");
        System.out.printf("%s%17.2f\n","Fries",price1);
        System.out.printf("%s%16.2f\n","Burger",price2);
        System.out.printf("%s%17.2f\n\n","Juice",price3);
        System.out.printf("%s%17.2f\n\n","Total",total);


    }
    static double calculatePrice(int price,int quantity , double discount){
        return price * (1-discount) * quantity;
    }
}
