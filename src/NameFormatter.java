/*
1. Name formatter

Ask the user to enter their full name (first and last).
Using substring and indexOf, separate the first name from the last name, then print:

First name with first letter capitalized, rest lowercase
Last name in full uppercase
Initials (e.g. "S.O.")

 */

import java.util.Scanner;

public class NameFormatter {
    public static void main(String[]args){
        //Scanner object
        Scanner input=new Scanner(System.in);
        //variable declaration
        String name;
        String fname;
        String middleName;
        String lname;
        String initials;
        //asking the user to enter their name
        System.out.println("Please enter your full name(first and last)");
        name=input.nextLine();
        //checking whether theres two or three names
        int spaceCount=name.length()-name.replace(" ","").length();
        //validation
        if(name.contains(" ")) {
            if(spaceCount==2){
            //generating first and last name and initials
            fname = name.substring(0, 1).toUpperCase() + name.substring(1, name.indexOf(" ")).toLowerCase();
            lname=name.substring(name.lastIndexOf(" ")+1).toUpperCase();
            middleName = name.substring(name.indexOf(" ") + 1,name.lastIndexOf(" ")).toUpperCase();
            initials = name.substring(0, 1).toUpperCase() + "." + name.substring(name.indexOf(" ") + 1, name.indexOf(" ") + 2).toUpperCase()+ "." + name.substring(name.lastIndexOf(" ")+1,name.lastIndexOf(" ")+2);
            //printing it out
            System.out.println("First name :" + fname + "\n" + "middle name :"+middleName+ "\n" + "Last Name :"+ lname + "\n" + "Initials :" + initials);
            input.close();
        }else if(spaceCount==1){
                fname = name.substring(0, 1).toUpperCase() + name.substring(1, name.indexOf(" ")).toLowerCase();
                lname=name.substring(name.indexOf(" ")+1).toUpperCase();
                initials = name.substring(0, 1).toUpperCase() + "." + name.substring(name.indexOf(" ") + 1, name.indexOf(" ") + 2).toUpperCase();
                System.out.println("First name :" + fname + "\n" + "Last Name :"+ lname + "\n" + "Initials :" + initials);


            }else
            System.out.println("Please enter your both names :");
        }
    }

}
