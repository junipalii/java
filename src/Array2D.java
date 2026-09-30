/*
1. Classroom grades
Create a 2D array with 3 students, each with 4 grades.
Print each student's grades and their average.
Label them Student 1, Student 2, Student 3.
*/

/*
PSEUDO CODE
view 1
-separate array with student1 , student2 , student 3
view 2
-3 student arrays with grades
-Double[] student1 = {70 , 60 , 30 }
-combine them into a 2D array classroom
-String [][] = {student1 , student2 . student3};
-use an enhanced for loop to get each students grade , get an average and print them out
*/

public class Array2D {
    public static void main(String[]args){
        //variables
        double [] student1={70.5,80.5,60,55};
        double [] student2={80,70,61,50};
        double [] student3={70,60,60,55};
        double sum = 0;
        int  count=0;
        double average ;
        //create a 2D array to hold all student marks
        double [][] marklist ={student1,student2,student3};
        //looping through to print each student grade and mark
        for(double [] mark : marklist){
            sum=0;
            for(double grade : mark){
               //getting the total mark
                sum+=grade;
            }
            //increase counter variable so we can number students
            count+=1;
            System.out.print("Student "+count+":");
            //finding the average abd grade and printing them out
            average=sum/mark.length;
            if(average<0||average>100){
                System.out.println("INVALID :Average should be between 0 and 100 , try again");
            }
            else if (average<40){
                System.out.printf("%s %c:%.2f\n","Grade",'F',average);
            }else if(average<50){
                System.out.printf("%s %c:%.2f\n","Grade",'E',average);
            }else if(average<60){
                System.out.printf("%s %c:%.2f\n","Grade",'D',average);
            }else if(average<70){
                System.out.printf("%s %c:%.2f\n","Grade",'C',average);
            }else if(average<80){
                System.out.printf("%s %c:%.2f\n","Grade",'B',average);
            }else{
                System.out.printf("%s %c:%.2f\n","Grade",'A',average);
            }
        }


    }
}
