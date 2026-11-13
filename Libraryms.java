
import java.util.*;

public class Libraryms {

    static TreeMap<Integer, String> books = new TreeMap<>();
    static TreeMap<Integer, String> issued = new TreeMap<>();
    static ArrayList<String> history = new ArrayList<>();

    static void addBook(int id, String name) {
        if (books.containsKey(id))
            System.out.println("Duplicate ID not allowed!");
        else
            books.put(id, name);
    }
    static void issueBook(int id, String student) {
        if (!books.containsKey(id))
            System.out.println("Book not found!");
        else if (issued.containsKey(id))
            System.out.println("Already issued!");
        else {
            issued.put(id, student);
            history.add(id + " - " + books.get(id)
                    + " - " + student + " - Issued");
            System.out.println("Book issued!");
        }
    }
    static void returnBook(int id) {
        if (issued.containsKey(id)) {
            String student = issued.remove(id);
            history.add(id + " - " + books.get(id)
                    + " - " + student + " - Returned");
            System.out.println("Book returned!");
        } else {
            System.out.println("Book not issued!");
        }
    }
    static void displayBooks() {
        for (int id : books.keySet()) {
            if (!issued.containsKey(id))
                System.out.println(id + " - " + books.get(id));
        }
    }
    static void displayHistory() {
        for (String h : history)
            System.out.println(h);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++)
            addBook(100 + i, "Book " + i);
        int ch, id;

        do {
            System.out.println("\n1.Add Book  2.Issue Book");
            System.out.println("3.Return Book  4.Available Books");
            System.out.println("5.Issue History  6.Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Book ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Book Name: ");
                    addBook(id, sc.nextLine());
                    break;
                case 2:
                    System.out.print("Book ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Student Name: ");
                    issueBook(id, sc.nextLine());
                    break;
                case 3:
                    System.out.print("Book ID: ");
                    returnBook(sc.nextInt());
                    break;
                case 4:
                    displayBooks();
                    break;
                case 5:
                    displayHistory();
                    break;
            }
        } while (ch != 6);
        sc.close();
    }
}
