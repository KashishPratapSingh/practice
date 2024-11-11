import java.util.Scanner;

public class MissingNumberInArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println(missingValue(arr,n+1));
    }
    public static int missingValue(int[] arr, int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        int actualSum=0;
        for(int num:arr){
            actualSum+=num;
        }
        return sum-actualSum;
    }
}
