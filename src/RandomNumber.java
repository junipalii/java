import java.util.Random;

public class RandomNumber {
    public static void main(String[]args){
       //variable declaration
        int number;
        boolean isHeads;
        double value;
      //create a random object
      Random random=new Random();
      //assign variable
      number=random.nextInt(1,11);
      isHeads=random.nextBoolean();
      value=random.nextDouble();
      //print out
        System.out.println("random : " + number);
        System.out.println(isHeads);
        System.out.println(value);

    }
}
