import java.util.*;

class Transpose {
    public static void main(String args[]) {
        int a[][] = new int[10][10];
        int i, j, r, c, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter rows and columns of the square matrix");
        r = s.nextInt();
        c = s.nextInt();
        System.out.println("Enter the elements to matrix");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("Entered matrix is ");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("\n");
        }
        System.out.println("Trace of given matrix is ");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                if (i == j)
                    sum = sum + a[i][j];
            }
        }
        System.out.println(sum);
        System.out.println("Transpose of given matrix is");
        for (i = 0; i < c; i++) {
            for (j = 0; j < r; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}
