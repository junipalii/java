/*
Declare an array of 7 temperatures. Print the highest and lowest.
 */
public class ArrayPractice2 {
    public static void main(String[] args){
    //array declaration and initialization , variable declaration
    int temps[]={44,57,40,90,70,43,80};
    int lowestTemp=temps[0];
    int highestTemp=temps[1];
    //finding he highest and lowest temperature
    for(int i = 0;i<temps.length;i++){
        if (temps[i]<lowestTemp) {
            lowestTemp=temps[i];
        } else if (temps[i]>highestTemp) {
            highestTemp=temps[i];
        }
    }
        System.out.println("Highest temp :"+highestTemp);
        System.out.println("Lowest temp :"+lowestTemp);
    }
}
