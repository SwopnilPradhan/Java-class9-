import java.util.*;
public class rev{
  public static void main(String args[]){
    String x = "Deepak";
    int length = x.length();
    String rev = "";
    for(int i = length-1;i>=0;i++){
      rev = rev + charAt(i);
    }
    System.out.println(rev);
  }
}
