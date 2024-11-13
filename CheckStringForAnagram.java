import java.util.Arrays;
import java.util.Scanner;

public class CheckStringForAnagram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s=scn.next();
        String s1=scn.next();
        if(stringAnagram(s,s1)){
            System.out.println("Both are anagram");
        }
        else{
            System.out.println("Not anagram");
        }
    }

    public static boolean stringAnagram(String s, String s1) {
        char[] c = s.toCharArray();
        char[] c1 = s1.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);
        return Arrays.equals(c, c1);
    }
}
