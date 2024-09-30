
/**
 * Write a description of class capital here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class capital
{
    // instance variables - replace the example below with your own
    public static void main(String args[]){

      Scanner s=new Scanner(System.in);
      int length;
      char out;
      char i;
      System.out.println(" Enter a Sentence ");
      String sent1=s.nextLine();
      length=sent1.length();
      String sent2=sent1.toUpperCase();
      for(i=0; i<length; i++){
          out=sent2.charAt(i);
         if(out==' '){
                 System.out.print("\n");
                }
         else{
             System.out.print(out);
         }
            }
          }
}
