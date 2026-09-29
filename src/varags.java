/*
varags example from bro code
*/

public class varags {
    public static void main(String[]args){
        //call add and it adds any no of arguments
        System.out.println(add(1,2,3,4,5));
    }
    //create a method with variable arguements
    static int add(int... numbers){
        //local variable sum
        int sum=0;
        //enhanced for loops that adds each element in our array
        for(int number:numbers){
            sum+=number;
        }
        return sum;
    }
}
