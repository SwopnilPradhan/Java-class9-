
import java.util.*;
public class table
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print multiplication table");
        int a = sc.nextInt();
        int b = a*1000000;
        for (int i = a; i<= b; i+=a){
            System.out.println(i);
        }
    }
}
