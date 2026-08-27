public class InventoryService implements OrderObserver {
    @Override public void update(Order order) {
        // TODO (5a): พิมพ์ "Inventory updated for order <orderId>"
        System.out.println("Inventory updated for order " + order.orderId());
    }
}