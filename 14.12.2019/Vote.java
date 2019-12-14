import java.util.Scanner;

 public class Vote
{
public static void main(String args[])
    {
        int x;
        Scanner in=new Scanner(System.in);
        System.out.println("enter a");
        x=in.nextInt();
    if(x>18)
    {
        System.out.print("eligible for vote");
    }
    else
    {
        System.out.print(" not eligible for vote");
    }
}
}