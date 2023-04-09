import java.util.*;
class Complex
{
    int real,img;
    Complex()
    {
        real=img=0;
    }
    Complex (int x, int y)
    {
        real=x;
        img=y;
    }
    void add(Complex c1,Complex c2)
    {
        real=c1.real+c2.real;
        img=c1.img+c2.img;
    }
    void display()
    {
        System.out.println(real+"+i"+img);
    }
}
class MainComplex
{
    public static void main(String args[]) 
    {
        Complex c1=new Complex(2,3);
        Complex c2=new Complex(4,5);
        Complex c3=new Complex();
        System.out.println("First Complex number");
        c1.display();
        System.out.println("Second complex number");
        c2.display();
        System.out.println("sum of complex numbers=");
        c3.add(c1,c2);
        c3.display();
    }
}