/*
4. Declare an array of 10 integers. Print only the even numbers using a for loop.
 */

public class ArrayPractice4 {
    public static void main(String[] args){
        //array declaration
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        //for loop to print even numbers
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}
