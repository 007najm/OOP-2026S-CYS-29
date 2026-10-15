import java.util.Random;
import java.util.Scanner;

class Walker {
    String name;
    int x;
    int y;

    Walker(String name) {
        this.name = name;
        x = 0;
        y = 0;
    }

    static boolean isObstacle(int x, int y) {
        return (x == 1 && y == 2) || (x == 2 && y == 0) || (x == -1 && y == 1) || (x == 0 && y == -3);
    }

    void move(int dx, int dy) {
        int newX = x + dx;
        int newY = y + dy;
        if (isObstacle(newX, newY)) {
            System.out.println(name + " encounters hurdle at (" + newX + ":" + newY + ")");
        } else {
            x = newX;
            y = newY;
        }
    }

    void show() {
        System.out.println(name + " is at = (" + x + " : " + y + ")");
    }
}

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        Walker ali = new Walker("Ali");
        Walker hasan = new Walker("Hasan");

        System.out.println("Starting: Ali's Location is = (0 : 0) Hasan's Location is = (0 : 0)");
        System.out.println("Hasan has Random Movement, Ali follows order");
        System.out.println("Moves: ^ up, v down, < left, > right, q quit");

        while (true) {
            System.out.print("Ali: Where should i go now: ");
            char c = sc.next().charAt(0);
            if (c == 'q') {
                break;
            }
            int dx = 0;
            int dy = 0;
            if (c == '^') {
                dy = 1;
            } else if (c == 'v') {
                dy = -1;
            } else if (c == '<') {
                dx = -1;
            } else if (c == '>') {
                dx = 1;
            } else {
                System.out.println("Invalid move");
                continue;
            }
            ali.move(dx, dy);
            ali.show();

            int d = random.nextInt(4);
            dx = 0;
            dy = 0;
            if (d == 0) {
                dy = 1;
            } else if (d == 1) {
                dy = -1;
            } else if (d == 2) {
                dx = -1;
            } else {
                dx = 1;
            }
            hasan.move(dx, dy);
            hasan.show();
        }
    }
}
