import java.util.Scanner;

public class MedianOfAnArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        medianOfArray(arr);
    }
    public static void medianOfArray(int[] arr){
        int sum=0;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        double a=(double) sum/n;
        System.out.println("Median of Array: "+a);
    }
}
