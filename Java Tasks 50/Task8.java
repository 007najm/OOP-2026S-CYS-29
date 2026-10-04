class Counter {
    static int total = 0;
    int count = 0;

    Counter() {
        total++;
    }

    void increment() {
        count++;
    }
}

public class Task8 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        c1.increment();
        c1.increment();

        c2.increment();
        c2.increment();
        c2.increment();
        c2.increment();
        c2.increment();

        c3.increment();

        System.out.println("Objects created: " + Counter.total);
        System.out.println("c1 incremented: " + c1.count);
        System.out.println("c2 incremented: " + c2.count);
        System.out.println("c3 incremented: " + c3.count);
    }
}
