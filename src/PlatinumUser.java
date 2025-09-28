public class PlatinumUser extends User {
    public PlatinumUser(String name) {
        super(name);
    }

    @Override
    public double getDiscount() {
        return 0.10;
    }
    
}
