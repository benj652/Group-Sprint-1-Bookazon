public class SilverUser extends User {
    final double discount = 0.05;
    
    public SilverUser(String name) {
        super(name);
    }
    
    @Override
    public double getDiscount(){
        return discount;
    }
}
