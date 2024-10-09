import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        starPattern(n);
    }
    public static void starPattern(int n){
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
          for(int i=0;i<n;i++){
              for(int j=0;j<2*(n-i)-1;j++){
                  System.out.print(" ");
              }
              for(int k=0;k<2*i+1;k++){
                  System.out.print("* ");
              }
              System.out.println();
          }
    }
}
