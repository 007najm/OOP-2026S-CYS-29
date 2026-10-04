public class Task26 {
    public static void main(String[] args) {
        for (int n = 1; n <= 1000; n++) {
            int digits = 0;
            int temp = n;
            while (temp > 0) {
                digits++;
                temp = temp / 10;
            }
            int sum = 0;
            temp = n;
            while (temp > 0) {
                int d = temp % 10;
                int p = 1;
                for (int i = 0; i < digits; i++) {
                    p = p * d;
                }
                sum = sum + p;
                temp = temp / 10;
            }
            if (sum == n) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
}
