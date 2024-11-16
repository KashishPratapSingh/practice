import java.util.Scanner;

public class FindingAllDivisorsOfNumbers {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        findingAllDivisorOfANumbers(n);
    }
    public static void findingAllDivisorOfANumbers(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
