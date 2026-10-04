import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] result = new int[n];
        int size = 0;
        for (int i = 0; i < n; i++) {
            boolean exists = false;
            for (int j = 0; j < size; j++) {
                if (result[j] == a[i]) {
                    exists = true;
                }
            }
            if (!exists) {
                result[size] = a[i];
                size++;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
