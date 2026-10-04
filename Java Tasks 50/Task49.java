class Book {
    String title;
    boolean issued;

    Book(String title) {
        this.title = title;
        this.issued = false;
    }
}

class Member {
    String name;
    Book[] borrowed = new Book[3];
    int count = 0;

    Member(String name) {
        this.name = name;
    }
}

class Library {
    Book[] books;

    Library(Book[] books) {
        this.books = books;
    }

    void borrowBook(Member m, Book b) {
        if (b.issued) {
            System.out.println(m.name + " cannot borrow " + b.title + ", already issued");
        } else if (m.count == 3) {
            System.out.println(m.name + " cannot borrow " + b.title + ", limit of 3 reached");
        } else {
            b.issued = true;
            m.borrowed[m.count] = b;
            m.count++;
            System.out.println(m.name + " borrowed " + b.title);
        }
    }

    void returnBook(Member m, Book b) {
        int index = -1;
        for (int i = 0; i < m.count; i++) {
            if (m.borrowed[i] == b) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println(m.name + " does not have " + b.title);
        } else {
            for (int i = index; i < m.count - 1; i++) {
                m.borrowed[i] = m.borrowed[i + 1];
            }
            m.borrowed[m.count - 1] = null;
            m.count--;
            b.issued = false;
            System.out.println(m.name + " returned " + b.title);
        }
    }

    void status(Member m1, Member m2) {
        System.out.println("Status:");
        for (int i = 0; i < books.length; i++) {
            if (books[i].issued) {
                System.out.println("  " + books[i].title + " - Issued");
            } else {
                System.out.println("  " + books[i].title + " - Available");
            }
        }
        System.out.println("  " + m1.name + " has " + m1.count + " book(s)");
        System.out.println("  " + m2.name + " has " + m2.count + " book(s)");
    }
}

public class Task49 {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics");
        Book b2 = new Book("Data Structures");
        Book b3 = new Book("Networks");
        Book b4 = new Book("Security");
        Book b5 = new Book("Algorithms");
        Library lib = new Library(new Book[]{b1, b2, b3, b4, b5});
        Member ali = new Member("Ali");
        Member sara = new Member("Sara");

        lib.borrowBook(ali, b1);
        lib.status(ali, sara);
        lib.borrowBook(sara, b1);
        lib.status(ali, sara);
        lib.borrowBook(ali, b2);
        lib.borrowBook(ali, b3);
        lib.borrowBook(ali, b4);
        lib.status(ali, sara);
        lib.returnBook(ali, b1);
        lib.status(ali, sara);
        lib.borrowBook(sara, b1);
        lib.returnBook(sara, b5);
        lib.status(ali, sara);
    }
}
