import java.util.Scanner;

/*
3. Product search
Create a 2D array combining at least 3 product categories (like your stock take).
Ask the user to enter a product name and search through the entire 2D array.
Print which row (category) and column (index) it was found at,
or “Product not found” if it doesn’t exist.
 */
/*
PSEUDO CODE
***In Main***
Create 3 2D arrays of products
create a method product search that uses a nested for loop to search through the entire 2D array
Takes in product name as a parameter
 */
public class ProductSearch {
    public static void main(String[]args){
        //Variable declaration
        String [] Meats={"Pork","Sausages","Chicken"};
        String [] Fruits={"Tomatoes","Banana","Apple"};
        String [] Vegetables={"Spinach","Kale","Cabbage"};
        String [][]Products={Meats,Fruits,Vegetables};
        String []CategoryName={"Meats","Fruits","Vegetables"};

        //call product search
        productSearch(Products , CategoryName);
    }
    //method productSearch to search and print product
    public static void productSearch(String [][] Products , String [] CategoryName){
        //variable declaration
        String product;
        boolean found=false;
        Scanner input=new Scanner(System.in);
        //ask user to enter product they want to search
        System.out.print("Please enter product you want to search :");
        product=input.nextLine();
        for(int i=0;i<Products.length;i++){
            for(int j=0;j<Products[i].length;j++){
            if(product.equalsIgnoreCase(Products[i][j])){
                System.out.println("row :"+CategoryName[i]+"\n"+"column :"+j);
                found=true;
            }
            }
        }
        if(!found) {
            System.out.print("Product not found :");
        }
    }
}
