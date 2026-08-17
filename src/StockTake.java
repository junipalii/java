/*
Stock take console program
Checklist
*Have  list of all the products
*Prompt the user with products one by one for amounts to be added
*Store the data until sales are done and a second stock take is done to dtermine sales
*Allow user to search for a specific poduct
*Maybe group butters and lotions neatly in arrays
 */




import java.util.Scanner;
public class StockTake {
    public static void main(String[]args){
    //A list of all the products available and variables
    String butters[]={"Cherry Berry","Watermelon","Lemongrass","Lavender","Vanilla","Strawberry"};
    int ButtersQty[]=new int[butters.length];
    int totalButters=0;
     String lotions[]={"Cherry","Vanilla","Chocolate","Watermelon","Untamed", "Bare Bliss"};
     int lotionQty[]=new int[lotions.length];
     int totalLotions=0;
    //Scanner object
    Scanner input=new Scanner(System.in);
    //indicate we are starting with butters
        System.out.println("1.Butters");
    for(int i= 0;i< butters.length;i++){
        System.out.println("Enter the quantity for "+butters[i]);
        ButtersQty[i]=input.nextInt();
        //get a total number for butters
        totalButters+=ButtersQty[i];
    }
    //inputting lotions
        for(int i=0;i<lotions.length;i++){
            System.out.println("Enter the quantity for "+lotions[i]);
            lotionQty[i]= input.nextInt();
            totalLotions+=lotionQty[i];
        }

    //printing out butters quantity
        System.out.println("Total Butters :"+totalButters);


    }
}

