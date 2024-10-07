import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        armStrong(n);
    }
    static void armStrong(int n){
        int num=n;
        int sum =0;
        while(n!=0){
           int d=n%10;
           sum=sum+d*d*d;
           n/=10;
        }
        if(num==sum){
            System.out.println("Number is ArmStrong");
        }
        else{
            System.out.println("Number is not Armstrong");
        }
    }
}
