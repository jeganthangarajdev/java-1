import java.util.Scanner;
public class PoNe
{
    public static void main(String args[])
    {
        int x;
        Scanner in=new Scanner(System.in);
        System.out.print("enter a");
        x=in.nextInt();
    if(x==0)
    {
        System.out.println("zero");
    }
else if(x>0)
{
    System.out.println("positive");
}
    else
    {
        System.out.println("negative");
    }
}
}