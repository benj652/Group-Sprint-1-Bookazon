import java.util.List;

public abstract class User {
    private String name;
    private String subscription;
    private Cart cart;
    private List<Order> orders;
    private Address shippingAddress;
    private Address billingAddress;

    public User(String name, Cart cart, List<Order> orders, Address shippingAddress, Address billingAddress) {
        this.name = name;
        this.cart = cart;
        this.orders = orders;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
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
        shippingAddress.setAllFields(line1, line2, city, state, zip, country);
    }

    public void setBillingAddress(String line1, String line2, String city, String state, String zip, String country) {
        billingAddress.setAllFields(line1, line2, city, state, zip, country);
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

    public void checkout() {
        Order order = new Order(cart, this, shippingAddress, billingAddress);
        order.setOrderStatus("Order Placed");
        order.setDateCreated("2024-01-01");
        order.setUserName(this.name);
        orders.add(order);
    }

    public abstract double getDiscount();
}


