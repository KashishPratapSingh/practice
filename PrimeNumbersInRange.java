import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int start = scn.nextInt();
        int end = scn.nextInt();
        primeNumber(start, end);
    }

    public static void primeNumber(int start, int end) {
        for (int i = start; i <= end; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(i+" ");
            }
        }
    }


}
