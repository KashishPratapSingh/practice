import java.util.Scanner;

public class CheckingNumberIsPalindromeOrNot {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        palindromeChecker(n);
    }
    public static void palindromeChecker(int n){
        int a=n;
        int sum=0;
        while(n!=0){
            int d=n%10;
            sum=d+(sum*10);
            n/=10;
        }
        if(sum==a){
            System.out.println("number is palindrome: "+ sum);
        }
        else{
            System.out.println("Number is not Palindrome: "+sum);
        }
    }
}
