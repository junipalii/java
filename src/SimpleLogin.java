/*
3. Simple login Define a correct username and password as variables.
Ask the user to enter both. If both match, print "Access granted."
If the username is wrong, print "Unknown user." If the username is right but the password is wrong, print "Incorrect password."
Order of your conditions will matter here.
 */
import java.util.Scanner;
import java.io.*;

public class SimpleLogin {
    public static void main(String[]ags){
//variable declaration
        String username="Sydney";
        String password="admin123";
        String nameCopy , passCopy;
//Scanner object
        Scanner input=new Scanner(System.in);
//ask user to input username and password
        System.out.print("Username :");
        nameCopy=input.nextLine();
        System.out.print("Password :");
        passCopy=input.nextLine();
//validate username
        if(username.equals(nameCopy)&&password.equals(passCopy)){
            System.out.println("Access Granted");
        }else if(!password.equals(passCopy)){
            System.out.println("Wrong password");
        }else if(!username.equals(nameCopy)){
            System.out.println("Unknown user");
        }else{
            System.out.println("Invalid cridentials ");
        }
    }
}
