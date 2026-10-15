import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter odd n: ");
        int n = sc.nextInt();
        int mid = n / 2;
        for (int i = 0; i < n; i++) {
            int d = Math.abs(i - mid);
            for (int j = 0; j < n; j++) {
                if (j == d || j == n - 1 - d) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
