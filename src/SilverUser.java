import java.util.List;

public class SilverUser extends User {
    final double discount = 0.05;
    
    public SilverUser(String name, Cart cart, List<Order> orders, Address shippingAddress, Address billingAddress) {
        super(name, cart, orders, shippingAddress, billingAddress);
    }
    
    @Override
    public double getDiscount(){
        return discount;
    }
}
