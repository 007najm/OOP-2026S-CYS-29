import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Your name: ");
        String name = sc.nextLine();

        System.out.print("Your age: ");
        int age = sc.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        sc.close();
    }
}