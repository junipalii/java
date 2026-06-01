/*
Student Report Card

Ask the user to enter the following for a student:

Name
Subject (e.g. Math, English)
Score out of 100
Then print a formatted report that:

Displays the student's name in uppercase
Displays the subject with the first letter capitalized
Shows the score as a percentage to 2 decimal places (e.g. 73.50%)
Shows a letter grade (A/B/C/D/F)
Prints a neatly aligned summary using width and flags so it looks like an actual report, not just println statements
Something like:

============================
       STUDENT REPORT
============================
Name    : SYDNEY
Subject : Mathematics
Score   : 73.50%
Grade   : C
============================
This touches string methods (uppercase, capitalize), printf with %%, width, flags for alignment, and the grade logic you already know. Go.
 */

import java.util.Scanner;

public class StudentReportCard {
    public static void main(String[] args){
        //variable declaration
        String name;
        String subject;
        double score;
        char grade;
        String header="Student Report";
        //create a scanner object
        Scanner input=new Scanner(System.in);
        //Get user input

        System.out.println("Please enter the students name : ");
        name=input.nextLine();
        System.out.println("Please enter the subject : ");
        subject=input.nextLine();
        System.out.println("Please enter the students score : ");
        score=input.nextDouble();
        //Grade generations
        if(score>100||score<0){
            System.out.println("Please enter a score between 0 and 100 : ");
            return;
        }else if(score<40){
            grade='F';
        }else if(score<50){
            grade='D';
        }else if(score<60){
            grade='C';
        }else if(score<70){
            grade='B';
        }else{
            grade='A';
        }

        //formattng
        name=name.toUpperCase();
        subject=subject.substring(0,1).toUpperCase()+subject.substring(1).toLowerCase();
        //output
        System.out.println("============================");
        System.out.printf("%20s\n",header);
        System.out.println("============================\n");
        System.out.printf("%-10s : %s\n","Name",name);
        System.out.printf("%-10s : %s\n","Subject", subject);
        System.out.printf("%-10s : %s\n","Score",score);
        System.out.printf("%-10s : %c\n","Grade", grade);

    }
}
