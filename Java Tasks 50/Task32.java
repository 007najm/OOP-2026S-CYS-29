import java.util.Scanner;

class Stack {
    char[] data;
    int top;

    Stack(int size) {
        data = new char[size];
        top = -1;
    }

    void push(char c) {
        if (top == data.length - 1) {
            System.out.println("Stack overflow");
            return;
        }
        top++;
        data[top] = c;
    }

    char pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return ' ';
        }
        char c = data[top];
        top--;
        return c;
    }

    char peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return ' ';
        }
        return data[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class Task32 {
    static boolean isBalanced(String s) {
        Stack st = new Stack(s.length() + 1);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (st.isEmpty()) {
                    return false;
                }
                char open = st.pop();
                if (c == ')' && open != '(') {
                    return false;
                }
                if (c == '}' && open != '{') {
                    return false;
                }
                if (c == ']' && open != '[') {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Stack small = new Stack(2);
        small.push('a');
        small.push('b');
        small.push('c');
        System.out.println("Peek: " + small.peek());
        small.pop();
        small.pop();
        small.pop();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter brackets: ");
        String s = sc.nextLine();
        if (isBalanced(s)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not balanced");
        }
    }
}
