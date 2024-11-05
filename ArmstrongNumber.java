import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        armstrongNumber(n);
    }

    public static void armstrongNumber(int n) {

        for (int i = 1; i <= n; i++) {
            int sum = i;
            int s=0;
            int a = String.valueOf(i).length();
            while (sum > 0) {
                int d = sum % 10;
                s += (int) Math.pow(d, a);
                sum /= 10;
            }
            if (s == i) {
                System.out.println(s+ ": Number is Armstrong");
            }
        }
    }
}
