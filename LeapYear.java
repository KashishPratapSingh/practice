import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       int n=scn.nextInt();
       leapYear(n);
    }
    static void leapYear(int n){
        if(n%4==0 && n%400==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.print("Not Leap Year");
        }
    }
}
