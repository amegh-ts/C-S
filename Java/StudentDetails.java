import java.util.*;

class Student {
    int rollno, age;
    String name, classname; 
    Scanner s = new Scanner(System.in);

    public void read() {
        System.out.println("Enter name of the student");
        name = s.next();
        System.out.println("Enter rollno of the student");
        rollno = s.nextInt();
        System.out.println("Enter age of the student");
        age = s.nextInt();
        System.out.println("Enter class of the student");
        classname = s.next();
    }

    public void display() {
        System.out.println("name:" + name);
        System.out.println("rollno:" + rollno);
        System.out.println("age:" + age);
        System.out.println("class:" + classname);
    }
}

class Mark extends Student {
    int total = 0;
    double avg;
    int a[] = new int[5]; 

    public void markread() {
        System.out.println("Enter marks of 5 subjects between 0 to 100");
        for (int i = 0; i < 5; i++) {
            a[i] = s.nextInt();
            total = total + a[i];
        }
        avg = total / 5.0; 
        System.out.println("total mark=" + total);
        System.out.println("average mark=" + avg);
    }

    public void grade() {
        if (avg >= 90)
            System.out.println("A grade");
        else if (avg >= 80)
            System.out.println("B grade");
        else if (avg >= 70)
            System.out.println("C grade");
        else if (avg >= 60)
            System.out.println("D grade");
        else
            System.out.println("E grade");
    }
}

class StudentDetails {
    public static void main(String args[]) {
        Mark m = new Mark();
        m.read();
        m.display();
        m.markread();
        m.grade();
    }
}
