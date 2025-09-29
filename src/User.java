import java.util.ArrayList;
import java.time.LocalDate;

public abstract class User {
    private String name;
    private String subscription;
    private Cart cart;
    private ArrayList<Order> orders;
    private String shippingAddressLine1;
    private String shippingAddressLine2;
    private String shippingAddressCity;
    private String shippingAddressState;
    private String shippingAddressZip;
    private String shippingAddressCountry;
    private String billingAddressLine1;
    private String billingAddressLine2;
    private String billingAddressCity;
    private String billingAddressState;
    private String billingAddressZip;
    private String billingAddressCountry;

    public User(String name) {
        this.name = name;
        this.cart = new Cart();
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSubscription() {
        return subscription;
    }

    public void setSubscription(String role) {
        this.subscription = role;
    }

    public void viewCart() {
        cart.viewCartDetails();
    }

    public void setShippingAddress(String line1, String line2, String city, String state, String zip, String country) {
        this.shippingAddressLine1 = line1;
        this.shippingAddressLine2 = line2;
        this.shippingAddressCity = city;
        this.shippingAddressState = state;
        this.shippingAddressZip = zip;
        this.shippingAddressCountry = country;
    }

    public void setBillingAddress(String line1, String line2, String city, String state, String zip, String country) {
        this.billingAddressLine1 = line1;
        this.billingAddressLine2 = line2;
        this.billingAddressCity = city;
        this.billingAddressState = state;
        this.billingAddressZip = zip;
        this.billingAddressCountry = country;
    }

    public void addToCart(Book book, int quantity) {
        cart.addItem(new CartItem(book.getTitle(), book.getPrice(), quantity));
    }

    public void removeFromCart(Book book) {
        for (CartItem item : cart.getItems()) {
            if (item.getName().equals(book.getTitle())) {
                cart.getItems().remove(item);
                break;
            }
        }
    }

    public void viewOrders() {
        for (Order order : orders) {
            order.printOrderDetails();
        }
    }
    
    public void printUserDetails() {
        System.out.println("User: " + getName() + " - Subscription: " + (getSubscription() != null ? getSubscription() : "N/A"));
    }



public void checkout() {
    Order order = new Order(cart, this);
    if (shippingAddressLine1 == null || billingAddressLine1 == null) {
        throw new IllegalStateException("Shipping and billing addresses must be set before checkout.");
    }
    order.setShippingAddress(shippingAddressLine1, shippingAddressLine2, shippingAddressCity, shippingAddressState, shippingAddressZip, shippingAddressCountry);
    order.setBillingAddress(billingAddressLine1, billingAddressLine2, billingAddressCity, billingAddressState, billingAddressZip, billingAddressCountry);
    order.setOrderStatus("Order Placed");
    order.setDateCreated(LocalDate.now().toString()); 
    order.setUserName(this.name);
    orders.add(order);
}

    public abstract double getDiscount();
}


