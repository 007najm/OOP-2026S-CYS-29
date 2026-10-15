import java.util.Scanner;

public class Task35 {
    static int steps;

    static int binarySearch(int[] a, int key) {
        steps = 0;
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            steps++;
            int mid = (lo + hi) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    static int firstOccurrence(int[] a, int key) {
        steps = 0;
        int lo = 0;
        int hi = a.length - 1;
        int result = -1;
        while (lo <= hi) {
            steps++;
            int mid = (lo + hi) / 2;
            if (a[mid] == key) {
                result = mid;
                hi = mid - 1;
            } else if (a[mid] < key) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 4, 4, 4, 7, 9, 12};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to search: ");
        int key = sc.nextInt();

        int index = binarySearch(a, key);
        System.out.println("Normal search index: " + index + ", steps: " + steps);

        index = firstOccurrence(a, key);
        System.out.println("First occurrence index: " + index + ", steps: " + steps);
    }
}
