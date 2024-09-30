import java.util.*;
public class test1
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of items in cart:-");
        int x = sc.nextInt();
        System.out.println("Enter the price of each item:-");
        double y = sc.nextDouble();
        System.out.println("Enter the discount to be applied:-");
        double z = sc.nextDouble();
        
        double subtotal = x * y;
        double discount = (z * subtotal)/100;
        double total = subtotal-discount;
        System.out.println("The no. of items in cart:-" + x);
        System.out.println("The price of each item in cart:-" + " ₹‎" + y);
        System.out.println("The discount applied of items in cart:-" + " ₹‎" + z + "%");
        System.out.println("The sub total cost of items in cart:-" + " ₹‎" + subtotal);
        System.out.println("The discount should be applied is" + " ₹‎" + discount);
        System.out.println("The total cost of items in cart is" + " ₹‎" + total);
    }
}