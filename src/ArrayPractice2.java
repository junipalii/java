/*
Declare an array of 7 temperatures. Print the highest and lowest.
 */
public class ArrayPractice2 {
    public static void main(String[] args){
    //array declaration and initialization , variable declaration
    int highestTemp=0;
    int lowestTemp=0;
    int temps[]={43,57,40,90,70,60,80};
    //finding he highest and lowest temperature
    for(int i = 0;i<temps.length;i++){
        lowestTemp=temps[0];
        highestTemp=temps[1];
        if(temps[i]>temps[0]){
            highestTemp=temps[0];
        } else if (temps[i]<temps[0]) {
            lowestTemp=temps[0];
        }
    }
        System.out.println("Highest temp :"+highestTemp);
        System.out.println("Lowest temp :"+lowestTemp);
    }
}
