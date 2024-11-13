import java.util.Scanner;

public class SumOfPrimeNumbersInARange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        sumOfPrimeNumbers(n);
    }

    public static void sumOfPrimeNumbers(int n) {
        int sum = 0;
//        int count = 0; If i initialize count variable here it will not reset it to zero and the value of count increase above 2.
        for (int i = 0; i <= n; i++) {
            int count=0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                sum+=i;
            }
        }
        System.out.print("Sum of prime numbers: "+sum);
    }
}
