class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    double bonus;

    Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}

public class Task29 {
    public static void main(String[] args) {
        Employee[] list = new Employee[4];
        list[0] = new Employee("Ali", 30000);
        list[1] = new Manager("Sara", 50000, 15000);
        list[2] = new Employee("Ahmed", 35000);
        list[3] = new Manager("Zain", 60000, 20000);

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].name + " salary: " + list[i].calculateSalary());
        }
    }
}
