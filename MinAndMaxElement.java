import java.util.Scanner;

public class MinAndMaxElement {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        minAndMaxElement(arr);
    }
    public static void minAndMaxElement(int[] arr){
        int max=0;
        int min=0;
        for(int i=0;i<arr.length;i++){
            max=arr[0];
            min=arr[0];
            for(int j=1;j<arr.length;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
                if(arr[j]<min){
                    min=arr[j];
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Largest: "+max);
        System.out.println("Smallest: "+min);
    }
}
