import java.util.Scanner;

public class FindingSumOfFactorialNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        findSumOfFactorialNumber(n);
    }

    public static void findSumOfFactorialNumber(int n) {
        int fact = 1;
        int s = 0;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            s = fact;
        }
        System.out.println("Factorial of Number: "+fact);
        int sum = 0;
        while (s != 0) {
            int d = s % 10;
            sum += d;
            s /= 10;
        }
        System.out.println("Sum of the digit: "+sum);
    }
}
