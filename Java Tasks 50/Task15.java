import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        if (n > 0) {
            k = k % n;
            if (k < 0) {
                k = k + n;
            }
            for (int times = 0; times < k; times++) {
                int first = a[0];
                for (int i = 0; i < n - 1; i++) {
                    a[i] = a[i + 1];
                }
                a[n - 1] = first;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
