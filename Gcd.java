import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
//        greatestCommonDivisor(a,b);
        System.out.println(euclideanAlgorithm(a,b));
    }
//    public static void greatestCommonDivisor(int a, int b){
//        int result=Math.min(a,b);
//        while(result>0){
//            if(a%result==0 && b%result==0){
//                break;
//            }
//            result--;
//        }
//        System.out.println(result);
//    } This naive Approach
    public static int euclideanAlgorithm(int a, int b){
        if(a==0)
            return b;

        if(b==0)
            return a;

        if(a==b)
            return b;

        if(a>b)
            return euclideanAlgorithm(a-b,b);
        return euclideanAlgorithm(a,b-a);
    }
}
