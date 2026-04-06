package aOnlineStore;

public class Main {
    public static void main(String[] args) {
        
        Product p1 = new Product(1, "Laptop", 1200.00);
        Product p2 = new Product(2, "Mouse", 25.50);
        Product p3 = new Product(3, "Keyboard", 45.00);

        ShoppingCart myCart = new ShoppingCart();

        myCart.addProduct(p1);
        myCart.addProduct(p2);
        myCart.addProduct(p3);

        myCart.showCartDetails();

        myCart.removeProduct(p2); // سنحذف الماوس مثلاً

        myCart.showCartDetails();
        
    }
}
