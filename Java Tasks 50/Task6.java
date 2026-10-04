import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.print("-");
            n = -n;
        }
        do {
            System.out.print(n % 10);
            n = n / 10;
        } while (n > 0);
        System.out.println();
    }
}
