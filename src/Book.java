public class Book {
    private final int MIN_VALID_PRICE = 0;
    private final int MIN_VALID_YEAR = 0;

    private String title;
    private String author;
    private int yearPublished;
    private double price;
    private boolean isPaperback;  // true if the book is paperback, false if it is hardcover

    public Book(String title, String author, int yearPublished, double price, boolean isPaperback) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
        this.isPaperback = isPaperback;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isPaperback() {
        return isPaperback;
    }

    public void setPaperback(boolean isPaperback) {
        this.isPaperback = isPaperback;
    }

    public void printBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Price: $" + price);
    }

    public boolean isPriceValid() {
        if (price <= MIN_VALID_PRICE) {
            return false;
        }

        return true;
    }

    public boolean isTitleValid() {
        if(title == null) {
            return false;
        }

        if(title.isEmpty()) {
            return false;
        }

        return true;
    }

    public boolean isAuthorValid() {
        if (author == null) {
            return false;
        }

        if (author.isEmpty()) {
            return false;
        }

        return true;
    }

    public boolean isYearPublishedValid() {
        if (yearPublished <= MIN_VALID_YEAR) {
            return false;
        }

        return true;
    }
}
