import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a = sc.nextLine().toLowerCase();
        System.out.print("Enter second string: ");
        String b = sc.nextLine().toLowerCase();
        boolean anagram = true;
        if (a.length() != b.length()) {
            anagram = false;
        } else {
            int[] count = new int[65536];
            for (int i = 0; i < a.length(); i++) {
                count[a.charAt(i)]++;
                count[b.charAt(i)]--;
            }
            for (int i = 0; i < 65536; i++) {
                if (count[i] != 0) {
                    anagram = false;
                }
            }
        }
        System.out.println(anagram);
    }
}
