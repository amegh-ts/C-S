import java.util.*;
class Evennum implements Runnable
{
    public void run()
    {
        for(int i=1;i<15;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even number"+i);
            }
        }
    }
}
class Oddnum implements Runnable
{
    public void run()
    {
        for(int i=1;i<15;i++)
        {
            if(i%2!=0)
            {
                System.out.println("odd number"+i);
            }
        }
    }
}
class OddEven
{
    public static void main(String args[])
    {
        Evennum e=new Evennum();
        Oddnum o=new Oddnum();
        Thread t1=new Thread(e);
        Thread t2=new Thread(o);
        t1.start();
        t2.start();
    }
}