import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items;

    public Cart() {
        this(new ArrayList<>());
    }

    public Cart(List<CartItem> items) {
        this.items = items;
    }

    public void addItem(CartItem item) {
        items.add(item);
    }

    public void removeItem(CartItem item) {
        items.remove(item);
    }

    public void updateQuantity(CartItem item, int quantity) {
        item.setQuantity(quantity);
    }

    public void viewCartDetails() {
        System.out.println("Cart Details:");
        items.forEach(CartItem::printDetails);
        System.out.println();
    }

    public List<CartItem> getItems() {
        return items;
    }
}
