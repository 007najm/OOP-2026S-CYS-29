class Calculator {
    int add(int a, int b) {
        System.out.println("add(int, int) called");
        return a + b;
    }

    double add(double a, double b) {
        System.out.println("add(double, double) called");
        return a + b;
    }

    int add(int a, int b, int c) {
        System.out.println("add(int, int, int) called");
        return a + b + c;
    }

    String add(String a, String b) {
        System.out.println("add(String, String) called");
        return a + b;
    }
}

public class Task27 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(5, 2));
        System.out.println(c.add(5, 2.5));
        System.out.println(c.add(1, 2, 3));
        System.out.println(c.add('a', 1));
        System.out.println(c.add("5", "2"));
    }
}
