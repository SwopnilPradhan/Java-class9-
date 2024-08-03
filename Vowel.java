import java.util.*;
class Vowel{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter letter");
    char ch = sc.next().charAt(0);
    switch(ch){
      case 'A':
      case 'a':
        System.out.println("vowel");
      case 'E':
      case 'e':
        System.out.println("vowel"); 
      case 'I':
      case 'i':
        System.out.println("vowel");
      case 'O':
      case 'o':
        System.out.println("vowel");
      case 'U':
      case 'u':
        System.out.println("vowel");
      default:
        System.out.println("not a vowel");
    }
  }
}
