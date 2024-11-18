import java.util.Scanner;

public class MostFrequencyOfNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        mostFrequencyOfNumber(arr);
    }
    public static void mostFrequencyOfNumber(int[] arr){
        int count=0;
        int n=arr.length;
        int freq=0;
        for(int i=0;i<arr.length;i++){
            freq=arr[i];
            for(int j=1;j<arr.length;j++){
                if(freq!=arr[j]){
                    count++;
                }
            }
        }
        int a=n-count;
        System.out.println(n);
    }
}
