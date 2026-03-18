package Association;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Customer in the system.
 * 
 * UML Concept: Association
 * - A Customer "has" Orders
 * - Weak relationship (both can exist independently)
 */
public class Customer {

    private String name;

    // Association: Customer has many Orders
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>(); // initialize list
    }

    /**
     * Add an order to the customer
     */
    public void addOrder(Order order) {
        orders.add(order);
    }
}
