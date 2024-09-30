/**
 * The area of triangle will be calculated in this java file or project 
 * @author (Swapnil)
 * @version (19.0.2)
 */
import java.util.*;
public class triangle
{
     public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 values: ");
        int a = in.nextInt();
        int b = in.nextInt();
        float area = a * b;
        System.out.println("Area of triangle is = " + area/2);
        }
}
