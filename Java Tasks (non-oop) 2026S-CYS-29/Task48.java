public class Task48 {
    static boolean isValid(int[][] g) {
        for (int i = 0; i < 9; i++) {
            boolean[] seen = new boolean[10];
            for (int j = 0; j < 9; j++) {
                int v = g[i][j];
                if (v < 1 || v > 9 || seen[v]) {
                    return false;
                }
                seen[v] = true;
            }
        }
        for (int j = 0; j < 9; j++) {
            boolean[] seen = new boolean[10];
            for (int i = 0; i < 9; i++) {
                int v = g[i][j];
                if (v < 1 || v > 9 || seen[v]) {
                    return false;
                }
                seen[v] = true;
            }
        }
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {
                boolean[] seen = new boolean[10];
                for (int i = boxRow; i < boxRow + 3; i++) {
                    for (int j = boxCol; j < boxCol + 3; j++) {
                        int v = g[i][j];
                        if (v < 1 || v > 9 || seen[v]) {
                            return false;
                        }
                        seen[v] = true;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] g = {
            {5, 3, 4, 6, 7, 8, 9, 1, 2},
            {6, 7, 2, 1, 9, 5, 3, 4, 8},
            {1, 9, 8, 3, 4, 2, 5, 6, 7},
            {8, 5, 9, 7, 6, 1, 4, 2, 3},
            {4, 2, 6, 8, 5, 3, 7, 9, 1},
            {7, 1, 3, 9, 2, 4, 8, 5, 6},
            {9, 6, 1, 5, 3, 7, 2, 8, 4},
            {2, 8, 7, 4, 1, 9, 6, 3, 5},
            {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };
        System.out.println("Grid 1 valid: " + isValid(g));
        g[0][0] = 3;
        System.out.println("Grid 2 valid: " + isValid(g));
    }
}
