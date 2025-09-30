
import java.util.ArrayList;

public class Bookazon {

    private ArrayList<Product> products;
    private ArrayList<User> users;

    public Bookazon(ArrayList<Product> products, ArrayList<User> users) {
        this.products = products;
        this.users = users;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void viewProducts() {
        for (Product product : products) {
            product.printProductDetails();
        }
    }

    public void viewUsers() {
        for (User user : users) {
            System.out.println(user.getName() + " - Role: " + user.getSubscription());
        }
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void updateProductDetails(Product product, String newTitle, String newAuthor, int newYearPublished, double newPrice) {
        product.setFields(newTitle, newAuthor, newYearPublished, newPrice);
    }

    public void updateRole(User user, String role) {
        user.setSubscription(role);
    }

    
    public static void main(String[] args) {
        
        ArrayList<Product> products = new ArrayList<Product>();
        ArrayList<User> users = new ArrayList<User>();
        Bookazon bookazon = new Bookazon(products, users);
        
        // create products
        bookazon.addProduct(new PaperbackBook("The Great Gatsby", "F. Scott Fitzgerald", 1925, 9.99));
        bookazon.addProduct(new HardcoverBook("To Kill a Mockingbird", "Harper Lee", 1960, 7.99));
        bookazon.addProduct(new PaperbackBook("1984", "George Orwell", 1949, 8.99));

        // create users
        bookazon.addUser(new NormalUser("Alice", new Cart(), new ArrayList<Order>(), new Address(), new Address()));
        bookazon.addUser(new GoldUser("Bob", new Cart(), new ArrayList<Order>(), new Address(), new Address()));
        
        // normal user
        // add products to cart
        bookazon.users.get(0).addToCart(bookazon.products.get(0), 1);
        bookazon.users.get(0).addToCart(bookazon.products.get(1), 2);

        // view cart
        bookazon.users.get(0).viewCart();

        // set shipping address and billing address
        bookazon.users.get(0).setShippingAddress("123 Main St", "", "Springfield", "IL", "62701", "USA");
        bookazon.users.get(0).setBillingAddress("456 Elm St", "", "Springfield", "IL", "62702", "USA");

        // checkout
        bookazon.users.get(0).checkout();

        // view order details
        bookazon.users.get(0).viewOrders();

        // gold user
        // add products to cart
        bookazon.users.get(1).addToCart(bookazon.products.get(0), 1);
        bookazon.users.get(1).addToCart(bookazon.products.get(1), 2);

        // view cart
        bookazon.users.get(1).viewCart();

        // set shipping address and billing address
        bookazon.users.get(1).setShippingAddress("123 Main St", "", "Springfield", "IL", "62701", "USA");
        bookazon.users.get(1).setBillingAddress("456 Elm St", "", "Springfield", "IL", "62702", "USA");

        // checkout
        bookazon.users.get(1).checkout();

        // view order details
        bookazon.users.get(1).viewOrders();
        
    }
}
