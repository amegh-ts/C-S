import java.util.*;
class Student
{
    int a=0;
    static int b;
    Student()
    {
        a++;
    }
    public void display()
    {
        b++;
        System.out.println("a="+a);
        System.out.println("static value b="+b);
    }
}
class Demo
{
    public static void main(String args[])
    {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        s1.display();
        s2.display();
        s3.display();
    }
}