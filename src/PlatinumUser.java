public class PlatinumUser extends User {
    final double discount = 0.10;

    public PlatinumUser(String name) {
        super(name);
    }

    @Override
    public double getDiscount(){
        return discount;
    }
}
