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
    int whiteSpace=password.length()-password.replace(" ","").length();
    int passLength=password.length()-whiteSpace;
    //password validation
    if(!password.isEmpty()){
        for(int i=0;password.length()<8;i++){
            if(password.charAt(i)==Character.isUpperCase()){}

        }

    }
        System.out.println("password length :"+passLength);


    }
}
