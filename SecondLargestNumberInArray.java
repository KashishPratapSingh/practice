import java.util.Scanner;

public class SecondLargestNumberInArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        secondLargest(arr);
    }
    public static void secondLargest(int[] arr){
        int sum=0;
        int s=0;
        for(int i=0;i<arr.length;i++){
            s=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[s]){
                    s=j;
                }
            }
            int temp=arr[s];
            arr[s]=arr[i];
            arr[i]=temp;
        }
        int n=arr.length;
        System.out.print(arr[n-2]);
    }
}
