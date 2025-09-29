import java.util.List;

public class PlatinumUser extends User {
    final double discount = 0.10;

    public PlatinumUser(String name, Cart cart, List<Order> orders, Address shippingAddress, Address billingAddress) {
        super(name, cart, orders, shippingAddress, billingAddress);
    }

    @Override
    public double getDiscount(){
        return discount;
    }
}
