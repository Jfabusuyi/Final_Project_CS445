import java.util.ArrayList;
import java.util.List;

public class Bookmarks {
    private List<Integer> bookmarks;

    public Bookmarks() {
        this.bookmarks = new ArrayList<>();
    }

    public void addBookmark(int page) {
        if (!bookmarks.contains(page)) {
            bookmarks.add(page);
            System.out.println("Bookmarked page " + page);
        } else {
            System.out.println("Page " + page + " is already bookmarked.");
        }
    }

    public void displayBookmarks() {
        System.out.println("Bookmarks:");
        for (int bookmark : bookmarks) {
            System.out.println("Page " + bookmark);
        }
    }
    public void removeBookmark(int page){
        if (bookmarks.contains(page)){
            bookmarks.remove(Integer.valueOf(page));
            System.out.println("Removed bookmark");
        }
        else{
            System.out.println("Page was not bookmarked");
        }
    }

    public boolean containsBookmark(int page) {
        return bookmarks.contains(page);
    }
}
