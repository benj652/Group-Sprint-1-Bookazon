import java.util.List;

public class GoldUser extends User {
    final double discount = 0.15;

    public GoldUser(String name, Cart cart, List<Order> orders, Address shippingAddress, Address billingAddress) {
        super(name, cart, orders, shippingAddress, billingAddress);
    }

    @Override
    public double getDiscount(){
        return discount;
    }
}
