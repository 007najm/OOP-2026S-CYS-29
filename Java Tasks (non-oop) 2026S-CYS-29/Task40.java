import java.util.Scanner;

public class Task40 {
    static int moves = 0;

    static void hanoi(int n, char from, char to, char via) {
        if (n == 0) {
            return;
        }
        hanoi(n - 1, from, via, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        moves++;
        hanoi(n - 1, via, to, from);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();
        hanoi(n, 'A', 'C', 'B');
        int expected = 1;
        for (int i = 0; i < n; i++) {
            expected = expected * 2;
        }
        expected = expected - 1;
        System.out.println("Total moves: " + moves);
        System.out.println("2^n - 1 = " + expected);
        if (moves == expected) {
            System.out.println("Verified");
        } else {
            System.out.println("Not matching");
        }
    }
}
