public class App {
    public static void main(String[] args) {

        // Creating a bookshelf
        Bookshelf bookshelf = new Bookshelf("Favorite Books");

        // Creating three books
        Book book1 = new Book("Star Wars", "George Lucas", "Sci-Fi", 100);
        Book book2 = new Book("Metamorphosis", "Franz Kafka", "Absurd Fiction", 150);
        Book book3 = new Book("I have a Dream", "Martin Luther King Jr", "Autobiography", 200);

        // Adding books to the bookshelf
        bookshelf.addBook(book1);
        bookshelf.addBook(book2);
        bookshelf.addBook(book3);

        // Displaying the number of books in the bookshelf
        System.out.print("Number of books in the bookshelf: ");
        bookshelf.booksNumber();

        // Displaying the titles of books in the bookshelf
        System.out.println("Titles of books in the bookshelf:");
        bookshelf.displayTitles();

        // Removing a book from the bookshelf
        bookshelf.removeBook(book2);

        // Displaying the titles of books in the bookshelf after removal
        System.out.println("Titles of books in the bookshelf after removal:");
        bookshelf.displayTitles();

        // Displaying the number of books in the bookshelf after removal
        System.out.print("Number of books in the bookshelf after removal: ");
        bookshelf.booksNumber();

        // Bookshelf Methods Done
        // Book testing

        System.out.println();
        System.out.println("Book testing");
        // Creating a book
        Book book = new Book("Harry Potter", "J.K. Rowling", "Fantasy", 400);

        // Displaying book information
        System.out.println("Book Information:");
        book.bookInfo();

        // Turning pages
        System.out.println("\nTurning pages:");
        book.turnPageR(); // Turn to the next page
        book.turnPageR(); // Turn to the next page
        book.turnPageL(); // Turn back one page
        book.gotoPage(300); // Go to a specific page

        // Searching for a word
        System.out.println("\nSearching for a word:");
        book.wordSearch("magic");

        // Bookmarks Testing
        // Adding and displaying bookmarks
        System.out.println("\nAdding and displaying bookmarks:");
        book.bookmarks.addBookmark(50);
        book.bookmarks.addBookmark(100);
        book.bookmarks.displayBookmarks();
        book.bookmarks.removeBookmark(50);
        System.out.println("Removed page 50");
        book.bookmarks.displayBookmarks();

        // Annotations Testing
        System.out.println("\nTesting Annotations for Book: " + book.getTitle());
        Annotations annotations = book.annotation;

        annotations.changePen("red"); // Change pen color
        annotations.setPenWidth(2.0); // Set pen width
        annotations.setMarkerColor("blue"); // Set marker color
        annotations.setMarkerWidth(1.5); // Set marker width
        // Blank annotation
        System.out.println(
                "Current annotation for page " + book.getCurrentPage() + ": " + annotations.getAnnotation(book));
        annotations.addAnnotation(book, "This is an important note.");
        // Added annotation
        System.out.println(
                "Current annotation for page " + book.getCurrentPage() + ": " + annotations.getAnnotation(book));

        // Testing for PostIt

        System.out.println("\nTesting PostIt for Book: " + book.getTitle());
        PostIt postIt = new PostIt();
        postIt.setPageNumber(book.getCurrentPage()); // Set page number
        postIt.setNote("Remember to review this page."); // Set note
        postIt.setColor("Pink"); // Set color
        System.out.println("PostIt details: " + postIt);
        postIt.deletePostIt(); // Delete post-it
    }
}
