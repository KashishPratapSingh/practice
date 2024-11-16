import java.util.Scanner;

public class CountOfSpecificDigit {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int s=scn.nextInt();
        int m=scn.nextInt();
        countOfSpecificDigit(s,m);
    }
    public static void countOfSpecificDigit(int n, int m){
        int count=0;
        while(n!=0){
            int d=n%10;
            if(d==m){
                count++;
            }
            n/=10;
        }
        System.out.println("count: "+count);
    }
}
