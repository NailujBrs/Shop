import java.util.ArrayList;
import java.util.List;

public class Order {

    private static int orderNumberCount = 1;
    private int orderNumber;
    private int orderPrice;
    private int shippingCost = 10;

    private int discount = 0;
    private List<Item> items;

    private List<OrderObserver> observers;

    public Order() {
        this.orderNumber = orderNumberCount++;
        this.orderPrice = 0;
        this.items = new ArrayList<Item>();
        this.observers = new ArrayList<OrderObserver>();
    }

    public boolean addItem(Item item) {
        orderPrice += item.getPrice();
        this.items.add(item);

        for (OrderObserver observer : observers) {
            observer.update(this);
        }
        return true;
    }

    public void attach(OrderObserver observer) {
        this.observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        this.observers.remove(observer);
    }

    public int getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(int shippingCost) {
        this.shippingCost = shippingCost;
    }

    public int getTotalPrice() {
        return orderPrice+shippingCost-discount;
    }

    public int getCount() {
        return items.size();
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", orderPrice=" + orderPrice +
                ", items=" + items +
                ", observer=" + observers +
                '}';
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
