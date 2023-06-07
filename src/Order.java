import java.util.List;

public class Order {
    private int orderPrice;
    private List<Item> items;

    private OrderObserver observer;

    public Order() {

    }

    public boolean addItem(Item item) {
        return false;
    }

    public void attach(OrderObserver observer) {

    }

    public void detach(OrderObserver observer) {

    }

    public int getTotalPrice() {
        return 0;
    }

    public int getCount() {
        return 0;
    }

    public String toString() {
        return "";
    }


}
