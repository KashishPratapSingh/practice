import java.util.Scanner;

public class CheckingForPerfectNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        if(checkNumberIsPerfect(n)){
            System.out.println("Number is Perfect");
        }
        else{
            System.out.println("Number is not perfect");
        }
    }
    public static boolean checkNumberIsPerfect(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum == n;
    }
}
