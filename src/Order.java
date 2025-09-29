import java.util.List;

public class Order {
    private String dateCreated;
    private String dateShipped;
    private String userName;
    private String orderStatus;
    private Address shippingAddress;
    private Address billingAddress;
    private List<CartItem> items;
    private double orderPrice;

    public Order(Cart cart, User user) {
        this.items = cart.getItems();
        this.orderPrice = calculatePrice(user);
        this.shippingAddress = new Address();
        this.billingAddress = new Address();
    }

    public void setShippingAddress(String line1, String line2, String city, String state, String zip, String country) {
        shippingAddress.setAllFields(line1, line2, city, state, zip, country);
    }

    public void setBillingAddress(String line1, String line2, String city, String state, String zip, String country) {
        billingAddress.setAllFields(line1, line2, city, state, zip, country);
    }

    public void setOrderStatus(String status) {
        this.orderStatus = status;
    }

    public void setDateCreated(String date) {
        this.dateCreated = date;
    }

    public void setDateShipped(String date) {
        this.dateShipped = date;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public void printOrderDetails() {
        System.out.println("Order Details:");
        System.out.println("Date Created: " + dateCreated);
        System.out.println("Date Shipped: " + dateShipped);
        System.out.println("User Name: " + userName);
        System.out.println("Order Status: " + orderStatus);
        System.out.println("Shipping Address: " + shippingAddress.toString());
        System.out.println("Billing Address: " + billingAddress.toString());
        System.out.println("Order Price: $" + orderPrice);
    }

    public double calculatePrice(User user) {
        double totalPrice = 0.0;

        for (CartItem item : items) {
            totalPrice += item.getTotalPrice();
        }

        double discount = calculateDiscount(totalPrice, user);

        totalPrice -= discount;

        return totalPrice;
    }

    public double calculateDiscount(double amount, User user) {

        double discount = user.getDiscount();

        double discounted_amount = amount * discount;

        discounted_amount = roundToCents(discounted_amount);

        return discounted_amount;
    }

    private double roundToCents(double value) {
        return Math.round(value*100.0)/100.0;
    }

}
