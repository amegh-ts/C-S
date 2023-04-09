import java.util.*;

class Overloading {
    double a, b, c;

    void volume(double a) {
        int v = (int) (a * a * a);
        System.out.println("Volume of cube: " + v);
    }

    void volume(double a, double b) {
        double v = 3.14 * ((a * a) * b);
        System.out.println("Volume of Cylinder: " + v);
    }

    void volume(double a, double b, double c) {
        int v = (int) (a * b * c);
        System.out.println("Volume of rectangle: " + v);
    }
}

class FunctionOverloading {
    public static void main(String args[]) {
        Overloading o = new Overloading();
        o.volume(2);
        o.volume(2, 3);
        o.volume(2, 3, 4);
    }
}
