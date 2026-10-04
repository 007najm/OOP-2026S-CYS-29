class Pair<K, V> {
    K key;
    V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    void show() {
        System.out.println("Key: " + key + ", Value: " + value);
    }
}

public class Task47 {
    static class Student implements Comparable<Student> {
        String name;
        int marks;

        Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        public int compareTo(Student other) {
            return marks - other.marks;
        }

        public String toString() {
            return name + " (" + marks + ")";
        }
    }

    static <T extends Comparable<T>> T max(T[] arr) {
        T m = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(m) > 0) {
                m = arr[i];
            }
        }
        return m;
    }

    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<String, Integer>("age", 20);
        p.show();

        Integer[] nums = {5, 12, 3, 9};
        String[] words = {"apple", "mango", "banana"};
        Student[] students = {new Student("Ali", 70), new Student("Sara", 95), new Student("Ahmed", 60)};

        System.out.println("Max integer: " + max(nums));
        System.out.println("Max string: " + max(words));
        System.out.println("Max student: " + max(students));
    }
}
