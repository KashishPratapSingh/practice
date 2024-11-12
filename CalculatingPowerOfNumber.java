import java.util.Scanner;

public class CalculatingPowerOfNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        powerOfNumber(n,m);
    }
    public static void powerOfNumber(int n, int m){
        int a=(int) Math.pow(n,m);
        System.out.println(n+" power of "+m+" is "+a);
    }
}
