import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        primeCheckers(n);
    }
    static void primeCheckers(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
