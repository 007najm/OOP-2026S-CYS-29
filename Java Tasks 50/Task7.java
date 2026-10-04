import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n < 0) {
            n = -n;
        }
        while (n >= 10) {
            int sum = 0;
            while (n > 0) {
                sum = sum + n % 10;
                n = n / 10;
            }
            n = sum;
            System.out.println(n);
        }
        System.out.println("Final digit: " + n);
    }
}
