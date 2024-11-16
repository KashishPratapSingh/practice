import java.util.Scanner;

public class AverageNumberOfAnArray {
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
        int n=arr.length;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int avg=sum/n;
        System.out.println("avg = " + avg);
    }
}
