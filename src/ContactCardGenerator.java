/*
Contact Card Generator
Ask the user for:

First name
Last name
Age
Email
Phone number

Then print a formatted contact card. Use next() for the names (single words only), nextLine() for the email, nextInt() for age — and handle the buffer issue correctly when switching between them.
Output something like:
==============================
         CONTACT CARD
==============================
Name      : Sydney Otieno
Age       : 20
Email     : sydney@gmail.com
Phone     : +254712345678
==============================
The real challenge here isn't the formatting — it's managing the scanner buffer correctly when mixing next(), nextInt() and nextLine(). That's what this is testing.
 */

import java.util.Scanner;
public class ContactCardGenerator {
    public static void main(String[]args){
        //variable declaration
        String fname;
        String contact="CONTACT CARD";
        String lname;
        String email;
        int age;
        String phone;
        //create a scanner object
        Scanner input=new Scanner(System.in);
        //ask user for input
        System.out.println("Please enter your first name :");
        fname=input.next();
        System.out.println("Please enter your second name :");
        lname=input.next();
        System.out.println("Please enter your age :");
        age=input.nextInt();
        System.out.println("Please enter your email :");
        email=input.next();
        input.nextLine();
        System.out.println("Please enter your phone number :");
        phone=input.nextLine();
        //formatting
        System.out.println("==============================");
        System.out.printf("%21s\n",contact);
        System.out.println("==============================");
        System.out.printf("%-10s : %s %s\n","Name",fname , lname);
        System.out.printf("%-10s : %d\n","Age" , age);
        System.out.printf("%-10s : %s\n" , "Email" , email);
        System.out.printf("%-10s : %s\n" , "Phone" , phone);
        System.out.println("==============================");


    }


}
