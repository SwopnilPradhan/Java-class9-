

public class star2
{
   
    public static void main(String args[])
    {
    for(int n = 1; n <= 5; n++){
        for(int j = 0;j<=(5-n); j++){
             System.out.print(" ");
        }
       for(int i = 1; i <= n; i++){
           System.out.print("* ");
       }
       System.out.println();
    }
    }
}
