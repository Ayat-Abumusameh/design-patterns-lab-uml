package aFoodDelivery;

public class MenuItem {
    private String nameOfItem;
    private float priceOfItem;
    private int quantity;
    
//    protected Restaurant restaurantName;
    
    public MenuItem(String nameOfItem, float priceOfItem, int quantity){
        this.nameOfItem = nameOfItem;
        this.priceOfItem = priceOfItem;
        this.quantity = quantity;
    }

    // It's better to change the value according of methods like updatPrice() not by setters, if you need to change build setter of method
    public String getNameOfItem() {
        return nameOfItem;
    }

    public float getPriceOfItem() {
        return priceOfItem;
    }

    public int getQuantity() {
        return quantity;
    }
    
    // I mean like this instead of setter
    public void updatePrice(float newPrice) {
        if (newPrice > 0) {
            this.priceOfItem = newPrice;
        }
    }
}
