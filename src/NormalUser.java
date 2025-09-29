import java.util.List;

public class NormalUser extends User {
    final double discount = 0.0;

    public NormalUser(String name, Cart cart, List<Order> orders, Address shippingAddress, Address billingAddress) {
        super(name, cart, orders, shippingAddress, billingAddress);
    }

    @Override
    public double getDiscount(){
        return discount;
    }
}
