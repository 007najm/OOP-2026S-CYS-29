import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int best = 0;
        int bestStart = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean[] seen = new boolean[65536];
            int j = i;
            while (j < s.length() && !seen[s.charAt(j)]) {
                seen[s.charAt(j)] = true;
                j++;
            }
            if (j - i > best) {
                best = j - i;
                bestStart = i;
            }
        }
        System.out.println("Substring: " + s.substring(bestStart, bestStart + best));
        System.out.println("Length: " + best);
    }
}
