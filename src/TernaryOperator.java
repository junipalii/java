/*
Grade result banner
Ask the user for a score. Use ternary operators to print:

Pass or Fail (60 and above is a pass)
The grade (A/B/C/D/F) — chain ternaries for this one
A message like "Excellent!" for A, "Good" for B, "Average" for C, "Below Average" for D, "Failed" for F
 */

import java.util.Scanner;
public class TernaryOperator {
    static void main(String[] args){
     //variable declaration
     Scanner input=new Scanner(System.in);
     int score;
     String passOrFail;
     String grade;
     //ask user to input a score
        System.out.print("Please enter the score :");
        score=input.nextInt();
     //ternary operator logic
     passOrFail=(score>=60)? "PASS":"FAIL";
     grade=(score>=90) ? "A\nExecellent":(score>=80) ? "B\nGood":(score>=70) ? "C\nAverage":(score>=60) ? "D\nBelow Average": "F\nFailed";
        System.out.println(grade);
    }
}
