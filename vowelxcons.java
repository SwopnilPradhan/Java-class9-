import java.util.*;
public class vowelxcons
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter alphabet to check vowel or consonant:-");
        
        char alpha = sc.next().charAt(0);
        
        switch(alpha){
            case 'a':
                System.out.println(alpha + " is a vowel.");
                break;
            case 'e':
                System.out.println(alpha + " is a vowel.");
                break;
            case 'i':
                System.out.println(alpha + " is a vowel.");
                break;
            case 'o':
                System.out.println(alpha + " is a vowel.");
                break;
            case 'u':
                System.out.println(alpha + " is a vowel.");
                break;
            case 'A':
                System.out.println(alpha + " is a vowel.");
                break;
            case 'E':
                System.out.println(alpha + " is a vowel.");
                break;
            case 'I':
                System.out.println(alpha + " is a vowel.");
                break;
            case 'O':
                System.out.println(alpha + " is a vowel.");
                break;
            case 'U':
                System.out.println(alpha + " is a vowel.");
                break;
            default:
                System.out.println(alpha + " is a consonant.");
                break;
        }
    }
}
