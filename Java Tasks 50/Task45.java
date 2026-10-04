public class Task45 {
    interface A {
        default void hello() {
            System.out.println("Hello from A");
        }
    }

    interface B {
        default void hello() {
            System.out.println("Hello from B");
        }
    }

    static class C implements A, B {
        public void hello() {
            A.super.hello();
            B.super.hello();
            System.out.println("Hello from C");
        }
    }

    public static void main(String[] args) {
        C c = new C();
        c.hello();
    }
}
