import java.util.*;

class Base {
    public void DecimaltoBinary(int n) {
        int a[] = new int[20];
        int i = 0, j;
        while (n > 0) {
            a[i] = n % 2;
            i++;
            n = n / 2;
        }
        System.out.println("After conversion from decimal to binary the result is ");
        for (j = i - 1; j >= 0; j--) {
            System.out.print(a[j]);
        }
        System.out.println();
    }

    public void DecimaltoOctal(int n) {
        int a[] = new int[20];
        int i = 0, j;
        while (n > 0) {
            a[i] = n % 8;
            n = n / 8;
            i++;
        }
        System.out.println("After the conversion from decimal to octal the result is ");
        for (j = i - 1; j >= 0; j--) {
            System.out.print(a[j]);
        }
        System.out.println();
    }

    public void DecimaltoHexadecimal(int n) {
        String hex = "";
        char hexrem[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        while (n > 0) {
            int rem = n % 16;
            hex = hexrem[rem] + hex;
            n = n / 16;
        }
        System.out.println("After the conversion from decimal to hexadecimal the result is ");
        System.out.println(hex);
    }
}

class BaseConversion {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Base b = new Base();
        int n;
        System.out.println("Enter the number to convert decimal to binary");
        n = s.nextInt();
        b.DecimaltoBinary(n);
        System.out.println("Enter the number to convert decimal to octal");
        n = s.nextInt();
        b.DecimaltoOctal(n);
        System.out.println("Enter the number to convert decimal to hexadecimal");
        n = s.nextInt();
        b.DecimaltoHexadecimal(n);
    }
}
