/*
creating a method using varags that gets integer values and finds their average

PSEUDO CODE
-use an enhanced for loop to add everything into a variable sum
-use .length to get length of the array holding the integers
-divide sum with length and return length
*/

public class varagsAverage {
    public static void main(String[] args){
     //call method average in println statement
        System.out.println(average(1,2,3,4,5,6));
    }
    //method to return average
    static double average(double... numbers){
        double sum=0;
        double Average=0;
        int length=0;
        //find the sum
        for(double number:numbers){
            sum+=number;
        }
        //find the length of array
        length=numbers.length;
        //find average
        Average=sum/length;
        return Average;
    }
}
