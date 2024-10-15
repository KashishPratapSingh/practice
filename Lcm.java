import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        System.out.println(leastCommonMultiplication(a,b));
    }

    public static int greatestCommonDivisor(int a, int b) {
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result;
    }

    public static int leastCommonMultiplication(int a, int b) {
        return(a/greatestCommonDivisor(a,b)*b);
    }
}
