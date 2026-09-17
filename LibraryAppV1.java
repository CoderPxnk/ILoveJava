import java.util.Scanner;

class Book
{
    String title;
    String author;
    boolean isCheckedOut;
    
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
        this.isCheckedOut = false;
    }
    
    public void displayInfo()
    {
        String status = isCheckedOut ? "Checked Out" : "Available";
        System.out.println(title + " by " + author + " is " + status);
    }
    
}

public class LibraryAppV1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Book book1 = new Book("Animal Farm", "George Orwell");
        Book book2 = new Book("1984", "George Orwell");
        
        System.out.print("The status of the books in library is:\n");
        book1.displayInfo();
        book2.displayInfo();
        
        System.out.print("Which book would you like to check out? ");
        String userChoice = scanner.nextLine();
        
        if (!userChoice.equalsIgnoreCase(book1.title))
        {
            
        }
        else {
            System.out.println("You have checked out " + book1.title);
        }
        scanner.close();
    }
}




