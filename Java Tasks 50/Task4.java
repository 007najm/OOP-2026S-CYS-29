class Rectangle {
    int width;
    int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int area() {
        return width * height;
    }

    int perimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }
}

public class Task4 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(6, 6);

        System.out.println("R1 area: " + r1.area() + ", perimeter: " + r1.perimeter() + ", square: " + r1.isSquare());
        System.out.println("R2 area: " + r2.area() + ", perimeter: " + r2.perimeter() + ", square: " + r2.isSquare());

        if (r1.area() > r2.area()) {
            System.out.println("R1 has the larger area");
        } else if (r2.area() > r1.area()) {
            System.out.println("R2 has the larger area");
        } else {
            System.out.println("Both areas are equal");
        }
    }
}
