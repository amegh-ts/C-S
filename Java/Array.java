import java.util.*;
class Array
{
    public static void main(String args[])
{
int i,min,max,smax,n;
int a[]=new int[20];
Scanner s=new Scanner(System.in);
System.out.println("enter size of array");
n=s.nextInt();
System.out.println("enter elements to array");
for(i=0;i<n;i++)
{
    a[i]=s.nextInt();
}
min=a[0];
smax=a[0];
max=a[0];
for(i=0;i<n;i++)
{
    if(a[i]<min){
        min=a[i];
    }
    if(a[i]>max){
        smax=max;
        max=a[i];
    }
}
    System.out.println("Minimum value="+min);
    System.out.println("Maximum value="+max);
    System.out.println("second maximum value="+smax);

    }
}
