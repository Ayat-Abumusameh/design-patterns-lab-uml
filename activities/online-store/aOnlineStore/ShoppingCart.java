package aOnlineStore;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart { // it's Aggregation relationship
    private List<Product> products;
    
    public ShoppingCart(){
        this.products = new ArrayList<>();
    }
    
    public void addProduct(Product product){
        this.products.add(product);
    }
    
    public void removeProduct(Product p) {
        if (products.contains(p)) {
            products.remove(p);
            System.out.println("Product " + p.getName()+ " removed from cart.");
        } else {
            System.out.println("Product not found in cart.");
        }
    }
    
    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }
    
    public void showCartDetails() {
        System.out.println("--- Shopping Cart Summary ---");
        for (Product p : products) {
            p.displayProductInfo();
        }
        System.out.println("Total Amount: $" + calculateTotal());
        System.out.println("----------------------------");
    }
}
