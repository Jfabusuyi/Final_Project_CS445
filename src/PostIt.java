public class PostIt {
    private int pageNumber;
    private String note;
    private String color;

    public PostIt() {
        this.note = "Blank";
        this.color = "Yellow";
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Color changed to: " + color);
    }

    public void deletePostIt() {
        System.out.println("Post-it note deleted: " + this);
        // Additional cleanup or removal logic can be added here as needed
    }

    @Override
    public String toString() {
        return "PostIt{" +
                "pageNumber=" + pageNumber +
                ", note='" + note + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
