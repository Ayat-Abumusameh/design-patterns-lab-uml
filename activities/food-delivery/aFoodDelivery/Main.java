package aFoodDelivery;

public class Main {
    public static void main(String[] args) {
        Restaurant myRest = new Restaurant("Elite Bakery");

        MenuItem item1 = new MenuItem("Milk", 2.5f);
        MenuItem item2 = new MenuItem("Coffee", 1.5f);
        MenuItem item3 = new MenuItem("Chocolate Cake", 4.0f);

        myRest.addMenuItem(item1);
        myRest.addMenuItem(item2);
        myRest.addMenuItem(item3);

        myRest.displayMenu();
    }
}
