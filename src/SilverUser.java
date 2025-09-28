public class SilverUser extends User {
    public SilverUser(String name) {
        super(name);
    }

    @Override
    public double getDiscount() {
        return 0.05;
    }
    
}
