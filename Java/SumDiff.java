import java.util.*;
class SumDiff
{
    public static void main(String args[])
    {
        int a,b,c;
        a=Integer.parseInt(args[0]); 
        b=Integer.parseInt(args[1]);
        c=a+b;
        System.out.println("Sum="+c);
        c=a-b;
        System.out.println ("Difference ="+c); 
        c=a*b;
        System.out.println ("Product="+c); 
        c=a/b;
        System.out.println ("Quotient="+c); 
        c=a%b;
        System.out.println ("Remainder ="+c);
    }
}
