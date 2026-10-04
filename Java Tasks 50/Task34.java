class A {
    static {
        System.out.println("A static block");
    }

    {
        System.out.println("A instance block");
    }

    A() {
        System.out.println("A constructor");
    }
}

class B extends A {
    static {
        System.out.println("B static block");
    }

    {
        System.out.println("B instance block");
    }

    B() {
        System.out.println("B constructor");
    }
}

public class Task34 {
    public static void main(String[] args) {
        System.out.println("First object");
        new B();
        System.out.println("Second object");
        new B();
    }
}
