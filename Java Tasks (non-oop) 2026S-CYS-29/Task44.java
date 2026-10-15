public class Task44 {
    static int n = 6;
    static int[] pos = new int[6];
    static int[] first = new int[6];
    static int count = 0;
    static boolean saved = false;

    static boolean safe(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (pos[i] == col || Math.abs(pos[i] - col) == row - i) {
                return false;
            }
        }
        return true;
    }

    static void solve(int row) {
        if (row == n) {
            count++;
            if (!saved) {
                for (int i = 0; i < n; i++) {
                    first[i] = pos[i];
                }
                saved = true;
            }
            return;
        }
        for (int col = 0; col < n; col++) {
            if (safe(row, col)) {
                pos[row] = col;
                solve(row + 1);
            }
        }
    }

    public static void main(String[] args) {
        solve(0);
        System.out.println("Total solutions: " + count);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (first[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
