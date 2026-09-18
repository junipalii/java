/*
3. Password strength checker
Write a method checkPasswordStrength(String password)
that returns a String — "Weak", "Medium", or "Strong" based on:

Weak: less than 6 characters
Medium: 6-10 characters
Strong: more than 10 characters AND contains a number

Call it from main, ask the user to enter a password and print the strength result.
 */

/*
PSEUDO CODE
***Method***
return type is String
receives a String password as argument
use a while loop to loop through and check if it contains a number
use .length assigned to a variable to check the length
I think ill use && to check for length and characters
***In main***
Ask the user to enter a password then call the method
 */


import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args){
    //variable declaration and Scanner method
        Scanner input=new Scanner(System.in);
        String password;
        //ask user to enter their password
        System.out.print("Please create your password :");
        password=input.next();
        //call the method
        System.out.println(checkPasswordStrength(password));
    }
    static String checkPasswordStrength(String password){
    //variable declaration
    int passLength=password.length();
    if(passLength<6){
        return "Weak password \nPassword should have more than 6 characters";
    }else {
        for(char pass : password.toCharArray()){
          if(Character.isDigit(pass) && passLength>10){
              return "Strong";
          }
        }return "Medium , please add numbers to strengthen your password ";
    }
    }

}
