import java.util.HashMap;
import java.util.Map;

public class Annotations {
    private Map<Integer, String> annotations;
    private String penColor;
    private double penWidth;
    private String markerColor; 
    private double markerWidth; 

    public Annotations() {
        this.annotations = new HashMap<>();
        this.penColor = "black"; 
        this.penWidth = 1.0; 
        this.markerColor = "black"; 
        this.markerWidth = 1.0;
    }

    // Method to add annotation for the current page
    public void addAnnotation(Book book, String annotation) {
        int currentPage = book.getCurrentPage();
        annotations.put(currentPage, annotation);
    }
    public void draw(){
        System.out.println("Drawing enabled");
    }
    public void selectMarker(){
        System.out.println("Marker selected");
    }
    public void selectPen(){
        System.out.println("Pen selected");
    }
    public void selectEraser(){
        System.out.println("Eraser selected");
    }
    public void postIt(){
        System.out.println("Post it note placed");
    }

    // Method to get annotation for the current page
    public String getAnnotation(Book book) {
        int currentPage = book.getCurrentPage();
        return annotations.getOrDefault(currentPage, "");
    }

    // Method to change pen color
    public void changePen(String color) {
        if (isValidColor(color)) {
            this.penColor = color.toLowerCase();
            System.out.println("Pen color changed to: " + penColor);
        } else {
            System.out.println("Invalid pen color. Please choose red, blue, or black.");
        }
    }

    // Method to set pen width
    public void setPenWidth(double width) {
        if (isValidWidth(width)) {
            this.penWidth = width;
            System.out.println("Pen width changed to: " + penWidth);
        } else {
            System.out.println("Invalid pen width. Please choose a value between 0 and 3.");
        }
    }
    
    public void setMarkerColor(String color) {
        if (isValidMarkerColor(color)) {
            this.markerColor = color.toLowerCase();
            System.out.println("Marker color changed to: " + markerColor);
        } else {
            System.out.println("Invalid marker color. Please choose orange, red, pink, purple, blue, or green.");
        }
    }
  
    public void setMarkerWidth(double width) {
        if (isValidWidth(width)) {
            this.markerWidth = width;
            System.out.println("Marker width changed to: " + markerWidth);
        } else {
            System.out.println("Invalid marker width. Please choose a value between 0.1 and 3.");
        }
    }

   
    private boolean isValidColor(String color) {
        return color.equalsIgnoreCase("red") || color.equalsIgnoreCase("blue") || color.equalsIgnoreCase("black");
    }
  
    private boolean isValidMarkerColor(String color) {
        String[] validColors = {"orange", "red", "pink", "purple", "blue", "green"};
        for (String validColor : validColors) {
            if (color.equalsIgnoreCase(validColor)) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidWidth(double width) {
        return width >= 0.1 && width <= 3.0;
    }
}
