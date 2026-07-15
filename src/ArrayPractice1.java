/*
 Declare an array of 5 integers. Print the sum and the average.
 */
public class ArrayPractice1 {
    public static void main(String[]args){
    //declaration
    int integers[]={1,2,3,4,5};
    int sum=0;
    int arrLength=integers.length;
    //sum and average
    for(int i=0;i<integers.length;i++){
        sum+=integers[i];
    }
        int average=sum/arrLength;
        System.out.println("The sum is :"+sum);
        System.out.println("The average is :"+average);
    }
}
