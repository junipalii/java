
/*
1. Grade classifier
Ask the user to enter a score between 0 and 100.
 Print the grade — A for 90+, B for 80-89, C for 70-79, D for 60-69, F for anything below.
 Validate that the score is actually between 0 and 100.
 */
import java.util.Scanner;
import java.io.*;

public class gradeClassifier {
    public static void main(String[]args){
    //create a Scanner object
    Scanner input=new Scanner(System.in);
    //ask for user input
    System.out.println("Please enter a score between 0 and 100");
    int mark=input.nextInt();
    if(mark<0||mark>100){
        System.out.println("Invalid : Select a grade between 0 and 100");
        return;//prevents fall through
    }else if(mark<=59){
        System.out.println("Grade : F");
    }else if(mark<70){
        System.out.println("Grade : D");
    }else if(mark<80){
        System.out.println("Grade : C");
    }else if(mark<90){
        System.out.println("Grade : B");
    }else{
        System.out.println("Grade : A");
    }
    input.close();
}

}