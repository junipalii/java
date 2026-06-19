/*
3. Password validator

Ask the user to create a password. Using string methods check that it:

Is at least 8 characters long
Contains at least one uppercase letter (hint: loop through with charAt and Character.isUpperCase)
Contains at least one digit (hint: Character.isDigit)
 */

import java.util.Scanner;
public class PasswordValidator {
    public static void main(String[]args){
    //creating a Scanner method
        Scanner input=new Scanner(System.in);
    //variable declaration
    String password;
    //ask user to create a password
        System.out.println("Create Password :");
        password=input.nextLine();
    //String methods
    int passLength=password.length()-password.replace(" ","").length();


    }
}
