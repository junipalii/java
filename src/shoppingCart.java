import java.util.Scanner;
import java.io.*;
public class shoppingCart {
    public static void main(String[] args) {
        //variable declaration
        final double Fish=8 , Pizza=10 , Wings=15 , Milkshake=3 , Fries=10;
        int quantity=0;
        int order ;
        double price=0 ;
        boolean ordering =true ;
        String continueOrdering;
        double total=0;

        //create a scanner object
        Scanner input=new Scanner(System.in);

        //while loop controlling the cart
        while(ordering){
            //print menu and ask for order
            System.out.println("Welcome to the dinner\n1.Fish=8\n2.Pizza=10\n3.Wings=15\n4.Milkshake=3\n5.Fries=10\nWhat would you like to order?");
            order=input.nextInt();
            //validate order
            if(order<1|order>5){
                System.out.println("Please choose an item 1-5 :");
                return;
            }
            //get quantity
            System.out.println("What quantity would you like?");
            quantity=input.nextInt();
            //calculate price
            switch(order){
                case 1:price=Fish*quantity;break;
                case 2:price=Pizza*quantity;break;
                case 3:price=Wings*quantity;break;
                case 4:price=Milkshake*quantity;break;
                case 5:price=Fries*quantity;break;

            }
            //add price to total
            total+=price;
            //ask if they would like to continue ordering
            System.out.println("Would you like to continue ordering ?[Y/n]");
            continueOrdering=input.next();
            if(continueOrdering.equals("n")){
                ordering=false;
                System.out.println("Total is :$"+total);

            }

        }

    }

}

