/** Decorator (Part 4): ห่อของขวัญ +50 บาท */
public class GiftWrapDecorator extends ShipmentDecorator {
    private static final double GIFT_WRAP_FEE = 50.0;

    public GiftWrapDecorator(Shipment wrappedShipment) {
        super(wrappedShipment);
    }

    @Override public String getInfo() {
        return wrappedShipment.getInfo() + " + Gift Wrapped";
    }

    @Override public double getCost() {
        return wrappedShipment.getCost() + GIFT_WRAP_FEE;
    } 
}
