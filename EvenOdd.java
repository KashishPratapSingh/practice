import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        evenOdd(n);
    }
    static void evenOdd(int n){
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
