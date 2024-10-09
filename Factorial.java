import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        factorial(n);
    }
    public static void factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.print(fact);
    }
}
