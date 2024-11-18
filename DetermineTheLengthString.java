import java.util.Scanner;

public class DetermineTheLengthString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s=scn.next();
        lengthString(s);
    }

//    public static void lengthString(String s) {
//        char[] a = s.toCharArray();
//        int count = 0;
//        for (int i = 0; i < a.length; i++) {
//            count++;
//        }
//        System.out.println(count);
//    }
    public static void lengthString(String s){
        int a=s.length();
        System.out.println(a);
    }
}
