import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < 10; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        boolean found = false;
        int second = 0;
        for (int i = 0; i < 10; i++) {
            if (a[i] != max) {
                if (!found || a[i] > second) {
                    second = a[i];
                    found = true;
                }
            }
        }
        if (found) {
            System.out.println("Second largest: " + second);
        } else {
            System.out.println("No second largest");
        }
    }
}
