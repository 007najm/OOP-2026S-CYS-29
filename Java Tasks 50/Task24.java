import java.util.Scanner;

class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distanceTo(Point p) {
        double dx = x - p.x;
        double dy = y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

public class Task24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point[] p = new Point[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter x and y of point " + (i + 1) + ": ");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            p[i] = new Point(x, y);
        }
        double a = p[0].distanceTo(p[1]);
        double b = p[1].distanceTo(p[2]);
        double c = p[0].distanceTo(p[2]);

        boolean right = false;
        if (a > 0 && b > 0 && c > 0) {
            if (Math.abs(a * a + b * b - c * c) < 0.0001) {
                right = true;
            }
            if (Math.abs(a * a + c * c - b * b) < 0.0001) {
                right = true;
            }
            if (Math.abs(b * b + c * c - a * a) < 0.0001) {
                right = true;
            }
        }
        if (right) {
            System.out.println("Right-angled triangle");
        } else {
            System.out.println("Not a right-angled triangle");
        }
    }
}
