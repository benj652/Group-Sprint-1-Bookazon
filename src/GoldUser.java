public class GoldUser extends User {
    public GoldUser(String name) {
        super(name);
    }

    @Override
    public double getDiscount() {
        return 0.15;
    }
    
}
