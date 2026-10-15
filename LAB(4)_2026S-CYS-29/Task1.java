class JTime {
    int hour;
    int minute;
    int second;

    JTime() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    JTime(int h, int m) {
        hour = h;
        minute = m;
        second = 0;
    }

    JTime(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }

    JTime(int totalSeconds) {
        totalSeconds = totalSeconds % 86400;
        hour = totalSeconds / 3600;
        minute = totalSeconds % 3600 / 60;
        second = totalSeconds % 60;
    }

    int toSeconds() {
        return hour * 3600 + minute * 60 + second;
    }

    int elapsedSeconds(JTime other) {
        int diff = other.toSeconds() - toSeconds();
        if (diff < 0) {
            diff = -diff;
        }
        return diff;
    }

    JTime elapsedTime(JTime other) {
        return new JTime(elapsedSeconds(other));
    }

    void display() {
        System.out.println(String.format("%02d:%02d:%02d", hour, minute, second));
    }
}

public class Task1 {
    public static void main(String[] args) {
        JTime t1 = new JTime(2, 30, 15);
        JTime t2 = new JTime(5, 45, 50);

        System.out.print("Time 1: ");
        t1.display();
        System.out.print("Time 2: ");
        t2.display();

        System.out.println("Elapsed seconds: " + t1.elapsedSeconds(t2));

        JTime diff = t1.elapsedTime(t2);
        System.out.print("Elapsed time: ");
        diff.display();

        JTime t3 = new JTime(3661);
        System.out.print("Time from 3661 seconds: ");
        t3.display();

        JTime t4 = new JTime();
        System.out.print("Default time: ");
        t4.display();

        JTime t5 = new JTime(7, 20);
        System.out.print("Time with hour and minute: ");
        t5.display();
    }
}
