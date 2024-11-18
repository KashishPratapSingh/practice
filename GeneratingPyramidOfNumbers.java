import java.util.Scanner;

public class GeneratingPyramidOfNumbers {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        generatingPyramidOfNumbers(n);
    }
    public static void generatingPyramidOfNumbers(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
