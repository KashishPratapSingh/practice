import java.util.Scanner;

public class GeneratingMultiplicationTable {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=scn.nextInt();
        generatingMultiplicationTable(n);
    }

    public static void generatingMultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
