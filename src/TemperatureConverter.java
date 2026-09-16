/*
1. Temperature converter
Write two methods
 — celsiusToFahrenheit(double celsius) and fahrenheitToCelsius(double fahrenheit) —
 both return a double.
 In main, ask the user which conversion they want,
 take the temperature input, call the right method and print the result.
 */


/*
PSEUDO CODE
***In main***
Ask the user the temperature conversion they want
If celsius to fahrenheit ask for a value and that value becomes the arguement and vice versa
Print out the result
***In methods***
return type is double
perform the conversion and return the double
1 celsius is 33.8 fahrenheit
 */

import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args){
    //create a Scanner object
        Scanner input=new Scanner(System.in);
    //variable declaration
        int conversionChoice;
        double tempValue;
    //ask for user to select input type
        System.out.println("Please select option 1 or 2 for the desired conversion :");
        System.out.println("1.celsius to fahrenheit\n2.fahrenheit to celsius");
        System.out.print("OPTION :");
    //getting the conversion choice
        conversionChoice=input.nextInt();
    //ask user to provide the tempValue
        System.out.print("Please provide the temperature value to be converted :");
        tempValue=input.nextDouble();
    //method selection using an if statement
        if(conversionChoice==1){
            System.out.println(celsiusToFahrenheit(tempValue)+" Farehnheit");
        }else{
            System.out.println(fahrenheitToCelsius(tempValue)+" Celsius");
        }
    }
    //method celsiusToFahrenheit
    static double celsiusToFahrenheit(double tempValue){
        return (tempValue * 9/5) + 32;
    }
    //method FahrenheitToCelsius
    static double fahrenheitToCelsius(double tempValue){
        return (tempValue - 32) * 5/9;
    }
}
