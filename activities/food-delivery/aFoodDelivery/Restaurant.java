package aFoodDelivery;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String nameOfRestaurant;
    protected List<MenuItem> menuItems; // It's a Aggregation relationship because All has many of Parts! (and the part it can be independently).
    
    public Restaurant(String nameOfRestaurant){
        this.nameOfRestaurant = nameOfRestaurant;
        this.menuItems = new ArrayList<>(); // when I build the restaurant do an empty menu of items and then add item by item by method (it's more realistic)
    }
    
    public void addMenuItem(MenuItem item){
        this.menuItems.add(item);
    }
    
    public void displayMenu(){
        System.out.println("=== Welcome to " + nameOfRestaurant + "===");
        for(MenuItem item: menuItems){
            item.displayItem();
        }
        System.out.println("===============");
    }
}
