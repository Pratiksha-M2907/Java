public class FoodItemsRunner {
public static void main(String[] args) {

System.out.println(FoodItems.init());
System.out.println(FoodItems.init("Pizza"));
System.out.println(FoodItems.init("Pizza", 12.99));
System.out.println(FoodItems.init("Pizza", 12.99, 5));
System.out.println(FoodItems.init("Pizza", 12.99, 5, "Italian"));
System.out.println(FoodItems.init("Pizza", 12.99, 5, "Italian", new byte[] {1, 2, 3}));
System.out.println(FoodItems.init("Pizza", 12.99, 5, "Italian", new byte[] {1, 2, 3}, "Delicious pizza with various toppings"));
System.out.println(FoodItems.init("Pizza", 12.99, 5, "Italian", new byte[] {1, 2, 3}, "Delicious pizza with various toppings", 100));
System.out.println(FoodItems.init("Pizza", 12.99, 5, "Italian", new byte[] {1, 2, 3}, "Delicious pizza with various toppings", 100, "Cheese, Pepperoni, Sausage"));
System.out.println(FoodItems.init("Pizza", 12.99, 5, "Italian", new byte[] {1, 2, 3}, "Delicious pizza with various toppings", 100, "Cheese, Pepperoni, Sausage", true));
System.out.println(FoodItems.init("Pizza", 12.99, 5, "Italian", new byte[] {1, 2, 3}, "Delicious pizza with various toppings", 100, "Cheese, Pepperoni, Sausage", true, true));
}
}
