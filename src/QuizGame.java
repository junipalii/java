import java.util.Scanner;

/*
Create a string array of your own questions then
Create a 2d array for answers
Type in a number 1 through 4 depending on your guess
Then display a finl score depending on the amount of correct guesses
*/
/*
PSEUDO CODE
-First create a string Arrays of 4 questions
-Create a 2D array for the answers of the 4 possible questions
-create a method quiz , that loops through the question array printing out the questiosn
-loops through the 2D array printing out the answers ,
-wait for user input then evaluate their answer
-Tell user whether they are right or wrong
-Keep track of correct answer and print out at the end
*/
public class QuizGame {
    public static void main(String[] args){
        //create arrays for questions and answers
        String [] questions={"A.When did Kenya gain independence :","B.Who was the first president of Kenya :","C.What is Kenya's National Football team called :","D.What is the highest Mountain in Kenya called :"};
        String q1Answer []={"1.1963","2.1964","3.1965","4.1966"};
        String q2Answer []={"1.Daniel Moi","2.Jomo Kenyatta","3.Jaramogi Odinga","4.Tom Mboya"};
        String q3Answer []={"1.Gor Mahia","2.Tusker FC","3.Harambee Stars","4.Harambee Starlets"};
        String q4Answer []={"1.Mt.Kenya","2.Mt.Kilimanjaro","3.Mt.Elgon","4.Mt.Longonot"};
        String [][] answers={q1Answer,q2Answer,q3Answer,q4Answer};
        //create a marksheet array to compare
        int [] marksheet={1,2,3,1};
        //call method to quiz
        quiz(answers,questions,marksheet);
    }
    //a method quiz that loops through and asks questions prints answers
    public static void quiz(String [][] answers , String [] questions, int [] marksheet){
        //Create a Scanner method for user input
        Scanner input=new Scanner(System.in);
        //Create a variable to hold user answers
        int choice=0;
        int counter=0;
        //loop through printing the questions and answers
        for(int i =0 ; i< questions.length ;i++){
            System.out.println(questions[i]);
            for(int j=0 ; j< answers.length ; j++){
                System.out.println(answers[i][j]);
            }

        }
        System.out.println("Correct answers :"+counter+"/"+questions.length);
        }
    }

