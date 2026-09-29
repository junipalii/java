/*
Write a method stats that accepts any number of integers and prints the sum, average, highest and lowest value.
PSEUDO CODE
***Method***
-create a varags method stats with a double return value
-local variable double sum , double average , double highestValue , double lowestValue
-enhanced for loop to find sum
-use sum and array.length to find average
-enhanced for loop to find highest lowest value
-zero handling?
***In Main***
-call method using a printf statement to format output




*/
public class varagsEx {
    public static void main(String[]args){
        stats();
    }
    //method stats
    static void stats(double...numbers){
        if(numbers.length>0){
        double sum=0;
        double average;
        double highest=numbers[0];
        double lowest=numbers[0];
            //finding sum using enhanced for loop
            for (double number : numbers) {
                sum += number;
            }
            //finding average
            average = sum / numbers.length;
            //finding highest and lowest value
            for (double number : numbers) {
                if (highest < number) {
                    highest = number;
                } else if (lowest > number) {
                    lowest = number;
                }
            }
            System.out.println("Highest number" + highest + "\n");
            System.out.println("Lowest number" + lowest + "\n");
            System.out.println("Sum of numbers" + sum + "\n");
            System.out.println("Average of numbers" + average + "\n");
        } else {
            System.out.println("Please enter one or more numbers and try again:");
        }


    }
}
