import java.util.*;

interface Volume {
    Scanner sc = new Scanner(System.in);
    double pi = 3.14;

    void readdata();

    void dispvolume();
}

class Sphere implements Volume {
    double v;
    int r;

    public void readdata() {
        System.out.println("Enter radius of sphere: ");
        r = sc.nextInt();
    }

    public void dispvolume() {
        v = ((double) 4 / 3) * pi * (r * r * r);
        System.out.println("Volume of sphere = " + v);
    }
}

class Cylinder implements Volume {
    double v1;
    int r1, h;

    public void readdata() {
        System.out.println("Enter radius of cylinder: ");
        r1 = sc.nextInt();
        System.out.println("Enter height of cylinder: ");
        h = sc.nextInt();
    }

    public void dispvolume() {
        v1 = pi * r1 * r1 * h;
        System.out.println("Volume of cylinder = " + v1);
    }
}

class Shape {
    public static void main(String args[]) 
    {
        Sphere sp = new Sphere();
        Cylinder cd = new Cylinder();
        sp.readdata();
        sp.dispvolume();
        cd.readdata();
        cd.dispvolume();
    }
}
