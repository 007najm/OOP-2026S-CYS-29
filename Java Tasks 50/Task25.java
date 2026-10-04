import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int[] count = new int[65536];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        String answer = "none";
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] == 1) {
                answer = "" + s.charAt(i);
                break;
            }
        }
        System.out.println(answer);
    }
}
