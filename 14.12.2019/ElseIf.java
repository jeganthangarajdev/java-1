import java.util.Scanner;
public class ElseIf
    {
        public static void main(String args[])
    {
        int a=5;
        int b=0;
        if(a==0)
        {
            System.out.println("a is zero");
        }
        else if(b==0)
        {
            System.out.println("b is zero");
        }
        else if(a==b)
        {
            System.out.println("a is equal to b");
        }
         else if(a<b)
        {
            System.out.println("a is smaller");
        }
        else
        {
            System.out.println("b is smaller");
        }
    }
}