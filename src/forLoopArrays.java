/*
some practice on using for loops and arrays
 */

public class forLoopArrays {
    public static void main(String[]args){
      String arr[]={"Red","Blue","Green"};
      for(int i=0;i<arr.length;i++){
          System.out.println(arr[i]);
      }
      //practice with a 2d array
        String colors[][]={{"Red","Blue","Yellow"},{"Purple","Pink","Green"}};
      //use a nested for loop
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.println(colors[i][j]);
            }
        }
    }
}
