public class PriceObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        if (order.getOrderPrice() > 200) {
            order.setDiscount(20);
        }
    }
}
