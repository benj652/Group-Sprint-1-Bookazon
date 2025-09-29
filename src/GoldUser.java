public class GoldUser extends User {
    final double discount = 0.15;

    public GoldUser(String name) {
        super(name);
    }

    public double getDiscount(){
        return discount;
    }
}
