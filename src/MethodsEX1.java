import java.util.Scanner;

public class MethodsEX1 {
    public static void main(String[]args){
        String fname="";
        String lname="";
        System.out.println(askReturnName(fname , lname));
        int age=20;
        //age check method
        if(checkAge(age)){
            System.out.println("You may sign up :");
        }else{
            System.out.println("You must be 18+ to sign up");
        }
    }
    static String askReturnName(String fname , String lname){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your first name :");
        fname=input.next();
        System.out.println("Please enter your last name :");
        lname=input.next();
        return "Your name is "+fname+" "+lname;


    }

    static boolean checkAge(int age){
        return age >= 18;
    }

}
