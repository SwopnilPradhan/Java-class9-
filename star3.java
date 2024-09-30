

public class star3
{
    public static void main(String args[])
    {
    for(int n = 1; n <= 5; n++){
        for(int j = 1;j<=5; j++){
             if(n==1|| n== 5|| j==1 || j==5){
                 System.out.print("* ");
             }
             else{
                 System.out.print("  ");
             }
        }
       
       System.out.println();
    }
    }
}
