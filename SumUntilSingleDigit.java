import java.util.Scanner;

public class SumUntilSingleDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        sumUntilSingleDigit(n);
    }

    public static void sumUntilSingleDigit(int n) {
        int sum = 0;
        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        System.out.print(sum);
    }
}
