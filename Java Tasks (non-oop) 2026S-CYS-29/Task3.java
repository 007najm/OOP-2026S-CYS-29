import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int median;
        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            median = a;
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            median = b;
        } else {
            median = c;
        }
        System.out.println("Middle number: " + median);
    }
}
