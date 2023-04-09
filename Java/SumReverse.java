import java.util.*;
class Number
{
public void reverse(int x)
{
int r,rev=0;
while(x!=0)
{
r=x%10;
rev=rev*10+r;
x=x/10;
}
System.out.println("Reverse="+rev);
}
public void sum(int x)
{
int r,sum=0;
while(x!=0)
{
r=x%10;
sum=sum+r;
x=x/10;
}
System.out.println("SUM="+sum);
}
}
class SumReverse
{
public static void main(String args[])
{
int a;
Number n=new Number();
Scanner s=new Scanner(System.in);
System.out.println("Enter number to find sum and reverse");
a=s.nextInt();
n.reverse(a);
n.sum(a);
}
}
