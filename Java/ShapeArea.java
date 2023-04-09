import java.util.*;
class Shape
{
    int a,r;
    double b,h;
}
class TwoDim extends Shape
{
    public void square(int a)
    {
        System.out.println("Area of square="+(a*a));
    }
    public void triangle(double b, double h)
    {
        System.out.println("Area of triangle="+(b*h)/2);
    }
}
class ThreeDim extends Shape
{
    public void sphere(int r)
    {
        System.out.println("Area of sphere="+(4*3.14*r*r));
    }
    public void cube(int a)
    {
        System.out.println("Area of cube="+(6*a*a));
    }
}
class ShapeArea
{
    public static void main(String args[])
    {
        TwoDim t1=new TwoDim();
        ThreeDim t2=new ThreeDim();
        t1.square(3);
        t1.triangle(3.0,2.0);
        t2.sphere(3);
        t2.cube(3);
    }
}