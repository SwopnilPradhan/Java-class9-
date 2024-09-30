
public class xc
{
    public static void main(String args[]){
        
        
        int n = 23;
        long sumofdigits;
        long prouctofi = 1;
      for(sumofdigits=0; n!=0;n/=10){
          sumofdigits += n%10;
          prouctofi *= n%10;
      }
      
      System.out.println(sumofdigits);
      System.out.println(prouctofi);
    }
}
