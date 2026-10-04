class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton object created");
    }

    static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

class SafeSingleton {
    private static SafeSingleton instance;

    private SafeSingleton() {
        System.out.println("SafeSingleton object created");
    }

    static synchronized SafeSingleton getInstance() {
        if (instance == null) {
            instance = new SafeSingleton();
        }
        return instance;
    }
}

public class Task43 {
    public static void main(String[] args) {
        Singleton[] s = new Singleton[5];
        for (int i = 0; i < 5; i++) {
            s[i] = Singleton.getInstance();
        }
        boolean same = true;
        for (int i = 1; i < 5; i++) {
            if (s[i] != s[0]) {
                same = false;
            }
        }
        System.out.println("All 5 are the same object: " + same);

        SafeSingleton[] t = new SafeSingleton[5];
        for (int i = 0; i < 5; i++) {
            t[i] = SafeSingleton.getInstance();
        }
        same = true;
        for (int i = 1; i < 5; i++) {
            if (t[i] != t[0]) {
                same = false;
            }
        }
        System.out.println("All 5 safe ones are the same object: " + same);
    }
}
