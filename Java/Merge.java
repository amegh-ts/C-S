import java.util.*;

class Merge {
    public static void main(String args[]) {
        int m, n, i, count = 0;
        int a[] = new int[20];
        int b[] = new int[30];
        int c[] = new int[40];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of 1st array");
        m = s.nextInt();
        System.out.println("Enter the size of 2nd array");
        n = s.nextInt();
        System.out.println("Enter the elements of 1st array");
        for (i = 0; i < m; i++) {
            a[i] = s.nextInt();
            c[i] = a[i];
            count++;
        }
        System.out.println("Enter the elements of 2nd array");
        for (i = 0; i < n; i++) {
            b[i] = s.nextInt();
            c[count++] = b[i];
        }
        System.out.println("The merged array");
        for (i = 0; i < m + n; i++) {
            System.out.println(c[i] + "");
        }
    }
}
