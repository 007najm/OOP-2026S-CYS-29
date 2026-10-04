import java.util.Scanner;

public class Task28 {
    static String compress(String s) {
        String result = "";
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            int count = 0;
            while (i < s.length() && s.charAt(i) == c) {
                count++;
                i++;
            }
            result = result + c + count;
        }
        return result;
    }

    static String decompress(String s) {
        String result = "";
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            i++;
            int num = 0;
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                num = num * 10 + (s.charAt(i) - '0');
                i++;
            }
            for (int k = 0; k < num; k++) {
                result = result + c;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String compressed = compress(s);
        System.out.println("Compressed: " + compressed);
        System.out.println("Decompressed: " + decompress(compressed));
    }
}
