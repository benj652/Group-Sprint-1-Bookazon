public class NormalUser extends User {
    final double discount = 0.0;

    public NormalUser(String name) {
        super(name);
    }

    public double getDiscount(){
        return discount;
    }
}
