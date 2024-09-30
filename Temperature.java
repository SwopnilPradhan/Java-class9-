//java program to convert celsius to fahrenheit
import java.util.*; //importing package
public class Temperature
{
  public static void main(String[]args){
     Scanner sc = new Scanner(System.in); //importing scanner class to recieve user input and convert to primitive data types
     //inputting value of temprature in celsius
     System.out.println("--------------------------------Temprature Rates converter----------------------------------------- \n");
     System.out.println("Enter temprature in degree celsius ( `C )");
     float C = sc.nextFloat();
     //Calculating to convert celsius to fahrenheit
     float F = (C * 9/5) + 32;
     //Output
     System.out.println("The temperature rate in Celsius ( `C ) is " + C + "`C");
     System.out.println("The temperature rate in fahrenheit ( `F ) is " + F + "`F");
    }
}



/*
 *                Variable Description
 *----------------------------------------------------------------------------------------------
 *Variable    -     Datatypes    -       Description
 *C           -     float        -       To store the value of temprature unit `C
 *F           -     float        -       To calculate and store the value of the temprature unit `F
 *-----------------------------------------------------------------------------------------------
 */
