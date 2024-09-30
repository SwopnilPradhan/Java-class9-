import java.util.*;
public class Traffic
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Traffic Light Stimulator");
        System.out.println("1. Red");
        System.out.println("2. Yellow");
        System.out.println("3. Green \n \n \n");
        
        System.out.println("Enter the colour number:-");
        int x = sc.nextInt();
        
        switch(x){
            case 1:
                System.out.println("Stop! The light is red. ");
                break;
            case 2:
                System.out.println("Prepare to stop. The light is yellow");
                break;
            case 3:
                System.out.println("Go! The light is green");
                break;
            default:
                System.out.println("Invalid colour number");
                break;
            }
    }
}
