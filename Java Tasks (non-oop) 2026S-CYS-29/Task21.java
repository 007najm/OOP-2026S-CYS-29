public class Task21 {
    static int count = 0;

    static double power(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        double half = power(x, n / 2);
        count++;
        double result = half * half;
        if (n % 2 == 1) {
            result = result * x;
            count++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("2^10 = " + power(2, 10));
        count = 0;
        double r = power(2, 30);
        System.out.println("2^30 = " + r);
        System.out.println("Multiplications for n = 30: " + count);
    }
}
