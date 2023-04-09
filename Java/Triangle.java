import java.util.*;
import java.lang.*;

class Triangle {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        double area = 0, semiPerimeter = 0;
        System.out.println("Enter three sides in ascending order");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if ((a + b) > c) {
            if (a == b && b == c) {
                System.out.println("Triangle is equilateral");
            } else if (a == b || b == c || c == a) {
                System.out.println("Triangle is isosceles");
            } else {
                System.out.println("Triangle is scalene");
            }
            semiPerimeter = (a + b + c) / 2;
            area = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
            System.out.println("Area=" + area);
        } else {
            System.out.println("Not a Triangle");
        }
    }
}