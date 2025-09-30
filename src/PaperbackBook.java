public class PaperbackBook extends Product{

    public PaperbackBook(String title, String author, int yearPublished, double price) {
        setMediaType("Paperback Book");
        setFields(title, author, yearPublished, price);
    }
}