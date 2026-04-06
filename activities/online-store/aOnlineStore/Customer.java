package aOnlineStore;

public class Customer {
    private String name;
    private ShoppingCart cart;
    
    public Customer(String name){
        this.name = name;
        this.cart = new ShoppingCart();
    }
    
    // I'ts for every customer know that this is his cart, and we can get the items that in his cart
    public ShoppingCart getCart() {
        return cart;
    }
}
