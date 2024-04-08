import java.util.ArrayList;

public class Bookshelf {
   private String shelfName;

   private ArrayList<Book> Bookshelf = new ArrayList<Book>();

   public Bookshelf(String name) {
      this.shelfName = name;
   }

   public void booksNumber() {
      System.out.println(Bookshelf.size());
   }

   public void addBook(Book book) {
      Bookshelf.add(book);
      System.out.println("The book " + book.getTitle() + " has been added successfully");
   }

   public void removeBook(Book book) {
      Bookshelf.remove(book);
      System.out.println("The book " + book.getTitle() + " has been removed");
   }

   public void displayTitles() {
      for (Book book : Bookshelf) {
         System.out.println(book.getTitle());
      }
   }

}
