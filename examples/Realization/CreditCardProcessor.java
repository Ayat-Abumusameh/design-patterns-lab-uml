package Realization;

/**
 * Implements PaymentProcessor interface
 * 
 * UML Concept: Realization
 * - Provides actual implementation
 */
public class CreditCardProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment: " + amount);
    }
}
