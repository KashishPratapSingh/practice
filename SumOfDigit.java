import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println(sumOfDigit(n));
    }
    public static int sumOfDigit(int n) {
        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            sum += (int) Math.pow(d, 2);
            n /= 10;
        }
        return sum;
    }
}
