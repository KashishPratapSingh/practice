import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.next();
        String a=s;
        StringBuilder s1=new StringBuilder(s);
        s1.reverse();
        if(s1.toString().equals(a)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
