

public class star1
{
  public static void main(String args[])
    {
        //real
    for(int n = 1; n <= 5; n++){
       for(int i = 1; i <= n; i++){
           System.out.print("* ");
       }
       System.out.println();
    }
    //inverted
    for(int x = 5; x >= 1; x--){
       for(int m = x; m >=1; m--){
           System.out.print("* ");
       }
       System.out.println();
    }
    //equilateral
    for(int y = 1; y <= 6; y++){
       for(int z = 0; z <= 6-y; z++){
           System.out.print("  ");
       }
       for(int z = 1;z <= (y*2)-1;z++){
           System.out.print("* ");
       }
       System.out.println();
    }
    }
}
