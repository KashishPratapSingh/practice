import java.util.Scanner;

public class PerfectSquareRoot {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        if(squareRoot(n)){
            System.out.println("Number is Perfect Square root");
        }
        else{
            System.out.println("Number is not Perfect Sqaure Root");
        }
    }

    public static boolean squareRoot(int n) {
        if(n>=0){
            int sr=(int) Math.sqrt(n);
            return (sr*sr==n);
        }
        return false;
    }
}
