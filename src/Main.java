public class Main {
    public static void main(String[] args) {
        OrderObserver priceObserver = new PriceObserver();
        OrderObserver quantityObserver = new QuantityObserver();

        Order order = new Order();
        order.attach(priceObserver);
        order.attach(quantityObserver);

        order.addItem(new Item("Pen", 100));
        order.addItem(new Item("Pencil", 2));
        order.addItem(new Item("Eraser", 1));
        order.addItem(new Item("Ruler", 50));
        order.addItem(new Item("Ruler", 60));
        order.addItem(new Item("Ruler", 1));

        System.out.println(order.getDiscount());
        System.out.println(order.getShippingCost());
        System.out.println(order.getOrderPrice());
        System.out.println(order.getTotalPrice());
    }
}