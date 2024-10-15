import java.util.Scanner;

public class CountVowelsAndConsonant {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String a=scn.next();
        countVowelsConsonant(a);
    }
    public static void countVowelsConsonant(String a){
        int count=0;
        int count1=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
                count++;
            }
            else{
                count1++;
            }
        }
        System.out.println(count);
        System.out.println(count1);
    }
}
