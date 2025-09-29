public class DVD extends Product{
    public DVD (String title, String author, int yearPublished, double price) {
        setMediaType("DVD");
        setFields(title, author, yearPublished, price);
    }
}