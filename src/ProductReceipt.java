/*
Product Receipt
Ask the user for:

Product name
Price per unit
Quantity purchased
Whether they have a discount code (Y/N) — if yes, 15% off

Print a receipt like:
================================
           RECEIPT
================================
Product   : Wireless Mouse
Quantity  : 3
Unit Price: $29.99
Subtotal  : $89.97
Discount  : 15.00%
Total     : $76.47
================================
If no discount code, skip the discount line and just print the total.
This is the same alignment concept but now you're doing more arithmetic and deciding what to print based on a condition.
Go.
 */

import java.util.Scanner;
public class ProductReceipt {
    public static void main(String[] args){
    //create a scanner object
    Scanner input=new Scanner(System.in);
    //varaible declaration
    String name;
    int quantity;
    double ppUnit;
    String discountCode;
    double finalPrice;
    double discount=0;
    //user input
        System.out.println("Please enter the product name : ");
        name=input.nextLine();
        System.out.println("Please enter the price per unit : ");
        ppUnit=input.nextDouble();
        System.out.println("Please enter the quantity purchased : ");
        quantity=input.nextInt();
        System.out.println("Do you have a discount code(Y/n) : ");
        discountCode=input.next();
        //variables
        double price=ppUnit*quantity;
        finalPrice=price;
        //product name validation
        if(name.isEmpty()){
            System.out.println("Please enter a valid product name :");
            return;
        }

        //price validation , validates quantity and price per unit -ppUnit
        if(price<0||price==0){
            System.out.println("Price cannot be zero or negative , enter a price above 1");
            return;
        }
       //discount code validation
       if(discountCode.equals("Y")){
           System.out.println("You get a 15% discount");
           discount=price*0.15;
           finalPrice=price-discount;

       } else{
           price*=1;
       }
       //receipt formatting
        System.out.println("================================");
        System.out.printf("%18s\n","RECEIPT");
        System.out.println("================================");
        System.out.printf("%-10s: %s\n","Product",name);
        System.out.printf("%-10s: $%d\n","Quantity",quantity);
        System.out.printf("%-10s: $%.2f\n","SubTotal",price);
        System.out.printf("%-10s: $%.2f\n","Discount",discount);
        System.out.printf("%-10s: $%.2f\n","Total",finalPrice);

    }
}
