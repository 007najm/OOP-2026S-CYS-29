import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] a = new int[n - 1];
        System.out.print("Enter the " + (n - 1) + " numbers: ");
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        int expected = n * (n + 1) / 2;
        System.out.println("Missing number: " + (expected - sum));
    }
}
