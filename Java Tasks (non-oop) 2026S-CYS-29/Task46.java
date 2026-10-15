public class Task46 {
    static void kadane(int[] a) {
        int best = a[0];
        int current = a[0];
        int start = 0;
        int end = 0;
        int tempStart = 0;
        for (int i = 1; i < a.length; i++) {
            if (current < 0) {
                current = a[i];
                tempStart = i;
            } else {
                current = current + a[i];
            }
            if (current > best) {
                best = current;
                start = tempStart;
                end = i;
            }
        }
        System.out.println("Max sum: " + best + ", start index: " + start + ", end index: " + end);
    }

    public static void main(String[] args) {
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] b = {-8, -3, -6, -2, -5};
        kadane(a);
        kadane(b);
    }
}
