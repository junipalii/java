/*
2. Multiplication Table
Print a formatted 10x10 multiplication table where every number is right-aligned in a fixed width column so the grid looks clean:
   1   2   3   4   5   6   7   8   9  10
   2   4   6   8  10  12  14  16  18  20
...
You'll need a nested for loop for this one — which is a preview of what's coming in arrays. Focus on the %Xd width specifier to keep columns aligned.
The second one is the more useful exercise for locking in width. Start with whichever.
*/
import java.util.Scanner;
public class MultiplicationTable {
public static void main(String[] args){
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                System.out.printf("%4d",i*j);
            }
            System.out.println();
        }
    }
}

