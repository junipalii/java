import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args){
     Scanner input=new Scanner(System.in);
     //variable declaration
        int option;
        double value;
     //provide use with two options and ask them to pick
        System.out.print("Please select the option for the operation \n1.Kilograms to Pounds\n2.Pounds to Kilograms\nOption :");
        option=input.nextInt();
        System.out.print("Ënter the value for the operation :");
        value=input.nextInt();
     //logic in form of if statements
        if(option==1){
         value/=0.4535924;
            System.out.printf("%.2f lbs",value);
        }else if(option==2){
            value*=0.4535924;
            System.out.printf("%.2f kgs",value);
        }else{
            System.out.println("Invalid choice , please select 1 or 2");
        }
        input.close();
    }
}
