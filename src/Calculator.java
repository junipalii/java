import java.util.Scanner;

public class Calculator {
    static void main(String[] args){
    //variable declaration
        double value1=0;
        double value2=0;
        double result=0;
        String operator;
        Scanner input=new Scanner(System.in);
    //ask the user to specify what operation they would like to do
        System.out.printf("%15s","Calculator\n");
        System.out.println("Operators and their operations\n+ :addition\n- :subtraction\n* :multiplication\n/ :division\n% :floor division");
        System.out.print("Please pick an operator for the operation you want to complete :");
        operator=input.nextLine();
        System.out.print("Enter the first value :");
        value1=input.nextDouble();
        System.out.print("Enter the second value :");
        value2=input.nextDouble();
        //logic using a switch
        switch(operator){
           case "+" -> {
               result=value1+value2;
               System.out.println("Answer :"+result);
           }
           case "-" -> {
               result=value1-value2;
               System.out.println("Answer :"+result);
           }
           case "*" -> {
               result=value1*value2;
               System.out.println(result);
           }
           case "%" , "/"-> {
               if(value2==0){
                   System.out.println("Zero division is not possible");
               }else if(operator.equals("%")){
                   result=value1%value2;
                   System.out.println("Answer :"+result);
               }else{
                   result=value1/value2;
                   System.out.println("Answer :"+result);
               }
           }
           default -> System.out.println(operator+"is not a valid operator");
        }

    }
}
