class Money {
    private final int amount;

    Money(int amount) {
        this.amount = amount;
    }

    int getAmount() {
        return amount;
    }

    Money add(Money other) {
        return new Money(amount + other.amount);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Money)) {
            return false;
        }
        Money m = (Money) o;
        return amount == m.amount;
    }

    public int hashCode() {
        return amount;
    }
}

public class Task37 {
    public static void main(String[] args) {
        Money m1 = new Money(50);
        Money m2 = new Money(50);
        Money m3 = m1.add(m2);

        System.out.println("m1: " + m1.getAmount());
        System.out.println("m2: " + m2.getAmount());
        System.out.println("m3 (m1 + m2): " + m3.getAmount());
        System.out.println("m1 unchanged: " + m1.getAmount());

        System.out.println("m1 == m2: " + (m1 == m2));
        System.out.println("m1.equals(m2): " + m1.equals(m2));
        System.out.println("Same hashCode: " + (m1.hashCode() == m2.hashCode()));
    }
}
