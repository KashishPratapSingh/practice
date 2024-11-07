import java.util.Scanner;

public class NarcissisticNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        armstrongChecker(n);
    }
    public static void armstrongChecker(int n){
//        Narcissistic number and armstrong are same
        int sum=0;
        int s=n;
        String a=Integer.toString(n);
        int m=a.length();
        while(n!=0){
            int d=n%10;
            sum+=(int) Math.pow(d,m);
            n/=10;
        }
        if(sum==s){
            System.out.println("Number is Narcissistic Number: "+sum);
        }
        else{
            System.out.println("Number is not Narcissistic Number: "+sum);
        }
    }
}
