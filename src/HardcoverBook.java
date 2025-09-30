public class HardcoverBook extends Product{
    public HardcoverBook(String title, String author, int yearPublished, double price) {
        setMediaType("Hardcover Book");
        setFields(title, author, yearPublished, price);
    }
}
