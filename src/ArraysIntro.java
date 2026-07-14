import java.util.Arrays;
public class ArraysIntro {
    public static void main(String[]args){
        //learning about java arrays
        String [] fruits={"Banana","Orange","Pineapple"};
        System.out.println(fruits[0]);
        //get the length of an array
        int numOfFruits=fruits.length;
        System.out.println(numOfFruits);
        //printing all the elements of an array using a for loop
        for(int i=0;i<fruits.length;i++){
            System.out.println(fruits[i]);
        }
        //using an enhanced for loop to print out elements in array
        for(String fruit:fruits){
            System.out.print(fruit + " ");
        }
        //using array sort and fill methods to sort our array and fill our array elements
        Arrays.sort(fruits);
        Arrays.fill(fruits,"Pineapple");
    }
}
