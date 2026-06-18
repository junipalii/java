/*
A java program that takes user input in form an email , uses substring method to slice that email into a username(Everything before the @ sign)a domain name(Everything after the @ sign)
 */

import java.util.Scanner;
public class EmailSlicer {
    public static void main(String[]args){
        //Scanner object
        Scanner input=new Scanner(System.in);
        //variable declaration
        String email , username , domain;
        //request for user input
        System.out.println("Please enter your email :");
        email=input.nextLine();
        if(email.contains("@")) {
            //generating username and domain name from the email
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);
            //outputing the username and domain name
            System.out.println("username :" + username);
            System.out.println("domain :" + domain);
            input.close();
        }else{
            System.out.println("Emails must contain the @ character :");
        }
        }

    }

