import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
//        fibonacciSeries(n);
        System.out.println(recursiveFibonacci(n));
    }

//    public static void fibonacciSeries(int n) {
//        if(n<1){
//            System.out.println("Invalid value");
//        }
//        if(n==1){
//            return;
//        }
//        int a=0;
//        System.out.print(a+" ");
//        int b=1;
//        System.out.print(b+" ");
//        for(int i=2;i<=n;i++){
//            int curr=a+b;
//            a=b;
//            b=curr;
//            System.out.print(curr+" ");
//        }
//    }
    public static int recursiveFibonacci(int n){
        if(n<=1){
            return n;
        }

        return recursiveFibonacci(n-1)+recursiveFibonacci(n-2);

    }
}
