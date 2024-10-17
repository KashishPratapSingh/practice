import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        twoDimensionalArray(arr);
    }
    public static void twoDimensionalArray(int[][] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if((i==0&&j==0)||(i==1&&j==1)||(i==2&&j==2)){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
