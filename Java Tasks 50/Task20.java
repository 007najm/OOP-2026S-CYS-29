abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return 3.14159 * radius * radius;
    }
}

class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double area() {
        return 0.5 * base * height;
    }
}

public class Task20 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(2);
        shapes[1] = new Triangle(4, 5);
        shapes[2] = new Circle(1);
        shapes[3] = new Triangle(3, 6);

        double total = 0;
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Shape " + (i + 1) + " area: " + shapes[i].area());
            total = total + shapes[i].area();
        }
        System.out.println("Total area: " + total);
    }
}
