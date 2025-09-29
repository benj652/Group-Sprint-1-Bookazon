public class EBook extends Product{
    public EBook(String title, String author, int yearPublished, double price) {
        setMediaType("E-Book");
        setFields(title, author, yearPublished, price);
    }
}