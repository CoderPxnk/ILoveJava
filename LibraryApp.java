// 1. The Blueprint Class (Defines what a Book is)
class Book 
{
    // Instance variables (the data)
    String title;
    String author;
    boolean isCheckedOut;

    // Constructor (sets up the book when created)
    public Book(String title, String author) 
    {
        this.title = title;
        this.author = author;
        this.isCheckedOut = false;
    }

    // Method (behavior of a book)
    public void displayInfo() {
        String status = isCheckedOut ? "Checked Out" : "Available";
        System.out.println(title + " by " + author + " [" + status + "]");
    }
}

// 2. The Execution Class (Where the program runs)
public class LibraryApp {
    public static void main(String[] args) {
        // Creating objects from the Book class
        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien");
        Book book2 = new Book("1984", "George Orwell");

        // Using the objects' methods
        System.out.println("--- Library Inventory ---");
        book1.displayInfo();
        book2.displayInfo();

        // Modifying state
        System.out.println("\n--- Checking out 'The Hobbit' ---");
        book1.isCheckedOut = true;
        book1.displayInfo();
    }
}