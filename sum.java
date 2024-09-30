
import java.util.*;
public class sum
{
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter range ");
        int a = sc.nextInt();
         int sum = 0;
         for (int i = 1; i<= a; i+=1){
            sum = sum + i ;
            System.out.println(i);
        }
            System.out.println("the sum is " + sum);
    }
}
