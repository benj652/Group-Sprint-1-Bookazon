public class NormalUser extends User {
    public NormalUser(String name) {
        super(name);
    }

    @Override
    public double getDiscount() {
        return 0.0;
    }

}
