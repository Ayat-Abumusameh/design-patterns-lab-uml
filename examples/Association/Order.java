package Association;

/**
 * Represents an Order.
 * 
 * UML Concept: Association
 * - Order is linked to Customer
 * - Both can exist independently
 */
public class Order {

    private int orderId;

    // Association: Order knows its Customer
    private Customer customer;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
    }
}
