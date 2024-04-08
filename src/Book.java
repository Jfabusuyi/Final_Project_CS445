import java.util.ArrayList;
import java.util.List;
//Random not needed for actual implementation, just used to simulate search method
import java.util.Random;

public class Book {

    // In the actual implementation, this class would include a File pdf variable
    private String title;
    private String author;
    private String tag;
    private int totalPages;
    private int currentPage;

    // Allows all annotation methods to be used through the book
    protected Annotations annotation;
    protected Bookmarks bookmarks;
    protected List<PostIt> postIts;

    public Book(String title, String author, String tag, int totalPages) {
        this.title = title;
        this.author = author;
        this.tag = tag;
        this.totalPages = totalPages;
        this.currentPage = 1;
        this.annotation = new Annotations();
        this.bookmarks = new Bookmarks();
        this.postIts = new ArrayList<>();
    }

    public void bookInfo() {
        String info = "Book title: " + title + "\nAuthor: " + author + "\nTag: " + tag;
        System.out.println(info);
    }

    // Getters & Setters
    public String getTag() {
        return this.tag;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    // Page scrolling methods
    public void pageScroll(int page) {
        this.currentPage = page;
        System.out.println("The page has been scrolled, you are now on page: " + currentPage);
    }

    public void turnPageL() {
        this.currentPage--;
        System.out.println("You are now on page: " + currentPage);
    }

    public void turnPageR() {
        this.currentPage++;
        System.out.println("You are now on page: " + currentPage);
    }

    public void gotoPage(int page) {
        this.currentPage = page;
        System.out.println("You are now on page: " + currentPage);
    }

    public void goToBookmark(int page) {
        if (bookmarks.containsBookmark(page)) {
            currentPage = page;
            System.out.println("Navigated to bookmarked page: " + currentPage);
        } else {
            System.out.println("Bookmark not found.");
        }
    }

    // Searches for page with word that is searched
    public void wordSearch(String search) {
        Random random = new Random();
        int randomPage = random.nextInt(totalPages) + 1;
        System.out.println("Word found on " + randomPage);
    }

}