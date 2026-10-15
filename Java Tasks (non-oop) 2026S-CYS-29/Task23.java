import java.util.Scanner;

public class Task23 {
    static String loopBinary(int n) {
        if (n == 0) {
            return "0";
        }
        String s = "";
        while (n > 0) {
            s = (n % 2) + s;
            n = n / 2;
        }
        return s;
    }

    static String recursiveBinary(int n) {
        if (n < 2) {
            return "" + n;
        }
        return recursiveBinary(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Loop: " + loopBinary(n));
        System.out.println("Recursion: " + recursiveBinary(n));
    }
}
