import java.util.Map;
import java.util.HashMap;



class Book
{
    String title;
    String author;
    boolean inStock;
    
    public Book(String title, String author)
    {
    this.title = title;
    this.author = author;
    this.inStock = true;
    }
    
    public String toString()
    {
        return title + " by " + author + " (In Stock: " + inStock + ")";
    }
}

public class LibraryAppV2
        
{
public static void main(String[] args)
{
    Map<String, Book> libraryInventory = new HashMap<>();
    
    libraryInventory.put("Animal Farm",new Book ("Animal Farm", "George Orwell"));
    
    System.out.println(libraryInventory.get("Animal Farm"));
}

}

    

