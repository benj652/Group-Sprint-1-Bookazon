public class AudioBook extends Product{
    public AudioBook(String title, String author, int yearPublished, double price) {
        setMediaType("Audio Book");
        setFields(title, author, yearPublished, price);
    }
}
