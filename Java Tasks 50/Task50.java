public class Task50 {
    public static void main(String[] args) {
        int[] digits = new int[100];
        digits[0] = 1;
        int size = 1;
        for (int i = 2; i <= 50; i++) {
            int carry = 0;
            for (int j = 0; j < size; j++) {
                int product = digits[j] * i + carry;
                digits[j] = product % 10;
                carry = product / 10;
            }
            while (carry > 0) {
                digits[size] = carry % 10;
                size++;
                carry = carry / 10;
            }
        }
        System.out.print("50! = ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }
}
