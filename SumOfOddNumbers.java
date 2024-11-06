import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        sumOfOddNumbers(n);
    }

    public static void sumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i+" ");
                sum += i;
            }
        }
        System.out.println("\nSum of Odd numbers is: " + sum);
    }
}
