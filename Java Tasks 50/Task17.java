class Student {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    double average() {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        return (double) sum / marks.length;
    }

    String grade() {
        double avg = average();
        if (avg >= 90) {
            return "A";
        } else if (avg >= 80) {
            return "B";
        } else if (avg >= 70) {
            return "C";
        } else if (avg >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}

public class Task17 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Ali", new int[]{80, 90, 85});
        students[1] = new Student("Sara", new int[]{95, 92, 98});
        students[2] = new Student("Ahmed", new int[]{60, 70, 65});

        Student topper = students[0];
        for (int i = 0; i < 3; i++) {
            System.out.println(students[i].name + " average: " + students[i].average() + " grade: " + students[i].grade());
            if (students[i].average() > topper.average()) {
                topper = students[i];
            }
        }
        System.out.println("Topper: " + topper.name);
    }
}
