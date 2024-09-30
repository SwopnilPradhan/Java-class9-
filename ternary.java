import java.util.*;
public class ternary{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter number");
       int n = sc.nextInt();
       String res = (n==0) ? "Zero" : (n > 0) ? "Positive" : "Negative";
       System.out.println(res);
    }
}
