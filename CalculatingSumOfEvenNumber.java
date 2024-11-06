import java.util.Scanner;

public class CalculatingSumOfEvenNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        sumOfEvenNumbers(n);
    }

    public static void sumOfEvenNumbers(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
                sum = sum + i;
            }
        }
        System.out.println("\nSum of Even Numbers is: " + sum);
    }
}
