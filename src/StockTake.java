
        /*
        Stock take console program
        Checklist
        *Have  list of all the products
        *Prompt the user with products one by one for amounts to be added
            for lotions and butters use separate for loops
            for the rest of the products use a single for loop and have the rest of the products in a single array
            maybe classify them as haircare , skincare and face care ?
            ill assume all face oils are similar
        *Store the data until sales are done and a second stock take is done to dtermine sales
        *Allow user to search for a specific poduct
        *Maybe group butters and lotions neatly in arrays
        *Have a further breakdown on butters , what amount for each we have .Maybe have it as a method?^^
         */




        import java.util.Scanner;
public class StockTake {
    public static void main(String[]args){
        //A list of all the products available and variables
        String hairCare[]={"Hair Oil","Yellow Castor oil","Hair Butter","Shampoo","Avocado oil"};
        int hairCareQty[]=new int[hairCare.length];
        String faceCare[]={"Hyaluronic Acid","Niacinamide","Face Oils","Jojoba Oil","Rose Water","Toner","Soap","Lip Scrub","Lip Balm","Beard Oil"};
        int faceCareQty[]=new int[faceCare.length];
        String bodyCare[]={"Body Oil","Raw Shea Butter","Body Scrub"};
        int bodyCareQty[]=new int[bodyCare.length];
        String butters[]={"Cherry Berry Butter","Watermelon Butter","Lemongrass Butter","Lavender Butter","Vanilla Butter","Strawberry Butter","Chocolate Butter"};
        int buttersQty[]=new int[butters.length];
        int totalButters=0;
        String lotions[]={"Cherry Lotion","Vanilla Lotion","Chocolate Lotion","Watermelon Lotion","Untamed Lotion", "Bare Bliss Lotion"};
        int lotionQty[]=new int[lotions.length];
        int totalLotions=0;
        //Scanner object
        Scanner input=new Scanner(System.in);
        //Face care input
        System.out.printf("%15s\n","Face Care");
        getProductsIO(faceCare,faceCareQty);//method that gets input and outputs it
        //Hair Care input
        System.out.printf("%15s\n","Hair Care");
        getProductsIO(hairCare,hairCareQty);
        //Body care input
        System.out.printf("%15s\n","Body Care");
        getProductsIO(bodyCare,bodyCareQty);
        //Butters input
        System.out.printf("%15s\n","Butters");
        getProductsIO(butters,buttersQty,totalButters);
        //inputting lotions
        System.out.printf("%15s","Lotions");
        getProductsIO(lotions,lotionQty,totalLotions);


    }
    //method outside main for product breakdown
    static void printBreakdown(String [] product,int [] quantity){
        for(int i=0;i<product.length;i++){
            System.out.println(product[i]+":"+quantity[i]);
        }
    }

    //method that uses a for loop for the input process and outputs what was got
    static void getProductsIO(String [] product,int [] quantity){
        //first use s for loop to get input
        for(int i=0;i<product.length;i++){
            Scanner input=new Scanner(System.in);
            System.out.println(product[i]+":");
            quantity[i]=input.nextInt();
        }
        //use printBreakdown() for output and output total
        printBreakdown(product,quantity);
    }

    //overload getProductsIO
    static void getProductsIO(String [] product,int [] quantity,int total){
        Scanner input=new Scanner(System.in);
        //first use s for loop to get input
        for(int i=0;i<product.length;i++){
            System.out.println("Enter the quantity for "+product[i]);
            quantity[i]=input.nextInt();
            //get a total number for butters
            total+=quantity[i];
        }
        //use printBreakdown() for output
        System.out.println("Total"+product+":"+total);
        printBreakdown(product,quantity);
    }
}

