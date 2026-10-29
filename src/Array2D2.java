/*
2. Seating chart
Create a 2D array representing a 3x4 cinema seating chart.
Fill it with "Empty". Ask the user to pick a row and seat number, then mark it as "Taken".
Print the full seating chart before and after.
*/

/*
PSEUDO CODE
-3x4 (3 rows for columns);
-seating chart is of String data type
-initially its empty , so i have to loop through and populate the array with empty
-print the seating chart before the user does anything
-encapsulate user access into a method maybe
-user specifies row and column and we modify the index to taken then print the seating chart
-variables : 2D Array , input variable for the user seocifying row and column?
-how will i get user input to array coordinates ?
-maybe try and deny access when seat is taken?
-what if all seats are taken?
*/


import java.util.Scanner;

public class Array2D2 {
    static void main(String[]args){
     //variables and objects
     Scanner input=new Scanner(System.in);
     String [][] seatingChart=new String[3][4];
     int row;
     int column;
     //loop through and fill the array with empty
        for(int i=0;i<seatingChart.length;i++){
            for(int j=0;j< 4;j++){
                seatingChart[i][j]="Empty";

            }        }
        //confirm that the chart is filled with empty and also print out to the user
        System.out.println("  Seating Chart  ");
        for(String[] chart : seatingChart){
            for(String seat : chart){
                System.out.print(seat+" | ");
            }
            System.out.println();
        }
        //Ask user where they would like to seat and subtract by 1 for zero indexing
        System.out.println("Please select an empty seat");
        System.out.print("Seat row:");
        row=input.nextInt()-1;
        System.out.print("Seat column :");
        column=input.nextInt()-1;
        //assign a seat and update to taken
        for(int i=0;i<seatingChart.length;i++){
            for(int j=0;j< 4;j++){
                if(i==row&&j==column){
                    if(seatingChart[i][j].equals("Taken")){
                        System.out.println("Please choose an empty seat :");
                        break;
                    }else {
                        seatingChart[i][j] = "Taken";
                    }
                }

            }        }
        /*test whether i can access a taken seat
        System.out.println("Please select an empty seat");
        System.out.print("Seat row:");
        row=input.nextInt()-1;
        System.out.print("Seat column :");
        column=input.nextInt()-1;
        for(int i=0;i<seatingChart.length;i++){
            for(int j=0;j< 4;j++){
                if(i==row&&j==column){
                    if(seatingChart[i][j].equals("Taken")){
                        System.out.println("Please choose an empty seat :");
                    }else {
                        seatingChart[i][j] = "Taken";
                    }
                }

            }        }
        */
        //print put chart
        System.out.println("  Seating Chart  ");
        for(String[] chart : seatingChart){
            for(String seat : chart){
                System.out.print(seat+" | ");
            }
            System.out.println();
        }
    }
}
