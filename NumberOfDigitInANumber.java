import java.util.Scanner;

public class NumberOfDigitInANumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        numberOfDigitInNumber(n);
    }
    public static void numberOfDigitInNumber(int n){
//      This is simple and convenient way to find number of digits in a Number:
//        We can use another one also
//      Like convert this number to String and find the length of a String;
        int count=0;
        while(n!=0){
            int d=n%10;
            n/=10;
            count++;
        }
        System.out.println(count);

//---------------------------------------------------------------------------------------------------------------



//        Using String method
//        String a=Integer.toString(n);
//        int b=a.length();
//        System.out.println(b);
    }
}
