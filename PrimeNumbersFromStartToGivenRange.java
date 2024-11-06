import java.util.Scanner;

public class PrimeNumbersFromStartToGivenRange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        primeNumbersFromStartToGivenRange(n);
    }

    public static void primeNumbersFromStartToGivenRange(int n) {
        for (int i = 0; i <= n; i++) {
            int count=0;
            for(int j=1;j<=i;j++){
                if (i % j == 0) {
                    count++;
                }
            }
            if(count==2){
                System.out.print(i+" ");
            }
        }

    }
}
