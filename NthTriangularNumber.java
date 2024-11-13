import java.util.Scanner;

public class NthTriangularNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        triangularNumber(n);
    }

    public static void triangularNumber(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.print(sum);
    }
}
