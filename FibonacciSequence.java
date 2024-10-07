import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        fibonacciSequence(n);
    }
    static void fibonacciSequence(int n){
        int a=0, b=1;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int next=a+b;
            a=b;
            b=next;
        }
    }
}
