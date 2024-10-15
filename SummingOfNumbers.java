import java.util.Scanner;

public class SummingOfNumbers {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        sumOfNumber(n);
    }
    public static void sumOfNumber(int n){
        int sum=0;
        while(n!=0){
            int a=n%10;
            sum=sum+a;
            n/=10;
        }
        System.out.println(sum);
    }
}
